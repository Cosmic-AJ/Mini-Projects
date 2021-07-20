To use this program in your system please follow the following instructions:-

1. Install NetBeans 8.2 or lower. (Use JDK 8 & JRE java version "1.8.0_261"
Java(TM) SE Runtime Environment (build 1.8.0_261-b12) )
   
2. Install mysql version of 5.6 or 5.7 (Choose port 3309 if you have 3306 or vice versa).
   and make sure to choose password as "root".

3. After installing mySql run the following commands:
	
	
	create database javafx_blood_bank;

	use javafx_blood_bank

	create table donor(
	DID      int    Primary Key,
	donorname  varchar(15),
	bloodgroup varchar(15,
	phoneno    varchar(15),
	quantity   double,
	gift       varchar(10),
	DOD        date  );
	
	create table login(
	username varchar(35) Primary Key,
	password varchar(30) );

	create table stock(
	bloodgroup varchar(5)  Primary Key,
	quantity double );

	INSERT INTO STOCK VALUES ('A+',0);
	INSERT INTO STOCK VALUES ('A-',0);
	INSERT INTO STOCK VALUES ('AB+',0);
	INSERT INTO STOCK VALUES ('AB-',0);
	INSERT INTO STOCK VALUES ('B+',0);
	INSERT INTO STOCK VALUES ('B-',0);
	INSERT INTO STOCK VALUES ('O+',0);
	INSERT INTO STOCK VALUES ('O-',0);

 
 4. Now go to the netbeans File-> Open Project -> Select Project .
	
 5. Now compile the project and run. 