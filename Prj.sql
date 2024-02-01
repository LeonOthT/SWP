drop database BookingParty

CREATE DATABASE BookingParty;USE BookingParty;

CREATE TABLE Account (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL,
    roleId INT
);

CREATE TABLE Hosts (
    host_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    name CHAR(50) CHARACTER SET UTF8MB4,
    phone VARCHAR(250) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Account(user_id)
);

CREATE TABLE Schedule (
    Schedule_id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    busy BIT
);

CREATE TABLE Schedule_Detail (
    schedule_Detail_id INT AUTO_INCREMENT PRIMARY KEY,
    schedule_id INT,
    host_id INT,
    FOREIGN KEY (schedule_id) REFERENCES Schedule(Schedule_id),
    FOREIGN KEY (host_id) REFERENCES Hosts(host_id)
);

CREATE TABLE Location (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    host_id INT,
    address CHAR(250) CHARACTER SET UTF8MB4,
    name CHAR(250) CHARACTER SET UTF8MB4,
    FOREIGN KEY (host_id) REFERENCES Hosts(host_id)
);

CREATE TABLE Guest (
    guest_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    phone VARCHAR(250),
    name CHAR(250) CHARACTER SET UTF8MB4,
    gender VARCHAR(250),
    FOREIGN KEY (user_id) REFERENCES Account(user_id)
);

CREATE TABLE Package (
    package_id INT AUTO_INCREMENT PRIMARY KEY,
    location_id INT,
    name CHAR(250) CHARACTER SET UTF8MB4,
    price FLOAT,
    desctiption CHAR(250) CHARACTER SET UTF8MB4,
    FOREIGN KEY (location_id) REFERENCES Location(location_id)
);

CREATE TABLE Cart (
    cart_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_id INT,
    package_id INT,
    quantity INT,
    total_price FLOAT,
    FOREIGN KEY (guest_id) REFERENCES Guest(guest_id),
    FOREIGN KEY (package_id) REFERENCES Package(package_id)
);

CREATE TABLE Service (
    service_id INT AUTO_INCREMENT PRIMARY KEY,
    location_id INT,
    name CHAR(250) CHARACTER SET UTF8MB4,
    price FLOAT,
    description CHAR(250) CHARACTER SET UTF8MB4,
    FOREIGN KEY (location_id) REFERENCES Location(location_id)
);

CREATE TABLE ServiceOfPackage (
    service_of_package_id INT AUTO_INCREMENT PRIMARY KEY,
    service_id INT,
    package_id INT,
    FOREIGN KEY (service_id) REFERENCES Service(service_id),
    FOREIGN KEY (package_id) REFERENCES Package(package_id)
);

CREATE TABLE Feedback (
    feedback_id INT AUTO_INCREMENT PRIMARY KEY,
    service_id INT,
    guest_id INT,
    description CHAR(250) CHARACTER SET UTF8MB4,
    feedback_date DATE,
    FOREIGN KEY (service_id) REFERENCES Service(service_id),
    FOREIGN KEY (guest_id) REFERENCES Guest(guest_id)
);

CREATE TABLE Service_Detail (
    service_detail_id INT AUTO_INCREMENT PRIMARY KEY,
    cart_id INT,
    service_id INT,
    FOREIGN KEY (cart_id) REFERENCES Cart(cart_id),
    FOREIGN KEY (service_id) REFERENCES Service(service_id)
);

CREATE TABLE Bill (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    cart_id INT,
    FOREIGN KEY (cart_id) REFERENCES Cart(cart_id)
);

CREATE TABLE Bill_Detail (
    bill_detail_id INT AUTO_INCREMENT PRIMARY KEY,
    bill_id INT,
    guest_id INT,
    total_price FLOAT,
    FOREIGN KEY (bill_id) REFERENCES Bill(bill_id)
);

CREATE TABLE Payment (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    bill_id INT,
    payment_date DATE,
    payment_time TIME,
    method CHAR(250) CHARACTER SET UTF8MB4,
    FOREIGN KEY (bill_id) REFERENCES Bill(bill_id)
);