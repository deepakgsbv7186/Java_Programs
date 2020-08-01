create table personal_details
(
	name char(10),
	age int,
	department char(10)
);
select * from personal_details;
insert into personal_details values('Appy',20,'Software');
insert into personal_details (name) values( 'Happy');
create table Customer
(
	Customer_ID int identity(201900,10) primary key,
	Customer_Name char(20),
	Contact_Name char(20),
	Postal_Address char(30),
	City char(20),
	Postal_Code int,
	Country char(20)
);

drop table Customer;

insert into Customer values('Shyam','Ram','F-23 Anand Vihar','Delhi',10038,'India');
insert into Customer values('The Avengers','Loki','','New York',10038,'USA');
insert into Customer values('Age of Ultron','Ultron','56 Banz','Zorkoiva',10038,'Italy');
insert into Customer values('Infinity War','Thanos','0 Space War','New York',10038,'Titon');
insert into Customer values('Endgame','Thanos','','jyrieiiiwou',14366,'Titon');
insert into Customer (Customer_Name,Contact_Name,City,Postal_Code,Country) 
values('Far from Home','SpiderMan','New York',3455,'USA');

select * from Customer;

select * from Customer where Postal_Address is not NULL;
