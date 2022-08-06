-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: league_football_management
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
-- Table structure for table `bxh`
--

DROP TABLE IF EXISTS `bxh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bxh` (
  `vitri` int NOT NULL,
  `mavong` int NOT NULL,
  `madoi` int NOT NULL,
  `sotran` int NOT NULL,
  `stthang` int NOT NULL,
  `stthua` int NOT NULL,
  `sthoa` int NOT NULL,
  `sobanthang` int NOT NULL,
  `sobanthua` int NOT NULL,
  `hieuso` int NOT NULL,
  `diem` int NOT NULL,
  KEY `mavong` (`mavong`),
  KEY `madoi` (`madoi`),
  CONSTRAINT `bxh_ibfk_1` FOREIGN KEY (`mavong`) REFERENCES `vongdau` (`mavongdau`),
  CONSTRAINT `bxh_ibfk_2` FOREIGN KEY (`madoi`) REFERENCES `clb` (`madoi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bxh`
--

LOCK TABLES `bxh` WRITE;
/*!40000 ALTER TABLE `bxh` DISABLE KEYS */;
INSERT INTO `bxh` VALUES (1,1,1,1,1,0,0,3,2,1,3),(5,1,33,1,0,1,0,2,3,-1,0),(3,1,27,1,1,0,0,2,1,1,3),(7,1,32,1,0,1,0,1,2,-1,0),(2,1,22,1,1,0,0,3,2,1,3),(6,1,37,1,0,1,0,2,3,-1,0),(8,1,29,1,0,1,0,1,2,-1,0),(4,1,31,1,1,0,0,2,1,1,3),(1,2,22,2,2,0,0,6,3,3,6),(2,2,37,2,0,2,0,3,6,-3,0);
/*!40000 ALTER TABLE `bxh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clb`
--

DROP TABLE IF EXISTS `clb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clb` (
  `madoi` int NOT NULL AUTO_INCREMENT,
  `tendoi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `doitruong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `HLV` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `socauthu` int NOT NULL,
  `linkanh` text COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`madoi`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clb`
--

LOCK TABLES `clb` WRITE;
/*!40000 ALTER TABLE `clb` DISABLE KEYS */;
INSERT INTO `clb` VALUES (1,'Arsenal','Ben White','Mikel Arteta',3,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\arsenal.png'),(2,'Liverpool','Alisson Becker','Jurgen Klopp',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\LIV.png'),(3,'Leicester City','AAA','Thomas Tuchel',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\LEI.png'),(4,'Watford','QQQ','Thomas Tuchel',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\WAT.png'),(21,'Southampton','CCCCCCC','Thomas Tuchel',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\SOT.png'),(22,'Burnley','HHHH','Thomas Tuchel',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\BUR.png'),(23,'Man City','111','222',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\MNC.png'),(24,'West Ham','222','111',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\WHU.png'),(25,'Man Utd','333','22',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\MNU.png'),(27,'Brighton','333','444',1,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\BRI.png'),(28,'Tottenham','333','444',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\TOT.png'),(29,'Everton','333','444',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\EVE.png'),(31,'Crystal Palace','66','77',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\CRY.png'),(32,'Brentford','777','88',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\BRF.png'),(33,'Aston Villa','5','2',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\AST.png'),(34,'Leeds','22','11',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\LEE.png'),(35,'Newcastle','66','77',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\NEW.png'),(36,'Norwich','33','44',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\NOR.png'),(37,'Chelsea','22','333',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\CHE.png'),(76,'Wolverhampton','123','123',0,'C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\club\\WOL.png');
/*!40000 ALTER TABLE `clb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kqtd`
--

DROP TABLE IF EXISTS `kqtd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kqtd` (
  `makqtd` int NOT NULL AUTO_INCREMENT,
  `matran` int NOT NULL,
  `madoi1` int NOT NULL,
  `madoi2` int NOT NULL,
  `SVD` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `thoigian` date NOT NULL,
  `banthang1` int NOT NULL,
  `banthang2` int NOT NULL,
  PRIMARY KEY (`makqtd`),
  KEY `matran` (`matran`),
  KEY `madoi1` (`madoi1`),
  KEY `madoi2` (`madoi2`),
  CONSTRAINT `kqtd_ibfk_1` FOREIGN KEY (`matran`) REFERENCES `trandau` (`matran`),
  CONSTRAINT `kqtd_ibfk_2` FOREIGN KEY (`madoi1`) REFERENCES `clb` (`madoi`),
  CONSTRAINT `kqtd_ibfk_3` FOREIGN KEY (`madoi2`) REFERENCES `clb` (`madoi`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kqtd`
--

LOCK TABLES `kqtd` WRITE;
/*!40000 ALTER TABLE `kqtd` DISABLE KEYS */;
INSERT INTO `kqtd` VALUES (2,1,1,33,'ABC','2001-12-12',3,2),(3,2,32,27,'CDE','2000-11-11',1,2),(5,11,22,37,'12','2000-12-12',3,1),(10,3,22,37,'12','2000-12-12',3,2),(11,4,31,29,'12','2000-02-12',2,1);
/*!40000 ALTER TABLE `kqtd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thongtincauthu`
--

DROP TABLE IF EXISTS `thongtincauthu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thongtincauthu` (
  `macauthu` int NOT NULL AUTO_INCREMENT,
  `madoi` int NOT NULL,
  `tencauthu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `soao` int NOT NULL,
  `vitri` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `linkanh` text COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`macauthu`),
  KEY `madoi` (`madoi`),
  CONSTRAINT `thongtincauthu_ibfk_1` FOREIGN KEY (`madoi`) REFERENCES `clb` (`madoi`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thongtincauthu`
--

LOCK TABLES `thongtincauthu` WRITE;
/*!40000 ALTER TABLE `thongtincauthu` DISABLE KEYS */;
INSERT INTO `thongtincauthu` VALUES (26,1,'DDDA','2001-12-01',24,'Thủ môn','C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\player\\Leno.jpg'),(27,1,'AAAA','2000-12-12',12,'Tiền đạo','C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\player\\Bellerin.jpg'),(28,1,'123','2001-12-12',23,'tiền đạo','C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\player\\Ramsdale.jpg'),(30,27,'ABSDS','2001-01-11',21,'Thủ môn','C:\\Users\\Dell\\Documents\\NetBeansProjects\\football_league_management_1\\src\\image\\player\\Turner.jpg');
/*!40000 ALTER TABLE `thongtincauthu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trandau`
--

DROP TABLE IF EXISTS `trandau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trandau` (
  `matran` int NOT NULL AUTO_INCREMENT,
  `mavong` int NOT NULL,
  `tentran` int NOT NULL,
  PRIMARY KEY (`matran`),
  KEY `mavong` (`mavong`),
  CONSTRAINT `trandau_ibfk_1` FOREIGN KEY (`mavong`) REFERENCES `vongdau` (`mavongdau`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trandau`
--

LOCK TABLES `trandau` WRITE;
/*!40000 ALTER TABLE `trandau` DISABLE KEYS */;
INSERT INTO `trandau` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(10,1,10),(11,2,11),(12,2,12),(13,2,13),(14,2,14),(15,2,15),(16,2,16),(17,2,17),(18,2,18),(19,2,19),(20,2,20),(21,3,21),(22,3,22),(23,3,23),(24,3,24),(25,3,25),(26,3,26),(27,3,27),(28,3,28),(29,3,29),(30,3,30),(31,4,31),(32,4,32),(33,4,33),(34,4,34),(35,4,35),(36,4,36),(37,4,37),(38,4,38),(39,4,39),(40,4,40),(41,5,41),(42,5,42),(43,5,43),(44,5,44),(45,5,45),(46,5,46),(47,5,47),(48,5,48),(49,5,49),(50,5,50),(51,6,51),(52,6,52),(53,6,53),(54,6,54),(55,6,55),(56,6,56),(57,6,57),(58,6,58),(59,6,59),(60,6,60),(61,7,61),(62,7,62),(63,7,63),(64,7,64),(65,7,65),(66,7,66),(67,7,67),(68,7,68),(69,7,69),(70,7,70),(71,8,71),(72,8,72),(73,8,73),(74,8,74),(75,8,75),(76,8,76),(77,8,77),(78,8,78),(79,8,79),(80,8,80);
/*!40000 ALTER TABLE `trandau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vongdau`
--

DROP TABLE IF EXISTS `vongdau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vongdau` (
  `mavongdau` int NOT NULL AUTO_INCREMENT,
  `tenvongdau` int NOT NULL,
  PRIMARY KEY (`mavongdau`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vongdau`
--

LOCK TABLES `vongdau` WRITE;
/*!40000 ALTER TABLE `vongdau` DISABLE KEYS */;
INSERT INTO `vongdau` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8);
/*!40000 ALTER TABLE `vongdau` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-06 21:05:13
