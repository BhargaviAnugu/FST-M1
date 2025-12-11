--- Activity7----
select sum(purchase_amount) as total_purchaseAmount from Orders;
select avg(purchase_amount) as avg_purchaseAmount from Orders;
select max(purchase_amount) as highest_purchaseAmount from Orders;
select min(purchase_amount) as lowest_purchaseAmount from Orders;
select count(distinct salesman_id) as NumberOfSalesmen from Orders;