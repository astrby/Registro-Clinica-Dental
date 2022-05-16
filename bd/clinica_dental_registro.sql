drop database if exists clinica_dental_registro;

create database clinica_dental_registro;

use clinica_dental_registro;

create table pacientes (
	cedula int not null primary key,
    nombre varchar (50) not null,
    direccion varchar (200) not null,
    numero int not null,
    tipo_consulta varchar (50) not null
);