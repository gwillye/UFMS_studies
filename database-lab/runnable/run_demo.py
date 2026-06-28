"""Runnable SQLite demo of the sales database (no Docker needed).

Builds the schema, loads sample data, and runs the analytical queries from
analytics.sql — printing each result as a table. Pure standard library
(`sqlite3`), so it runs anywhere with:

    python run_demo.py
"""
import sqlite3
from pathlib import Path

HERE = Path(__file__).parent


def read(name: str) -> str:
    return (HERE / name).read_text(encoding="utf-8")


def parse_queries(sql: str):
    """Split analytics.sql into (title, query) pairs by '-- Q:' headers."""
    blocks, title, buf = [], None, []
    for line in sql.splitlines():
        if line.strip().startswith("-- Q:"):
            if title and "".join(buf).strip():
                blocks.append((title, "\n".join(buf).strip()))
            title, buf = line.split("-- Q:", 1)[1].strip(), []
        elif not line.strip().startswith("--"):
            buf.append(line)
    if title and "".join(buf).strip():
        blocks.append((title, "\n".join(buf).strip()))
    return blocks


def print_table(cols, rows):
    widths = [max(len(str(c)), *(len(str(r[i])) for r in rows)) if rows else len(str(c))
              for i, c in enumerate(cols)]
    line = "  ".join(str(c).ljust(widths[i]) for i, c in enumerate(cols))
    print("  " + line)
    print("  " + "  ".join("-" * w for w in widths))
    for r in rows:
        print("  " + "  ".join(str(v).ljust(widths[i]) for i, v in enumerate(r)))


def main():
    con = sqlite3.connect(":memory:")
    con.execute("PRAGMA foreign_keys = ON")
    con.executescript(read("schema.sql"))
    con.executescript(read("seed.sql"))

    n_sales = con.execute("SELECT COUNT(*) FROM Sales").fetchone()[0]
    total = con.execute("SELECT ROUND(SUM(total),2) FROM Sales").fetchone()[0]
    print(f"Loaded sample DB: {n_sales} sales, total revenue R$ {total}\n")

    for title, query in parse_queries(read("analytics.sql")):
        cur = con.execute(query)
        cols = [d[0] for d in cur.description]
        rows = cur.fetchall()
        print(f"### {title}")
        print_table(cols, rows)
        print()

    # tiny invariant check so the project is verifiable, not just runnable
    by_seller = con.execute("SELECT ROUND(SUM(total),2) FROM Sales").fetchone()[0]
    by_items = con.execute(
        "SELECT ROUND(SUM(line_total - discount),2) FROM SaleItems").fetchone()[0]
    assert abs(by_seller - by_items) < 0.01, "sales totals != sum of items"
    print("self-check: OK (sales totals reconcile with sale items)")
    con.close()


if __name__ == "__main__":
    main()
