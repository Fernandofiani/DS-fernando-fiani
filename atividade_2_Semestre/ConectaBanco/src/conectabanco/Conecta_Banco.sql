CREATE DATABASE IF NOT exists  ConectaBanco;
USE ConectaBanco;
DROP TABLE IF EXISTS Aluno;

create table Aluno(
nome varchar(30),
id_aluno int AUTO_INCREMENT primary key
);

