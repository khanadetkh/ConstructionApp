CREATE TABLE contract (
contractID int not null,
owner char (20),
budget decimal (10,2),
propertylength int,
propertywidth int,
startdate date,
enddate date,
primary key (contractID)
);
INSERT INTO contract VALUES (501,'Jimmy',15000000,150,300,'2018-02-20','2018-12-30');
INSERT INTO contract VALUES (502,'Katty',50000000,200,400,'2017-06-23','2018-07-22');
SELECT * FROM contract;




