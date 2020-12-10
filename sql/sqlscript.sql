REM   Script: Activity_1_2_3_4_5
REM   Activity 1,2,3,4,5

ALTER TABLE salesman ADD grade int;

create table salesman(  
salesman_id int,  
name varchar(20),  
city varchar(20),  
commission int);

INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

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

ALTER TABLE salesman ADD grade int;

ALTER TABLE salesman ADD column grade_2 int;

ALTER TABLE salesman ADD column grade_2 int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE city='Rome';

UPDATE salesman SET grade=300 WHERE name='James Hoog';

UPDATE salesman SET name='Pierre' WHERE name='McLyon';

