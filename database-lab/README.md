# 🗄️ Database Lab

SQL scripts and containerized database environments from the **Databases Lab** course (UFMS): schema modeling (DDL), data loading (DML), queries, triggers, and spinning up DBMSs with Docker (PostgreSQL and MySQL).

## Contents
| File | Description |
|---|---|
| `1.CreateTable.sql` | DDL — table creation (a **sales** model: customers, products, sellers, sales, sale items). |
| `2..6.Insert*.sql` | DML — sample data load per table. |
| `company.sql` | Classic *company* schema (modeling exercise). |
| `triggers.sql` | Example triggers. |
| `SQLite.sql` | SQLite variant of the scripts. |
| `Queries/`, `Tarefa 29-10/` | Queries and exercises. |
| `Prova LBD/` | Practical exam (`loja_venda_automoveis.sql` + diagram). |
| `postgresql.yml` | Docker Compose: **PostgreSQL + pgAdmin**. |
| `mysql.yml` | Docker Compose: **MySQL + phpMyAdmin + Adminer**. |
| `FK.png`, `Insert.png` | Model diagrams. |

## How to run (containers)
```bash
cp .env.example .env          # set DB passwords

# PostgreSQL + pgAdmin  (pgAdmin at http://localhost:8090)
docker compose -f postgresql.yml up -d

# or MySQL + phpMyAdmin (phpMyAdmin at http://localhost:8183)
docker compose -f mysql.yml up -d

# then apply the scripts in order: 1.CreateTable.sql, then 2..6.Insert*.sql
```

## Stack
SQL (PostgreSQL · MySQL · SQLite) · Docker Compose
