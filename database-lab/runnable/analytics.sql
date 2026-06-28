-- Analytical queries (joins + aggregations). Parsed by run_demo.py via "-- Q:" headers.

-- Q: Revenue and #sales per seller
SELECT s.name AS seller,
       COUNT(v.sale_id) AS sales,
       ROUND(SUM(v.total), 2) AS revenue
FROM Sellers s
JOIN Sales v ON v.seller_id = s.seller_id
GROUP BY s.name
ORDER BY revenue DESC;

-- Q: Top products by revenue
SELECT p.product,
       SUM(i.quantity) AS units,
       ROUND(SUM(i.line_total - i.discount), 2) AS revenue
FROM SaleItems i
JOIN Products p ON p.product_id = i.product_id
GROUP BY p.product
ORDER BY revenue DESC
LIMIT 5;

-- Q: Revenue by customer state
SELECT c.state,
       COUNT(DISTINCT v.sale_id) AS sales,
       ROUND(SUM(v.total), 2) AS revenue
FROM Sales v
JOIN Customers c ON c.customer_id = v.customer_id
GROUP BY c.state
ORDER BY revenue DESC;

-- Q: Average ticket (overall)
SELECT ROUND(AVG(total), 2) AS avg_ticket,
       ROUND(MIN(total), 2) AS min_ticket,
       ROUND(MAX(total), 2) AS max_ticket
FROM Sales;

-- Q: Monthly revenue trend
SELECT substr(sale_date, 1, 7) AS month,
       ROUND(SUM(total), 2) AS revenue
FROM Sales
GROUP BY month
ORDER BY month;
