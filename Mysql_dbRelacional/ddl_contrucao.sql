-- MySQL Script generated by MySQL Workbench
-- Mon Mar 15 21:46:30 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_construindo_a_nossa_vida
-- -----------------------------------------------------
CREATE DATABASE db_construindo_a_nossa_vida;
-- -----------------------------------------------------
-- Schema db_construindo_a_nossa_vida
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_construindo_a_nossa_vida` DEFAULT CHARACTER SET utf8 ;
USE `db_construindo_a_nossa_vida` ;

-- -----------------------------------------------------
-- Table `db_construindo_a_nossa_vida`.`tb_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_construindo_a_nossa_vida`.`tb_produto` (
  `idtb_produto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `preco` DECIMAL(5,2) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `qtd` INT NOT NULL,
  PRIMARY KEY (`idtb_produto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_construindo_a_nossa_vida`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_construindo_a_nossa_vida`.`tb_categoria` (
  `idtb_categoria` INT NOT NULL,
  `material` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(100) NOT NULL,
  `fk_tb_produto_idtb_produto` INT NOT NULL,
  PRIMARY KEY (`idtb_categoria`, `fk_tb_produto_idtb_produto`),
  INDEX `fk_tb_categoria_tb_produto_idx` (`fk_tb_produto_idtb_produto` ASC) VISIBLE,
  CONSTRAINT `fk_tb_categoria_tb_produto`
    FOREIGN KEY (`fk_tb_produto_idtb_produto`)
    REFERENCES `db_construindo_a_nossa_vida`.`tb_produto` (`idtb_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
