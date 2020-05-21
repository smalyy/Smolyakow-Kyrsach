CREATE DATABASE Windoor

GO
USE Windoor

CREATE TABLE Users (
userId INT IDENTITY(1, 1) NOT NULL,
login NVARCHAR(60) NOT NULL,
password NVARCHAR(64) NOT NULL,
eMail NVARCHAR(64) NOT NULL,
phoneNumber NVARCHAR(13) NOT NULL,
fName NVARCHAR(64) NOT NULL,
sName NVARCHAR(64) NOT NULL,
permision INT NOT NULL DEFAULT(0),
CONSTRAINT PK_Users PRIMARY KEY(userId))

CREATE TABLE Product (
productId INT IDENTITY(1,1) NOT NULL,
articule NVARCHAR(60) NOT NULL,
userId INT NOT NULL,
color NVARCHAR(60) NOT NULL,
supplier NVARCHAR(60) NOT NULL,
price DECIMAL(32,2) NOT NULL,
name NVARCHAR(512) NOT NULL,
type NVARCHAR(60) NOT NULL,
height INT NOT NULL,
width INT NOT NULL,
depth INT NOT NULL,
CONSTRAINT PK_Product PRIMARY KEY(productId),
CONSTRAINT FK_Product_User FOREIGN KEY(userId)
	REFERENCES Users(userId)
	ON DELETE CASCADE
	ON UPDATE CASCADE)

INSERT INTO Users(login, password, eMail, phoneNumber, fName, sName, permision) VALUES ('admin', 'admin', 'admin@admin.com', '+380977777777', 'admin', 'admin', '1'),
('Smaly', '123456', 'smaly@gmail.com', '+380911111111', 'Игорь', 'Смоляков', '0')

