-- 1. Create a database called school

create database school;

use school;

-- 2. Create Student table with studentId, first_name, 
-- last_name and address. Make studentId the primary key

create table Student
(
student_id int not null,
first_name varchar (100),
last_name varchar (100),
Address varchar (100),
primary key (student_id)
);
-- 3. Create Course table with courseId, course_name, course_credit. Use courseId as primary key

create table Course
(
Course_id int not null,
course_name varchar (100),
course_credit int not null,
primary key (Course_id)
);

-- Insert 5 rows in each table

insert into Student 
(student_id, first_name, last_name, address)
values ('1', 'Abduselam', 'Abdelkadir', 'Minnesota'),
('2', 'Muez', 'Feleke', 'Texas'), ('3' ,'Agebnesh', 'Mehari', 'Idaho'), 
('4', 'Johan', 'Robert', 'Dallas'), ('5', 'Biruk', 'DJ', 'North Dakota');

insert into Course
(course_id, Course_name, Course_credit)
values ('100', 'Java', '4'), ('200', 'Pyton', '4'), ('300', 'Logic', '3'), 
('400', 'Compostion', '4'), ('500', 'MYSQL', '6');

-- Retrieve all rows from each table

select * from student;
select * from Course;

-- Retrieve a row whose id number is 3

select * from student
where student_id = 3;

select * from Course
where Course_id = 3;

-- Update any column in any row

update student
set address = 'Chicago'
where student_id = 5;

update course 
set course_name = 'introduction to computer'
where course_id = 400;

-- Delete specific rows in each table using their ids or other column values

delete from student
where student_id= 5;

delete from Course
where course_id= 200

