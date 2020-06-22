INSERT INTO roles (id, perfil) VALUES (1, 'ROLE_ADMINISTRADOR');
INSERT INTO roles (id, perfil) VALUES (2, 'ROLE_USUARIO');
INSERT INTO users (email, estatus, fecha_registro, nombre, password, username) VALUES ('admin@gmail.com', 1, '2020-01-01', 'admin', '$2a$10$e4hUFy92NHLDkXLnJPhejOUtEew1vQGMpL.FoX0yceKM/bnq3te5e', 'admin');
INSERT INTO users (email, estatus, fecha_registro, nombre, password, username) VALUES ('nuevo@gmail.com', 1, '2020-01-01', 'nuevo', '$2a$10$xVNO6rxXJ/4ZfPC2Dxnr8OquYZ26cnwppqkFDwj9WSBoGVOlKUHHS', 'nuevo');
insert into users_roles values(1,1)
insert into users_roles values(2,2)
INSERT INTO tickets(description, price, quantity) values("Pepsi", 2.0, 3)
INSERT INTO tickets(description, price, quantity) values("Fanta", 2.5, 1)
INSERT INTO tickets(description, price, quantity) values("Coca Cola", 3.0, 3)
INSERT INTO tickets(description, price, quantity) values("Sprite",2.0, 2)



