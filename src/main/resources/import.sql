INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (1,'Segunda-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (2,'Terça-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (3,'Quarta-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (4,'Quinta-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (5,'Sexta-Ferira');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (6,'Sabado');
INSERT INTO tb_diasemana(ID_SEMANA,DIA) VALUES (7,'Domingo');



 insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr,id_Cidade) values (1, 1, 12, 12, 78, 'Sol com muitas nuvens. Pancadas de chuva à tarde e à noite','27/08/2017 - 00:00:00','');
--  insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr) values (2, 2, 27, 19, 68, 'Sol com muitas nuvens. Pancadas de chuva à tarde e à noite ','27/08/2017 - 00:00:00');
--  insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr) values (3, 3, 29, 20, 69, 'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.','27/08/2017 - 00:00:00');
--  insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr) values (4, 4, 29, 21, 68, 'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.','27/08/2017 - 00:00:00');
--  insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr) values (5, 5, 31, 21, 64, 'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e 0à noite. ','27/08/2017 - 00:00:00');
--  insert into previsaodotempo ( id, ID_SEMANA, temperaturaMin, temperaturaMax, humidadeDoAr, descricao,datahr) values (6, 6, 28, 21, 67, 'chuva leve com muitas nuvens. Pancadas de chuva à tarde e à noite','27/08/2017 - 00:00:00');

insert into cidade(nome,latitude,longitude,id_Cidade) values ('São Paulo',231545,21513,'');

insert into usuario (id, login, senha) values (1, 'admin', 'admin')
