-- drop schema institucion;
 -- show tables;
-- MySQL Workbench Forward Engineering
-- -----------------------------------------------------
-- Schema Institucion
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Institucion
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Institucion` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema institucion
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema institucion
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `institucion` DEFAULT CHARACTER SET utf8 ;
USE `Institucion` ;

-- -----------------------------------------------------
-- Table `Institucion`.`Departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Departamento` (
  `idDepartamento` INT NOT NULL AUTO_INCREMENT,
	`nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idDepartamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`Provincia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Provincia` (
  `idProvincia` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `idDepartamento` INT NOT NULL,
  PRIMARY KEY (`idProvincia`),
	FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento)
  );

-- -----------------------------------------------------
-- Table `Institucion`.`Distrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Distrito` (
  `idDistrito` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `idProvincia` INT NOT NULL,
  PRIMARY KEY (`idDistrito`),
	FOREIGN KEY (`idProvincia`)
	REFERENCES `Institucion`.`Provincia` (`idProvincia`));

-- -----------------------------------------------------
-- Table `Institucion`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Persona` (
  `dni` VARCHAR(8) NOT NULL,
  `nombres` VARCHAR(45) NULL,
  `apellidos` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `fecha_nac` DATE NULL,
  `idDistrito` INT NOT NULL,
  PRIMARY KEY (`dni`),
    FOREIGN KEY (`idDistrito`)
    REFERENCES `Institucion`.`Distrito` (`idDistrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`Docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Docente` (
  `categoria` VARCHAR(45) NOT NULL,
  `condicion` VARCHAR(45) NULL,
  `dni` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`dni`),
    FOREIGN KEY (`dni`)
    REFERENCES `Institucion`.`Persona` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Alumno` (
  `codigo` VARCHAR(15) NOT NULL,
  `dni` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`dni`),
    FOREIGN KEY (`dni`)
    REFERENCES `Institucion`.`Persona` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`Modulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Modulo` (
  `idModulo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `tHoras` INT NULL,
  PRIMARY KEY (`idModulo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`Semestre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Semestre` (
  `idSemestre` INT NOT NULL AUTO_INCREMENT,
  `detalle` VARCHAR(45) NULL,
  PRIMARY KEY (`idSemestre`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`Matricula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`Matricula` (
  `dni` VARCHAR(8) NOT NULL,
  `idModulo` INT NOT NULL,
  `nota` FLOAT NULL,
  `idSemestre` INT NOT NULL,
  PRIMARY KEY (`dni`, `idModulo`, `idSemestre`),
    FOREIGN KEY (`dni`)
    REFERENCES `Institucion`.`Alumno` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alumno_has_Modulo_Modulo1`
    FOREIGN KEY (`idModulo`)
    REFERENCES `Institucion`.`Modulo` (`idModulo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Matricula_Semestre1`
    FOREIGN KEY (`idSemestre`)
    REFERENCES `Institucion`.`Semestre` (`idSemestre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Institucion`.`docente_Modulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Institucion`.`docente_Modulo` (
  `dni` VARCHAR(8) NOT NULL,
  `idModulo` INT NOT NULL,
  `idSemestre` INT NOT NULL,
  PRIMARY KEY (`dni`, `idModulo`),
    FOREIGN KEY (`dni`)
    REFERENCES `Institucion`.`Docente` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Docente_has_Modulo_Modulo1`
    FOREIGN KEY (`idModulo`)
    REFERENCES `Institucion`.`Modulo` (`idModulo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_docente_Modulo_Semestre1`
    FOREIGN KEY (`idSemestre`)
    REFERENCES `Institucion`.`Semestre` (`idSemestre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `institucion` ;

-- -----------------------------------------------------
-- Table `institucion`.`departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `institucion`.`departamento` (
  `idDepartamento` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idDepartamento`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
