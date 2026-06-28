-- Sales database schema (SQLite port of the original PostgreSQL model).
PRAGMA foreign_keys = ON;

CREATE TABLE Sellers (
    seller_id INTEGER PRIMARY KEY AUTOINCREMENT,
    name      TEXT NOT NULL
);

CREATE TABLE Products (
    product_id INTEGER PRIMARY KEY AUTOINCREMENT,
    product    TEXT NOT NULL,
    price      REAL NOT NULL
);

CREATE TABLE Customers (
    customer_id INTEGER PRIMARY KEY AUTOINCREMENT,
    customer    TEXT NOT NULL,
    state       TEXT,
    sex         TEXT,
    status      TEXT
);

CREATE TABLE Sales (
    sale_id     INTEGER PRIMARY KEY AUTOINCREMENT,
    seller_id   INTEGER REFERENCES Sellers(seller_id),
    customer_id INTEGER REFERENCES Customers(customer_id),
    sale_date   TEXT,                 -- ISO 'YYYY-MM-DD'
    total       REAL DEFAULT 0
);

CREATE TABLE SaleItems (
    product_id  INTEGER REFERENCES Products(product_id) ON DELETE RESTRICT,
    sale_id     INTEGER REFERENCES Sales(sale_id) ON DELETE CASCADE,
    quantity    INTEGER NOT NULL,
    unit_price  REAL NOT NULL,
    line_total  REAL NOT NULL,
    discount    REAL DEFAULT 0,
    PRIMARY KEY (product_id, sale_id)
);
