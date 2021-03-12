-- Criação banco de dados db_ecommerce - EXERCICIO 02
CREATE DATABASE db_ecommerce;
 
 USE db_ecommerce; -- Informar ao MySQL qual banco de dados irá utilizar
 
 -- Criação tabela tb_produtos e seus parâmetros
 CREATE TABLE tb_produtos (
	id BIGINT(4) AUTO_INCREMENT,
    tipo VARCHAR(50) NOT NULL,
    estoque BOOLEAN,
    setor VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2),
    cor VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
 );
 
 SELECT * FROM tb_produtos; -- Consulta
  
  -- Popular tabela tb_produtos
 INSERT INTO tb_produtos (tipo,estoque,setor,preco,cor) VALUES ("Espelho",TRUE,"Decoração",200.00,"Borda Branca"); 
 INSERT INTO tb_produtos (tipo,estoque,setor,preco,cor) VALUES ("Geladeira",TRUE,"Eletrodoméstico",3000.00,"Inox");
 INSERT INTO tb_produtos (tipo,estoque,setor,preco,cor) VALUES ("Edredom",TRUE,"Cama/Mesa/Banho",150.00,"Azul");
 INSERT INTO tb_produtos (tipo,estoque,setor,preco,cor) VALUES ("Celular",TRUE,"Eletronico",1800.00,"Preto");
  
SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE preco > 500;

SELECT * FROM tb_produtos WHERE preco < 500;

-- Modificação de valor existente
UPDATE tb_produtos SET id = (10) WHERE id = 3 ; 
UPDATE tb_produtos SET id = (21) WHERE id = 4 ;
