CREATE DATABASE control_de_stock;
USE control_de_stock;

CREATE TABLE producto(
id INT auto_increment,
nombre varchar(50) not null,
descripcion varchar(255),
cantidad int not null default 0,
primary key(id)
) Engine=InnoDB;