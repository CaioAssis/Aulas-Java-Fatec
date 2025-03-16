CREATE TABLE produtos(
	codigo int primary key,
	descricao varchar(50),
	preco money
)

insert into produtos values (100, 'Martelo', 32.45);
insert into produtos values (101, 'Chave Inglesa', 12.25);
insert into produtos values (102, 'Chave de Fenda', 10.25);
insert into produtos values (103, 'Canivete', 10.50);
insert into produtos values (104, 'Fita Isolante', 5.25);
insert into produtos values (105, 'Macaco Hidráulico', 82.25);
insert into produtos values (106, 'Furadeira', 32.25);

select * from produtos;