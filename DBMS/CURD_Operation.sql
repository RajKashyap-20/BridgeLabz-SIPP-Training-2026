create database if not exists DEMO;
create table if not exists student(
id int primary key);
show databases;
USE DEMO;
Alter TABLE student
  ADD name char(20) not null,
  add rollno int(2),
  add marks int(2);
  INSERT INTO student(id,name,rollno,marks) values
  (4,'kishan',23,45),
  (3,'ram',76,97);
  select * from student;