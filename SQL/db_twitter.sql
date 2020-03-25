drop database twitter;
create database twitter;
use twitter;

CREATE TABLE Usuario
(
 id_usuario Int NOT NULL AUTO_INCREMENT,
 name    Varchar(45) NOT NULL ,
 mail     Varchar(45) NOT NULL ,
 password Varchar(45) NOT NULL ,

PRIMARY KEY (id_usuario)
);


CREATE TABLE Comentario
(
  id_comentario Int NOT NULL AUTO_INCREMENT,
 id_usuario   Int NOT NULL ,
 date  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
 contenido     Varchar(45) NOT NULL ,

PRIMARY KEY (id_comentario)

);




CREATE TABLE Respuesta
(
 id_respuesta  Int NOT NULL ,
 fecha Date   NOT NULL ,
 contenido Varchar(45)    NOT NULL ,
 id_comentario Int NOT NULL ,
 id_usuario Int     NOT NULL ,

PRIMARY KEY (id_respuesta)
);

Alter table Comentario add Foreign Key (id_usuario) references Usuario (id_usuario);
Alter table Respuesta add Foreign Key (id_usuario) references Usuario (id_usuario);
Alter table Respuesta add Foreign Key (id_comentario) references Comentario (id_comentario);
