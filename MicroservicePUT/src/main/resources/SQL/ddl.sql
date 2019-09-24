drop table if exists recepcioner cascade;
drop table if exists termin cascade;
drop table if exists klijent cascade;
drop table if exists zaposleni cascade;
drop table if exists usluga cascade;
drop table if exists racun cascade;
drop table if exists specijalnost cascade;
drop table if exists vrsta_usluge cascade;
drop sequence if exists recepcioner_seq;
drop sequence if exists termin_seq;
drop sequence if exists klijent_seq;
drop sequence if exists zaposleni_seq;
drop sequence if exists usluga_seq;
drop sequence if exists racun_seq;
drop sequence if exists specijalnost_seq;
drop sequence if exists vrsta_usluge_seq;


create table recepcioner(
	recepcioner_id integer not null,
	ime_rec varchar(50),
	prezime_rec varchar(50)
);

create table klijent (
	klijent_id integer not null,
	ime_k varchar(50),
	prezime_k varchar(50),
	adresa varchar(100),
	kontakt varchar(20)
);

create table specijalnost(
	specijalnost_id integer not null,
	naziv_spec varchar(100)
);

create table zaposleni(
	zaposleni_id integer not null,
	ime_zap varchar(50),
	prezime_zap varchar(50),
	prijavljen boolean,
	specijalnost_id integer
);

create table termin(
	termin_id integer not null,
	datum date,
	klijent_id integer,
	recepcioner_id integer
);

create table vrsta_usluge(
	vrsta_usluge_id integer not null,
	naziv_vu varchar(100)
);

create table usluga(
	usluga_id integer not null,
	vrsta_usluge_id integer,
	zaposleni_id integer,
	cena_usluge numeric(7,2),
	termin_id integer
);

create table racun(
	racun_id integer not null,
	usluga_id integer
	nacin_placanja varchar(20)
);



alter table klijent add constraint PK_klijent primary key(klijent_id); 
alter table racun add constraint PK_racun primary key(racun_id); 
alter table recepcioner add constraint PK_recepcioner primary key(recepcioner_id);
alter table specijalnost add constraint PK_specijalnost primary key(specijalnost_id);
alter table termin add constraint PK_termin primary key(termin_id);
alter table usluga add constraint PK_usluga primary key(usluga_id);
alter table vrsta_usluge add constraint PK_vrsta_usluge primary key(vrsta_usluge_id);
alter table zaposleni add constraint PK_zaposleni primary key(zaposleni_id);


alter table termin add constraint FK_termin_klijent
foreign key (klijent_id) references klijent (klijent_id);
alter table termin add constraint FK_termin_recepcioner
foreign key (recepcioner_id) references recepcioner (recepcioner_id);

alter table zaposleni add constraint FK_zaposleni_specijalnost
foreign key (specijalnost_id) references specijalnost (specijalnost_id);

alter table usluga add constraint FK_usluga_vrsta_usluge
foreign key (vrsta_usluge_id) references vrsta_usluge (vrsta_usluge_id);
alter table usluga add constraint FK_usluga_zaposleni
foreign key (zaposleni_id) references zaposleni (zaposleni_id);
alter table usluga add constraint FK_usluga_termin
foreign key (termin_id) references termin (termin_id);

alter table racun add constraint FK_racun_usluga
foreign key (usluga_id) references usluga (usluga_id);


create index IDXFK_Termin_Klijent on termin(klijent_id);
create index IDXFK_Termin_Recepcioner on termin(recepcioner_id);
create index IDXFK_Zaposleni_Specijalnost on zaposleni(specijalnost_id);
create index IDXFK_Usluga_VrstaUsluge on usluga(vrsta_usluge_id);
create index IDXFK_Usluga_Zaposleni on usluga(zaposleni_id);
create index IDXFK_Usluga_Termin on usluga(termin_id);
create index IDXFK_Racun_Usluga on racun(racun_id);


create sequence recepcioner_seq increment 1;
create sequence termin_seq increment 1;
create sequence klijent_seq increment 1;
create sequence zaposleni_seq increment 1;
create sequence usluga_seq increment 1;
create sequence racun_seq increment 1;
create sequence specijalnost_seq increment 1;
create sequence vrsta_usluge_seq increment 1;
