-- Criação banco de dados db_escola - EXERCICIO 03
CREATE DATABASE db_escola;
 
USE db_escola; -- Informar ao MySQL qual banco de dados irá utilizar
 
 -- Criação tabela tb_alunos e seus parâmetros
CREATE TABLE tb_alunos (
	id BIGINT(8),
    nome VARCHAR(50) NOT NULL,
    ativo BOOLEAN,
    turma VARCHAR(50),
    serie BIGINT(10),
    media BIGINT(10),
    PRIMARY KEY (id)
 );
 
SELECT * FROM tb_alunos; -- Consulta
  
  -- Popular tabela tb_alunos
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (7453,"Beatriz Dantas",TRUE,"B25",7,9);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (1745,"Enzo Sotelas",TRUE,"F58",4,7);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (4470,"Bernardo Araújo",TRUE,"I84",8,5);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (4544,"Valentina Miranda",TRUE,"J89",2,8);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (4548,"Guilherme Campos",TRUE,"T77",3,10);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (5788,"Andrew Ferreira",TRUE,"R01",1,6);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (8787,"Iago Bispo",TRUE,"J45",5,8);
INSERT INTO tb_alunos (id,nome,ativo,turma,serie,media) VALUES (9743,"Pedro Luna",TRUE,"Y30",8,4);
  
SELECT * FROM tb_alunos;

SELECT * FROM tb_alunos WHERE media > 7;

SELECT * FROM tb_alunos WHERE media < 7;

ALTER TABLE tb_alunos -- Alteração do nome "media" para nota conforme enunciado.
CHANGE media nota BIGINT(10);	
