use jpa

create table customer(
user_id int not null primary key,
password varchar(50) not null
);

select * from customer

insert into customer(user_id, password) values(1234, 'password')

drop table customer