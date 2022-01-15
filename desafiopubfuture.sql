CREATE DATABASE  IF NOT EXISTS `desafiopubfutureder` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `desafiopubfutureder`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: desafiopubfutureder
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contas`
--

DROP TABLE IF EXISTS `contas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contas` (
  `idContas` int NOT NULL AUTO_INCREMENT,
  `saldo` float NOT NULL,
  `tipoConta` varchar(45) NOT NULL,
  `instituicaoFinanceira` varchar(45) NOT NULL,
  PRIMARY KEY (`idContas`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contas`
--

LOCK TABLES `contas` WRITE;
/*!40000 ALTER TABLE `contas` DISABLE KEYS */;
INSERT INTO `contas` VALUES (1,300,'Carteira','Santander'),(2,6000,'Conta Corrente','Itau'),(3,2800,'Poupança','NuBank');
/*!40000 ALTER TABLE `contas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `despesas`
--

DROP TABLE IF EXISTS `despesas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `despesas` (
  `idDespesas` int NOT NULL AUTO_INCREMENT,
  `valor` float NOT NULL,
  `dataPagamento` date NOT NULL,
  `dataPagamentoEsperado` date NOT NULL,
  `tipoDespesa` varchar(45) NOT NULL,
  `contas_idContas` int NOT NULL,
  PRIMARY KEY (`idDespesas`),
  KEY `fk_despesas_contas1_idx` (`contas_idContas`),
  CONSTRAINT `fk_despesas_contas1` FOREIGN KEY (`contas_idContas`) REFERENCES `contas` (`idContas`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `despesas`
--

LOCK TABLES `despesas` WRITE;
/*!40000 ALTER TABLE `despesas` DISABLE KEYS */;
INSERT INTO `despesas` VALUES (1,200,'2022-01-07','2022-01-07','alimentacao',1),(2,200,'2022-01-07','2022-01-07','alimentacao',1),(3,200,'2022-01-07','2023-01-07','alimentacao',1),(4,200,'2022-01-07','2022-01-07','moradia',2);
/*!40000 ALTER TABLE `despesas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receitas`
--

DROP TABLE IF EXISTS `receitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receitas` (
  `idReceitas` int NOT NULL AUTO_INCREMENT,
  `valor` float NOT NULL,
  `dataRecebimento` date NOT NULL,
  `dataRecebimentoEsperado` date NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `tipoReceita` varchar(45) NOT NULL,
  `contas_idContas` int NOT NULL,
  PRIMARY KEY (`idReceitas`),
  KEY `fk_receitas_contas_idx` (`contas_idContas`),
  CONSTRAINT `fk_receitas_contas` FOREIGN KEY (`contas_idContas`) REFERENCES `contas` (`idContas`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receitas`
--

LOCK TABLES `receitas` WRITE;
/*!40000 ALTER TABLE `receitas` DISABLE KEYS */;
INSERT INTO `receitas` VALUES (1,300,'2022-01-07','2022-01-07','1','salario',1),(2,200,'2022-07-01','2022-07-01','2','presente',2);
/*!40000 ALTER TABLE `receitas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-15 11:35:58
