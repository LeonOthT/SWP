create database BookingParty
create table Account(
	user_id int identity(1,1) primary key,
	email varchar(50) not null,
	password varchar(50) not null,
	roldId int
)
create table Hosts (
	host_id int identity(1,1) primary key,
	user_id int foreign key references Account(user_id),
	name varchar(50) not null,
	phone varchar(50) not null
)
create table Schedule(
	Schedule_id int identity(1,1) primary key,
	[date] date,
	busy bit
)
create table Schedule_Detail(
	schedule_Detail_id int identity(1,1) primary key,
	schedule_id int foreign key references Schedule(Schedule_id),
	host_id int foreign key references Hosts(host_id)
)
create table [Location](
	location_id int identity(1,1) primary key,
	host_id int foreign key references Hosts(host_id),
	[address] nvarchar(50),
	[name] nvarchar (50)
)
create table Guest(
	guest_id int identity(1,1) primary key,
	user_id int foreign key references Account(user_id),
	phone nvarchar,
	[name] nvarchar,
	gender nvarchar
)
create table Package(
	package_id int identity(1,1) primary key,
	location_id int foreign key references [Location](location_id),
	[name] nvarchar,
	price float,
	desctiption nvarchar
)
create table Cart(
	cart_id int identity(1,1) primary key,
	guest_id int foreign key references Guest(guest_id),
	package_id int foreign key references Package(package_id),
	quantity int,
	total_price float
)
create table Service(
	service_id int identity(1,1) primary key,
	location_id int foreign key references [Location](location_id),
	[name] nvarchar,
	price float,
	description nvarchar
)
create table ServiceOfPackage(
	service_of_package_id int identity (1,1) primary key,
	service_id int foreign key references [Service](service_id),
	package_id int foreign key references Package(package_id)
)
create table Feedback(
	feedback_id int identity(1,1) primary key,
	service_id int foreign key references [Service](service_id),
	guest_id int foreign key references Guest(guest_id),
	[description] nvarchar,
	feedback_date date
)
create table Service_Detail(
	service_detail_id int identity(1,1) primary key,
	cart_id int foreign key references Cart(cart_id),
	service_id int foreign key references [Service](service_id)
)
create table Bill(
	bill_id int identity(1,1) primary key,
	cart_id int foreign key references Cart(cart_id)
)
create table Bill_Detail(
	bill_detail_id int identity(1,1) primary key,
	bill_id int foreign key references Bill(bill_id),
	guest_id int,
	total_price float
)
create table Payment(
	payment_id int identity(1,1) primary key,
	bill_id int foreign key references Bill(bill_id),
	payment_date date,
	payment_time time,
	method nvarchar
)