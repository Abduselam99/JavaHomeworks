--  Create the DB ,tables and load the data in the example

create database Day_Four_DB;
use Day_Four_DB;

-- Q1 
-- -----------------------------------------------------------------------------------------------------------
-- select first and last name of employees with salaries greater than 10000 and hired after 1998 
-- and do not include employees from Administration and the employees should be from Australia or Canada.

select  employees.first_name, employees.last_name
from employees 
inner join departments on employees.department_id = departments.department_id
where  salary > 10000 and hire_date > '1998-01-01' and not(departments.department_id = 1);


-- Q2
-- -----------------------------------------------------------------------------------------------------------
-- Select the first 6 higly paid employees who are Accountants,Administration Assistant

select * from employees
inner join departments on employees.department_id = departments.department_id
where departments.department_id in ( 1,  11) 
order by salary desc limit 0,6;

-- Q3 
-- -----------------------------------------------------------------------------------------------------------
-- Select dependents of the employees whose salaries are between 10000 and 20000

select * from dependents
inner join employees on dependents.employee_id = employees.employee_id
where salary between 10000 and 20000