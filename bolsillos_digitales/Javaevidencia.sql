create database twitter;
use twitter;
create table Usuario(
idUsuario int auto_increment primary key,
nombreUsuario varchar(255),
correoUsuario varchar(255),
telefono int,
usuario varchar(255),
passwords varchar(255),
estado boolean not null );

create table Bolsillo(
idBolsillo int auto_increment primary key,
nombreBolsillo varchar(255),
saldoBolsillo varchar(255),
estadoBolsillo boolean not null);
create table DaviPlata(
idUsuario int auto_increment primary key
);
create table Nequi(
idUsuario int auto_increment primary key);
