SELECT * FROM db_construindo_a_nossa_vida.tb_categoria;

INSERT INTO db_construindo_a_nossa_vida.tb_produto (nome,preco,tipo,qtd)
VALUES
("Cano PVC",2.80,"Hidraulico",1),
("Prego",3.75,"Construção",4),
("Cimento",64.99,"Construção",1),
("Broca",2.90,"Construção",4),
("Fita Isolante",4.90,"Multiuso",1),
("Gesso",60.00,"Acabamento",1.5),
("Tinta",42.00,"Acabamento",1),
("Lâmpada",25.90,"Iluminação",2);

INSERT INTO db_construindo_a_nossa_vida.tb_categoria (idtb_categoria,material,descricao,fk_tb_produto_idtb_produto)
VALUES
(491,"Plástico","Reutilizável",1),
(181,"Metal","Antitetânico",2),
(131,"Acrílico","Sem odor",7),
(894,"Vidro","Vidro temperdo",8),
(164,"PVC","Resistente e duravel",5);

SELECT * FROM db_construindo_a_nossa_vida.tb_produto 
WHERE preco >  50.00;

SELECT * FROM db_construindo_a_nossa_vida.tb_produto 
WHERE preco > 3.00 AND preco < 60.00;

SELECT * FROM db_construindo_a_nossa_vida.tb_produto
WHERE nome LIKE 'C%';

SELECT * FROM db_construindo_a_nossa_vida.tb_produto
INNER JOIN db_construindo_a_nossa_vida.tb_categoria
ON db_construindo_a_nossa_vida.tb_produto.idtb_produto = db_construindo_a_nossa_vida.tb_categoria.fk_tb_produto_idtb_produto;

SELECT * FROM db_construindo_a_nossa_vida.tb_produto
WHERE tipo IN ("Construção");
