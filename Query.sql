create database student;

create table record(
    -> rollno int(3),
    -> name char(20),
    -> class int(2),
    -> section char(2),
    -> address varchar(40),
    -> course  Varchar(40),
    -> grade  Varchar(40),
    ->fees Varchar(40)
    ->faculty Varchar(40));
describe record;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| rollno  | int(3)      | YES  |     | NULL    |       |
| name    | char(20)    | YES  |     | NULL    |       |
| class   | int(2)      | YES  |     | NULL    |       |
| section | char(2)     | YES  |     | NULL    |       |
| address | varchar(40) | YES  |     | NULL    |       |
| course  | varchar(40) | YES  |     | NULL    |       |
| grade   | varchar(40) | YES  |     | NULL    |       |
| fees    | varchar(40) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+