/* 2021-04-17 */


create database osztalyozo
character set utf8
collate utf8_hungarian_ci;


create table csoportok (
    az int not null primary key auto_increment,
    nev varchar(50)
);

create table tanulok (
    az int not null primary key auto_increment,
    nev varchar(50),
    csoportAz int
);

create table feladatok (
    az int not null primary key auto_increment,
    leiras varchar(50),
    elerhetoPontszam int
);

create table ertekelesek (
    az int not null primary key auto_increment,
    elertPontszam int,
    feladatAz int,
    dolgozatAz int
);

create table tantargyak (
    az int not null primary key auto_increment,
    nev varchar(50)
);

create table ponthatarok (
    az int not null primary key auto_increment,
    hatar int,
    jegyszoveg varchar(20),
    jegy int
);

create table dolgozatok (
    az int not null primary key auto_increment,
    jegy int,
    datum date,
    tema varchar(100),
    tanuloAz int,
    tantargyAz int
);

