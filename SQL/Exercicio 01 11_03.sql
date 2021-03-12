-- Criação banco de dados db_rh - EXERCICIO 01
 CREATE DATABASE db_rh;
 
 USE db_rh ; -- Informar ao MySQL qual banco de dados irá utilizar
 
 -- Criação tabela tb_funcionarios e seus parâmetros
 CREATE TABLE tb_funcionarios (
	id BIGINT(10) AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    ativo BOOLEAN,
    setor VARCHAR(50),
    salario DECIMAL(10,2),
    admissao DATE,
    PRIMARY KEY (id)
 );
 
 SELECT * FROM tb_funcionarios; -- Consulta
  
  -- Popular tabela tb_funcionarios
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Ana Ribeiro",TRUE,"Administração",2800.00,'2020-01-04');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("José Souza",TRUE,"Financeiro",3200.00,'2019-03-05');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Ricardo da Silva",FALSE,"Administração",2800.00,'2018-04-02');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Simone Diniz",TRUE,"Contabilidade",1500.00,'2018-07-01');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Aparecida Melo",TRUE,"Recepção",2500.00,'2017-11-05');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Cassia Almeida",FALSE,"Recepão",2300.00,'2000-08-03');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Manuela Dias",TRUE,"Jurídico",1500.00,'2020-07-08');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("André Castro",TRUE,"Financeiro",1800.00,'2021-09-01');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Carlos Andrade",TRUE,"Compras",1990.00,'2018-07-03');
 INSERT INTO tb_funcionarios (nome,ativo,setor,salario,admissao) VALUES ("Valter Moura",TRUE,"Administração",1300.00,'2020-02-01');
 
SELECT * FROM tb_funcionarios;

SELECT * FROM tb_funcionarios WHERE salario > 2000;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

ALTER TABLE tb_funcionarios -- Alteração da sequencia id
MODIFY id INT AUTO_INCREMENT NOT NULL;	
