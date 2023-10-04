CREATE TABLE `bdejercicio3`.`pedidos` (
  `idpedido` INT NOT NULL,
  `codigoproducto` INT NULL,
  `unidades` INT NULL,
  `total` DOUBLE NULL,
  `fecha` DATETIME NULL,
  PRIMARY KEY (`idpedido`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
