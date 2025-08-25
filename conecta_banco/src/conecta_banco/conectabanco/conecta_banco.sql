create database if not exists conectabanco;
use conectabanco;
 drop table if exists alunos;
 
create table alunos(
Codigo_Aluno varchar(45),
Nome_Aluno varchar(45)
);

select * from alunos;