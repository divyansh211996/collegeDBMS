CREATE DATABASE  IF NOT EXISTS `new_schema1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `new_schema1`;
-- MySQL dump 10.13  Distrib 5.5.9, for Win32 (x86)
--
-- Host: localhost    Database: new_schema1
-- ------------------------------------------------------
-- Server version	5.5.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `university_rollno` int(11) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `department_name` varchar(300) DEFAULT NULL,
  `course_name` varchar(300) DEFAULT NULL,
  `photo` varchar(500) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`university_rollno`),
  KEY `fk6` (`department_name`),
  KEY `fk7` (`course_name`),
  CONSTRAINT `fk6` FOREIGN KEY (`department_name`) REFERENCES `course` (`department_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk7` FOREIGN KEY (`course_name`) REFERENCES `course` (`course_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (123,'9634','Department of CSE','B.Tech',NULL,'meghasaroch44@gmail.com','9876543210',' vdjgdy'),(123425,'3956','Department of CSE','M.Tech',NULL,'def@gmail.com','5372826372','Amritsar'),(125467,'3885','Department of CSE','M.Tech',NULL,'shivanjali@gmail.com','5463728192','Amritsar'),(653648,'8117','Department of MBA','Finance',NULL,'tavishka@gmail.com','6354637281','Amritsar'),(1234257,'4315','Department of ECE','M.Tech',NULL,'shaila@gmail.com','4356278867','Amritsar'),(1234526,'4400','Department of ECE','B.Tech',NULL,'prabsharan@gmail.com','5463729108','Amritsar'),(1234688,'7449','Department of CSE','M.Tech',NULL,'simar@gmail.com','5463728198','Amritsar'),(1243143,'123','Department of CSE','B.Tech',NULL,'prabh324@gmail.com','9414567811','Amritsar'),(1243163,'123','Department of CSE','B.Tech',NULL,'vaishali@gmail.com','5678902342','Amritsar'),(1243165,'3786','Department of CSE','B.Tech',NULL,'abc@gmail.com','4536738291','Amritsar'),(1243543,'6054','Department of MBA','Finance',NULL,'Anjali@gmail.com','4352783919','Amritsar'),(1243567,'6329','Department of CSE','B.Tech',NULL,'innovativemuskaan@gmail.com','4563787383','Amritsar'),(1243789,'8276','Department of CSE','B.Tech',NULL,'nav@gmail.com','4357896899','Amritsar'),(1342577,'3286','Department of ECE','B.Tech',NULL,'navleen@gmail.com','5648726478','Amritsar'),(2314579,'5062','Department of ECE','M.Tech',NULL,'sakshi@gmail.com','4352648863','Amritsar'),(12343627,'8986','Department of ECE','B.Tech',NULL,'mehak@gmail.com','5463728193','Amritsar'),(12435689,'9318','Department of MBA','Finance',NULL,'radhika@gmail.com','5463728192','Amritsar'),(65483893,'7635','Department of ECE','M.Tech',NULL,'prabjit@gmail.com','5463728193','Amritsar');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-31 15:41:50
