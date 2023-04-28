DB-Structure created by JPA-Hibernate-DDL
=========================================
DB-NAME:	many_to_one
DBMS:		MySql


use many_to_one;

-- einen User für Springboot anlegen
create user 'springuser'@'%' identified by '#EBIT2022'; -- Creates the user

-- dem Springboot User alle Rechte auf die gerade angelegte DB geben
grant all on many_to_one.* to 'springuser'@'%';


select * from book;
select * from student;