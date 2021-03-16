SELECT * FROM db_farmacia_do_bem.tb_produto;

INSERT INTO db_farmacia_do_bem.tb_produto (nome,preco,desconto,fk_tb_categoria_tipo)
VALUES
("Esmalte",4.75,"Não","Cosmético"),
("Dipirona",8.00,"Sim, 10%","Remédio"),
("Creme Dental",3.00,"Não","Cosmético"),
("Nimisulida",13.55,"Não","Remédio"),
("Benegripe",8.10,"Sim, 10%","Remédio"),
("Antiflamatório",54.00,"Não","Remédio"),
("Blush",20.00,"Não","Cosmético"),
("Dorflex",16.90,"Não","Remédio");

INSERT INTO db_farmacia_do_bem.tb_categoria (tipo,laboratorio,tb_produto_idtb_produto)
VALUES
("Cosmético","Colorama",1),
("Remédio","Sanofi",2),
("Cosmético","Vult",7),
("Remédio","Globo",8),
("Remédio","Bayer",4);

SELECT * FROM db_farmacia_do_bem.tb_produto
WHERE preco > 50.00;

SELECT * FROM db_farmacia_do_bem.tb_produto
WHERE nome LIKE "%c%";

SELECT * FROM db_farmacia_do_bem.tb_produto
INNER JOIN db_farmacia_do_bem.tb_categoria
ON db_farmacia_do_bem.tb_produto.fk_tb_categoria_tipo = db_farmacia_do_bem.tb_categoria.tipo;

SELECT * FROM db_farmacia_do_bem.tb_produto
WHERE fk_tb_categoria_tipo IN ("Remédio");
