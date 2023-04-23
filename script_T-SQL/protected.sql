create database protected;
use protected;
select*from student;
delete from student where dni = 78667867;
drop table student;
create table student (
	dni int,
    cod_student bigint not null,
    num_orden int not null,
	names varchar(100) not null,
	lastname varchar(100) not null,
	primary key (dni)
);
select*from student;
create table professor (
	dni int,
    names varchar(100) not null,
    lastname varchar(100) not null,
    primary key (dni)
);
create table level_sector (
	id_level_sector int auto_increment,
    dni_professor int,
    dni_student int,
    level int not null,
    sector char(1) not null,
    primary key (id_level_sector),
    constraint fk_professor 
    foreign key (dni_professor) 
    references professor (dni),
    constraint fk_student
    foreign key (dni_student)
    references student (dni)
);
create table course (
	id int auto_increment,
    dni_professor int,
    dni_student int,
    name varchar(100),
    primary key (id),
    constraint fk_professor02 
    foreign key (dni_professor) 
    references professor (dni),
    constraint fk_student02
    foreign key (dni_student)
    references student (dni)
);