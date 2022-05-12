REM   Script: Session 01
REM   Sql activities

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Select salesman_id,order_date, Max(purchase_amount) as "highest purchase amount" from orders where order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') 
Group By salesman_id,order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

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

Create table salesman(  
salesman_id int,  
salesman_name varchar2(20),  
salesman_city varchar2(20),  
commission int  
);

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

Select customers.customer_name as "customer name",salesman.salesman_name from customers  
inner join salesman on customers.customer_id = salesman.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

Select customers.customer_name as "customer name",salesman.salesman_name from customers  
inner join salesman on customers.salesman_id = salesman.salesman_id;

select customer_name,salesman_name from customers left join salesman on customers.salesman_id = salesman.salesman_id 
where customers.grade<300 
order by customer_id;

select customers.customer_name,salesman.salesman_name,customers.grade from customers left join salesman on customers.salesman_id = salesman.salesman_id 
where customers.grade<300 
order by customer_id;

select customers.customer_name,salesman.salesman_name,customers.grade from customers left join salesman on customers.salesman_id = salesman.salesman_id 
where salesman.commission>12 
order by customers.customer_id;

select customers.customer_name,salesman.salesman_name,customers.grade, salesman.commission from customers inner join salesman on customers.salesman_id = salesman.salesman_id 
where salesman.commission>12 
order by customers.customer_id;

select orders.order_no,orders.order_date,orders.purchase_amount,customers.customer_name,salesman.salesman_name,salesman.commission from orders  
inner join customers on orders.customer_id = customers_id 
inner join salesman on orders.salesman_id = salesman.salesman_id;

select orders.order_no,orders.order_date,orders.purchase_amount,customers.customer_name,salesman.salesman_name,salesman.commission from orders  
inner join customers on orders.customer_id = customer_id 
inner join salesman on orders.salesman_id = salesman.salesman_id;

select orders.order_no,orders.order_date,orders.purchase_amount,customers.customer_name,salesman.salesman_name,salesman.commission from orders  
inner join customers on orders.customer_id = customers.customer_id 
inner join salesman on orders.salesman_id = salesman.salesman_id;

Select * from orders where salesman_id= (select DISTINCT salesman_id FROM orders WHERE customer_id=3007);

Select * from orders  
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

Select * from orders  
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

Select * from orders  
WHERE salesman_id = (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

Select Count(*), grade from customers having grade>(select avg(grade) from customers where salesman_city = 'New York');

Select Count(*), grade from customers having grade>(select avg(grade) from customers where city = 'New York') 
;

Select Count(*), grade from customers group by grade having grade>(select avg(grade) from customers where city = 'New York');

Select grade,Count(*)  from customers group by grade having grade>(select avg(grade) from customers where city = 'New York');

Select * from orders where salesman_id =(select salesman_id where commission = (select max(commission) from salesman));

Select * from orders where salesman_id =(select salesman_id from salesman where commission = (select max(commission) from salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT * FROM salesman;

columns 


SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

Alter table salesman add grade int;

Update salesman Set grade = 100;

SELECT * FROM salesman;

Update salesman Set grade = 200 where salesman_city='Rome' 
 
Update salesman Set grade = 300 where salesman_name='James Hoog' 
 
Update salesman Set salesman_name = 'Pierre' where salesman_name = 'McLyon';

Update salesman Set grade = 200 where salesman_city='Rome' 
;

Update salesman Set grade = 300 where salesman_name='James Hoog' 
;

Update salesman Set salesman_name = 'Pierre' where salesman_name = 'McLyon' 
;

SELECT * FROM salesman;

Select Distinct salesman_id from orders;

Select order_no,order_date from orders order by order_date;

Select order_no,purchase_amount from orders order by purchase_amount desc;

Select * from orders where purchase_amount < 500;

Select * from orders where purchase_amount Between 1000 And 2000;

Select Sum(purchase_amount) as "Total sum" from orders 
;

Select avg(purchase_amount) as "Average" from orders 
;

Select Max(purchase_amount) as "Maximum" from orders 
;

select MIN(purchase_amount) AS "Minumum" from orders;

Select Count(Distinct(salesman_id)) as "total count" from orders 
 
;

Select customer_id, Max(purchase_amount) as "highest purchase amount" from orders  
Group By customer_id;

Select salesman_id,order_date, Max(purchase_amount) as "highest purchase amount" from orders where order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') 
Group By salesman_id,order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

