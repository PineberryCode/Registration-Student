create database protected;
use protected;
create table student (
dni		int,
cod_student	bigint		not null,
num_orden	int 		not null,
names		varchar(100) 	not null,
lastname	varchar(100) 	not null,
primary key (dni)
);
