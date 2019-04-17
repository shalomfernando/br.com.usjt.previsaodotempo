INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (1,'Segunda-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (2,'Terça-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (3,'Quarta-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (4,'Quinta-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (5,'Sexta-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (6,'Sabado');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (7,'Domingo');


insert into tb_cidade(id_cidade,nome,latitude,longitude) values (1,'São Paulo',3215,21513);
insert into tb_cidade(id_cidade,nome,latitude,longitude) values (2,'Santos',6548,1513);
insert into tb_cidade(id_cidade,nome,latitude,longitude) values (3,'Bahia',48631,845151);
insert into tb_cidade(id_cidade,nome,latitude,longitude) values (4,'Parana',231545,5513);
insert into tb_cidade(id_cidade,nome,latitude,longitude) values (5,'Minas',888465,515655);
insert into tb_cidade(id_cidade,nome,latitude,longitude) values (6,'Rio de Janeiro',26565,84561);
insert into previsaodotempo( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_cidade) values (1, 1, 12, 12, 78, 'Sol com muitas nuvens. Pancadas de chuva à tarde e à noite','27/08/2017 - 00:00:00',1);
insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_cidade) values (2, 2, 27, 19, 68, 'Sol com muitas nuvens. Pancadas de chuva à tarde e à noite ','27/08/2017 - 00:00:00',2);
insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_cidade) values (3, 3, 29, 20, 69, 'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.','27/08/2017 - 00:00:00',3);
insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_cidade) values (4, 4, 29, 21, 68, 'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.','27/08/2017 - 00:00:00',4);
insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_cidade) values (5, 5, 31, 21, 64, 'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e 0à noite. ','27/08/2017 - 00:00:00',5);
insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_cidade) values (6, 6, 28, 21, 67, 'chuva leve com muitas nuvens. Pancadas de chuva à tarde e à noite','27/08/2017 - 00:00:00',6);



insert into usuario (id, login, senha) values (1, 'admin', 'admin')
