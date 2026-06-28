-- Small, self-contained sample dataset.
INSERT INTO Sellers (name) VALUES ('Ana'),('Bruno'),('Carla'),('Diego');

INSERT INTO Products (product, price) VALUES
 ('Notebook', 3500.00),('Smartphone', 2200.00),('Headphones', 350.00),
 ('Keyboard', 180.00),('Monitor', 1200.00),('Mouse', 90.00);

INSERT INTO Customers (customer, state, sex, status) VALUES
 ('Cliente SP1','SP','M','active'),('Cliente SP2','SP','F','active'),
 ('Cliente RJ1','RJ','F','active'),('Cliente RJ2','RJ','M','inactive'),
 ('Cliente MG1','MG','M','active'),('Cliente MG2','MG','F','active'),
 ('Cliente RS1','RS','F','active'),('Cliente SP3','SP','M','active');

INSERT INTO Sales (seller_id, customer_id, sale_date) VALUES
 (1,1,'2024-01-10'),(2,3,'2024-01-15'),(3,5,'2024-02-03'),
 (1,2,'2024-02-20'),(4,7,'2024-03-05'),(2,4,'2024-03-18'),
 (3,8,'2024-03-25'),(1,6,'2024-04-02'),(4,1,'2024-04-19'),(2,5,'2024-05-07');

-- product_id, sale_id, quantity, unit_price, line_total, discount
INSERT INTO SaleItems VALUES
 (1,1,1,3500,3500,0),(3,1,2,350,700,0),
 (2,2,1,2200,2200,100),(6,2,1,90,90,0),
 (5,3,2,1200,2400,0),(4,3,1,180,180,0),
 (2,4,1,2200,2200,0),
 (1,5,1,3500,3500,200),(3,5,1,350,350,0),
 (4,6,3,180,540,0),(6,6,2,90,180,0),
 (5,7,1,1200,1200,0),
 (2,8,1,2200,2200,0),(3,8,1,350,350,0),
 (1,9,1,3500,3500,0),
 (5,10,1,1200,1200,0),(4,10,2,180,360,0);

-- derive each sale's total from its items (net of discount)
UPDATE Sales SET total = (
    SELECT COALESCE(SUM(line_total - discount), 0)
    FROM SaleItems WHERE SaleItems.sale_id = Sales.sale_id
);
