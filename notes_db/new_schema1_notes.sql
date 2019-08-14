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
-- Table structure for table `notes`
--

DROP TABLE IF EXISTS `notes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notes` (
  `note_id` int(11) NOT NULL AUTO_INCREMENT,
  `faculty_id` int(11) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `path` varchar(500) DEFAULT NULL,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `type` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`note_id`),
  KEY `fk8` (`faculty_id`),
  CONSTRAINT `fk8` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`faculty_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notes`
--

LOCK TABLES `notes` WRITE;
/*!40000 ALTER TABLE `notes` DISABLE KEYS */;
INSERT INTO `notes` VALUES (1,4,'Cloud Computing','Information about cloud computing','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\1.pdf','2014-07-29 09:32:36','pdf'),(2,4,'Cloud Computing','Information about cloud computing','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\2.pdf','2014-07-29 09:32:39','pdf'),(12,3,'IMAGE 12','image test','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\6.jpg','2014-07-30 15:28:25','Image'),(13,3,'title 123','122','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\13.jpg','2014-07-30 15:30:04','Image'),(16,2,'cs1','bvfhgdfjgh','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\14.pdf','2014-07-31 08:19:36','pdf'),(17,1,'cs1','nckjfbvkjfv','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\17.pdf','2014-07-31 08:24:05','pdf'),(18,1,'jvhfbh','vbhfgbdfh','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\18.jpg','2014-07-31 08:25:19','Image'),(19,1,'megha','bcdhfj','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\notes\\19.jpg','2014-07-31 08:27:52','Image');
/*!40000 ALTER TABLE `notes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-31 15:41:51
