Drop database gestion;
create database if not exists gestion;
use Gestion;
create table if not exists categorie(id int auto_increment Primary KEY,nom varchar(100),description varchar(500));
create table if not exists Poste(id int auto_increment Primary key,nom varchar(100) NOT NULL,salaire int,
	dateCreation datetime default now(),dateModification datetime default now() );

create table if not exists Produit(id int auto_increment Primary key,nom varchar(100) NOT NULL,prixUnique int NOT NULL,prixDeVente int ,quantite int NOT NULL,
	dateCreation datetime default now(),dateModification datetime default now(),idCategorie int,Constraint fk123 FOREIGN KEY(idCategorie) references categorie(id));

create table if not exists employee(id int auto_increment Primary key,nom varchar(100) NOT NULL,prenom varchar(100),tel int NOT NULL,
	mail varchar(100),idPoste int,addresse varchar(100),motDepasse varchar(500), dateCreation datetime default now(),dateModification datetime default now(),
	Constraint fk1 FOREIGN KEY(idPoste) references Poste(id));

create table if not exists employeeExterne(id int auto_increment Primary key,nom varchar(100) NOT NULL,prenom varchar(100),
	tel int Not NULL,mail varchar(100),idPoste int,addresse varchar(100),dateCreation datetime default now(),dateModification datetime default now());

create table if not exists vente(id int auto_increment Primary key,idEmployee int,montant int,dateModification datetime default now(),
	dateCreation datetime default now(),CONSTRAINT fk2 FOREIGN KEY(idEmployee) references employee(id));

create table if not exists ligneVente(id int auto_increment Primary key,idVente int,dateModification datetime default now(),quantite int, prixDeVente int,idProduit int,
	dateCreation datetime default now(),CONSTRAINT fk3 FOREIGN KEY(idVente) references vente(id),CONSTRAINT fk42 FOREIGN KEY(idProduit) references Produit(id));

create table if not exists Emprunt(id int auto_increment Primary key,idEmployeeExterne int,idEmployee int, montant int,dateModification datetime default now(),
	dateCreation datetime default now(),CONSTRAINT fk5 FOREIGN KEY(idEmployeeExterne) references employeeExterne(id),CONSTRAINT fk6 FOREIGN KEY(idEmployee) references employee(id));

create table if not exists ligneEmprunt(id int auto_increment Primary key,idEmprunt int,dateModification datetime default now(),idProduit int,quantite int, prixDeVente int,
	dateCreation datetime default now(),CONSTRAINT fk4 FOREIGN KEY(idEmprunt) references Emprunt(id),CONSTRAINT fk41 FOREIGN KEY(idProduit) references Produit(id));
