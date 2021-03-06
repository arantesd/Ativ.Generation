-- MySQL Script generated by MySQL Workbench
-- Mon Mar 15 15:08:08 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_farmacia_do_bem
-- -----------------------------------------------------
CREATE DATABASE db_farmacia_do_bem;
-- -----------------------------------------------------
-- Schema db_farmacia_do_bem
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_farmacia_do_bem` DEFAULT CHARACTER SET utf8 ;
USE `db_farmacia_do_bem` ;

-- -----------------------------------------------------
-- Table `db_farmacia_do_bem`.`tb_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_farmacia_do_bem`.`tb_produto` (
  `idtb_produto` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(70) NOT NULL,
  `preco` DECIMAL(10,2) NOT NULL,
  `desconto` VARCHAR(20) NOT NULL,
  `fk_tb_categoria_tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtb_produto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_farmacia_do_bem`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_farmacia_do_bem`.`tb_categoria` (
  `idtb_categoria` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(70) NOT NULL,
  `laboratorio` VARCHAR(70) NOT NULL,
  `tb_produto_idtb_produto` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idtb_categoria`, `tb_produto_idtb_produto`),
  INDEX `fk_tb_categoria_tb_produto_idx` (`tb_produto_idtb_produto` ASC) VISIBLE,
  CONSTRAINT `fk_tb_categoria_tb_produto`
    FOREIGN KEY (`tb_produto_idtb_produto`)
    REFERENCES `db_farmacia_do_bem`.`tb_produto` (`idtb_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
