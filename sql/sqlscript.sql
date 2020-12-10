REM   Script: Activity_1_2_3
REM   Activity1,2,3

create table salesman( 
salesman_id int, 
name varchar(20), 
city varchar(20), 
commission int);

describe salesman


create table salesman( 
salesman_id int primary key, 
name varchar(20), 
city varchar(20), 
commission int);

INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES 
    (5002, 'Nail Knite', 'Paris', 13), 
    (5005, 'Pit Alex', 'London', 11),  
    (5006, 'McLyon', 'Paris', 14),  
    (5007, 'Paul Adam', 'Rome', 13), 
    (5003, 'Lauson Hen', 'San Jose', 12);

INSERT INTO salesman VALUES 
    (5002, 'Nail Knite', 'Paris', 13), 
    (5005, 'Pit Alex', 'London', 11),  
    (5006, 'McLyon', 'Paris', 14),  
    (5007, 'Paul Adam', 'Rome', 13), 
    (5003, 'Lauson Hen', 'San Jose', 12);

INSERT INTO salesman VALUES 
    (5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES 
    (5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES 
       (5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES 
      (5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman VALUES 
      (5003, 'Lauson Hen', 'San Jose', 12);

Select * from salesman;

SELECT salesman_id, city FROM salesman;

SELECT * FROM salesman WHERE city='Paris';

SELECT salesman_id, commission FROM salesman WHERE name='Paul Adam';

