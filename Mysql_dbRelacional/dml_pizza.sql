ALTER TABLE db_pizzaria_legal.tb_categoria
CHANGE tamanho borda VARCHAR(45) ;

INSERT INTO db_pizzaria_legal.tb_pizza(sabor,preco,tipo,tamanho)
VALUES
("Pepperoni",38.95,"Salgada","Grande"),
("Banana",21.00,"Doce","Broto"),
("Toscana",28.90,"Salgada","Média"),
("Camarão",64.00,"Salgada","Grande"),
("Prestígio",19.00,"Doce","Broto"),
("Caipira",40.52,"Salgada","Grande"),
("Esfirra de Carne",1.50,"Salgada","Tamanho unico"),
("Lombo",58.99,"Salgada","Média");

INSERT INTO db_pizzaria_legal.tb_categoria(id,opcoes,borda,fk_tb_pizza_tipo)
VALUES
(45,"Massa fina","S/borda",1),
(19,"Massa tradicional","C/borda catupiry",4),
(21,"Massa tradicional","C/borda de chocolate",2),
(66,"Massa grossa","C/borda de mussarela",6),
(48,"Massa grossa","S/borda",8);

SELECT * FROM db_pizzaria_legal.tb_pizza
WHERE preco > 45.00;

SELECT * FROM db_pizzaria_legal.tb_pizza
WHERE preco > 29.00 AND preco < 60.00;

SELECT * FROM db_pizzaria_legal.tb_pizza
WHERE sabor LIKE "%c%";

SELECT * FROM db_pizzaria_legal.tb_pizza
INNER JOIN db_pizzaria_legal.tb_categoria
ON db_pizzaria_legal.tb_pizza.idtb_pizza = db_pizzaria_legal.tb_categoria.fk_tb_pizza_tipo;

SELECT * FROM db_pizzaria_legal.tb_pizza
WHERE tipo IN ("Doce");