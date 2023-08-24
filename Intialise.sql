Create Database week2_SeanM;

Use week2_SeanM;

CREATE TABLE Employee (
	EmployeeID SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
	Name varchar(60),
	Salary decimal,
	Bank_Acc_Number char(8),
	NI_Number char(9),
	PRIMARY KEY (EmployeeID)	
);

create Table DeliveryEmployee ( 
    EmployeeID SMALLINT UNSIGNED NOT NULL,
    PRIMARY KEY (EmployeeID),
    constraint fk_employeeid foreign key (EmployeeID)
    references Employee(EmployeeID)
);

