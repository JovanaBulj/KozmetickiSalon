insert into "klijent" ("klijent_id", "ime_k", "prezime_k", "adresa", "kontakt")
values(nextval('klijent_seq'), 'Jovana', 'Bulj', 'Mileve Maric 1', '065/246-7480');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k", "adresa", "kontakt")
values(nextval('klijent_seq'), 'Milica', 'Arsovic','Maksima Gorkog', '064/123-7497');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k", "kontakt")
values(nextval('klijent_seq'), 'Biljana', 'Simovic', '063/564-7670');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k", "kontakt")
values(nextval('klijent_seq'), 'Gorana', 'Gajic', '062/123-7450');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k", "kontakt")
values(nextval('klijent_seq'), 'Ognjena', 'Jankovic', '065/246-7480');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k", "kontakt")
values(nextval('klijent_seq'), 'Aleksandra', 'Levic', '062/789-1230');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k",  "kontakt")
values(nextval('klijent_seq'), 'Petar', 'Peric', '/');
insert into "klijent" ("klijent_id", "ime_k", "prezime_k")
values(nextval('klijent_seq'), 'Mitar', 'Sretic');


insert into "recepcioner" values (nextval('recepcioner_seq'), 'Milutin', 'Lakovic');
insert into "recepcioner" values (nextval('recepcioner_seq'), 'Danijela', 'Zikic');
insert into "recepcioner" values (nextval('recepcioner_seq'), 'Sara', 'Radojcic');


insert into "specijalnost" values (nextval('specijalnost_seq'), 'Frizer');
insert into "specijalnost" values (nextval('specijalnost_seq'), 'Berber');
insert into "specijalnost" values (nextval('specijalnost_seq'), 'Kozmeticar');
insert into "specijalnost" values (nextval('specijalnost_seq'), 'Esteticar');
insert into "specijalnost" values (nextval('specijalnost_seq'), 'Pomocnik');


insert into "zaposleni" values (nextval('zaposleni_seq'), 'Jelena', 'Peric', true, 1);
insert into "zaposleni" values (nextval('zaposleni_seq'), 'Marko', 'Saric', false, 2);
insert into "zaposleni" values (nextval('zaposleni_seq'), 'Sladjana', 'Panic', true, 3);
insert into "zaposleni" values (nextval('zaposleni_seq'), 'Jovana', 'Danic', true, 3);
insert into "zaposleni" values (nextval('zaposleni_seq'), 'Marina', 'Lakic', false, 4);
insert into "zaposleni" values (nextval('zaposleni_seq'), 'Nevena', 'Rakic', true, 5);
insert into "zaposleni" values (nextval('zaposleni_seq'), 'Mario', 'Sladojevic', false, 5);


insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'),'Zensko sisanje');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'),'Musko sisanje');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'),'Sisanje+Feniranje');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'),'Musko sisanje+brijanje');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'),'Tretman lica');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'), 'Depilacija');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'), 'Farbanje kose');
insert into "vrsta_usluge" values (nextval('vrsta_usluge_seq'), 'Manikir-pedikir');


insert into "termin" values(nextval('termin_seq'),to_date('15.08.2019.', 'dd.mm.yyyy.'),1,3);
insert into "termin" values(nextval('termin_seq'),to_date('15.08.2019.', 'dd.mm.yyyy.'),2,3);
insert into "termin" values(nextval('termin_seq'),to_date('15.08.2019.', 'dd.mm.yyyy.'),3,1);
insert into "termin" values(nextval('termin_seq'),to_date('16.08.2019.', 'dd.mm.yyyy.'),4,2);
insert into "termin" values(nextval('termin_seq'),to_date('16.08.2019.', 'dd.mm.yyyy.'),5,2);
insert into "termin" values(nextval('termin_seq'),to_date('16.08.2019.', 'dd.mm.yyyy.'),6,1);
insert into "termin" values(nextval('termin_seq'),to_date('16.08.2019.', 'dd.mm.yyyy.'),7,1);
insert into "termin" values(nextval('termin_seq'),to_date('16.08.2019.', 'dd.mm.yyyy.'),8,1);


insert into "usluga" values (nextval('usluga_seq'),1,9,1000,1);
insert into "usluga" values (nextval('usluga_seq'),3,9,1500,2);
insert into "usluga" values (nextval('usluga_seq'),3,9,1500,3);
insert into "usluga" values (nextval('usluga_seq'),5,11,3500,4);
insert into "usluga" values (nextval('usluga_seq'),6,12,2500,5);
insert into "usluga" values (nextval('usluga_seq'),6,12,2500,6);
insert into "usluga" values (nextval('usluga_seq'),4,10,1500,7);
insert into "usluga" values (nextval('usluga_seq'),4,10,1500,8);


insert into "racun" values(nextval('racun_seq'),9,'Gotovina');
insert into "racun" values(nextval('racun_seq'),2,'Gotovina');
insert into "racun" values(nextval('racun_seq'),3,'Gotovina');
insert into "racun" values(nextval('racun_seq'),4,'Kartica');
insert into "racun" values(nextval('racun_seq'),5,'Gotovina');
insert into "racun" values(nextval('racun_seq'),6,'Akcija/Bodovi');
insert into "racun" values(nextval('racun_seq'),7,'Gotovina');
insert into "racun" values(nextval('racun_seq'),8,'Kartica');



