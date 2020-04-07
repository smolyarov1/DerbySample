CREATE TABLE Employees(employee_id int PRIMARY KEY,first_name varchar(20) NOT NULL,last_name varchar(20) NOT NULL,city varchar(20) NOT NULL,address varchar(30),email varchar (30));
CREATE TABLE Salaries(employee_id int,salary int,date date);
insert into Employees (employee_id,first_name,last_name,city,address,email) VALUES(307429680,'alex','smoly','Tel Aviv', 'Ziatli 24', 'amigo123@yahoo.com');
insert into Employees (employee_id,first_name,last_name,city,address,email) VALUES(200144938,'maayan','partner','Holon', 'HIT 1', 'familio@gmail.com');
