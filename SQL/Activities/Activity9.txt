---Activity9---
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

SELECT c.customer_name AS "Customer Name", c.city, s.salesman_name AS "Salesman", s.commission FROM customers c
INNER JOIN salesman s ON c.salesman_id=s.salesman_id;

SELECT c.customer_name, c.city, c.grade, s.salesman_name AS "Salesman", s.salesman_city FROM customers c 
LEFT OUTER JOIN salesman s ON c.salesman_id=s.salesman_id WHERE c.grade<300 
ORDER BY c.customer_id;

SELECT c.customer_name AS "Customer Name", c.city, s.salesman_name AS "Salesman", s.commission FROM customers c 
INNER JOIN salesman s ON c.salesman_id=s.salesman_id 
WHERE s.commission>12;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", 
c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;