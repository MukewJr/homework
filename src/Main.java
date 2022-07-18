public class Main {
    public static void main(String[] args) {

        SELECT * FROM customer WHERE country LIKE 'Canada';
        SELECT DISTINCT country FROM customer;
        SELECT COUNT(id) FROM orders;
        SELECT max(total_amount) FROM orders;
        SELECT sum(quantity) FROM order_item;
        SELECT sum(total_amount) FROM orders WHERE order_date BETWEEN '2014-01-01' AND '2014-12-31';
        SELECT avg(unit_price) FROM order_item;
//SELECT first_name from customer on customer.id = o.customer_id avg(total_amount) FROM orders group by customer_id;
        SELECT * FROM customer WHERE country LIKE 'Brazil' OR country lIKE 'Spain';
        SELECT * FROM orders where order_date BETWEEN '2013-01-01' AND '2013-12-31' AND total_amount<100;
        SELECT * FROM customer WHERE country LIKE 'Germany' OR country lIKE 'Spain' OR country LIKE 'Italy' OR country LIKE 'France' ORDER BY country;
        SELECT country from customer,supplier where customer.country=supplier.country;
        SELECT * FROM customer WHERE first_name LIKE 'Jo%';
        SELECT * FROM customer WHERE first_name LIKE '%a' AND length(first_name)=4;
        SELECT count(first_name),country FROM customer GROUP BY   country;
        SELECT  count(first_name),country FROM customer GROUP BY   country ;

        SELECT customer.id,  (select sum(total_amount) from orders) from customer inner join orders on orders.customer_id = customer.id  group by customer.id;


    }
}