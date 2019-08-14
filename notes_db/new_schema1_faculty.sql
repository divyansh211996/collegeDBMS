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
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty` (
  `faculty_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT '123456',
  `department_name` varchar(100) DEFAULT NULL,
  `course_name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `qualification` varchar(100) DEFAULT NULL,
  `experience` varchar(45) DEFAULT NULL,
  `photo` varchar(500) DEFAULT 'NO',
  PRIMARY KEY (`faculty_id`),
  KEY `fk4` (`department_name`),
  KEY `fk5` (`course_name`),
  CONSTRAINT `fk4` FOREIGN KEY (`department_name`) REFERENCES `course` (`department_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk5` FOREIGN KEY (`course_name`) REFERENCES `course` (`course_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (1,'Mr.Harpreet Kaur','1234','Department of CSE','B.Tech','harpreet45@gmail,com','75082384700','Amritsar','B.Tech,M.Tech','5 years','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\faculty\\1.jpg'),(2,'Mr.Satish Kumar','1234','Department of CSE','M.Tech','Satish164@gmail.com','7896785678','Amritsar','B.Tech,M.Tech','2 years','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\faculty\\2.jpg'),(3,'Ms.Amanpreet Kaur','123456','Department of CSE','B.Tech','aman456@gmail.com','6789876678','Amritsar','B.Tech,M.Tech','5 years','NO'),(4,'Ms.Nidhika Uppal','123456','Department of CSE','B.Tech','nidhika@gmail.com','6785675645','Amritsar','B.Tech,M.Tech','4 years','NO'),(5,'Mr.YogeshwarSingh','123456','Department of CSE','M.Tech','yogesh@gmail.com','4567897845','Amritsar','B.Tech,M.Tech,Ph.D','6 years','C:\\Users\\vaishali\\Documents\\NetBeansProjects\\NotesShaing\\Project pic\\faculty\\5.jpg'),(6,'Dr.Rajiv Mahajan','123456','Department of CSE','M.Tech','rajiv@gmail.com','567890897','amritsar','B.Tech,M.Tech,Ph.D','6 years','NO'),(7,'Ms.Saloni Arora','123456','Department of ECE','B.Tech','saloni@gmail.com','3456789078','Amritsar','B.Tech,M.Tech','5 years','NO'),(8,'Ms.Chandanpreet Kaur','123456','Department of ECE','B.Tech','chandan45@gmail.com','4567897898','amritsar`','B.Tech,M.Tech','5 years','NO'),(9,'Mr.Hardeep Singh','123456','Department of CSE','B.Tech','hardeep@gmail.com','6787564567','Amritsar','B.Tech,M.Tech','5 years','NO'),(10,'Ms.Navdeep Kaur Randhawa','123456','Department of ECE','M.Tech','nav@gmail.com','6789786767','Amritsar','B.Tech,M.Tech','6 years','NO'),(11,'Mr.Navpreet Singh','123456','Department of ECE','M.Tech','navpreet567@gmail.com','5678453456','Amritsar','B.Tech,M.Tech','6 years','NO'),(12,'Ms.Aditi Ohri','123456','Department of MBA','Finance','aditi@gmail.com','4567876545','Amritsar','MBA,Ph.D','4 years','NO'),(13,'Ms.Pawandeep Kaur','123456','Department of MBA','Finance','pawan@gmai.com','4567453434','Amritsar','M.Sc,MBA','4 years','NO'),(19,'Ms.Vishwajyoti','123456','Department of MCA','Chemistry','vishwajyoti456@gmail.com','3565345676','Amritsar','M.Sc.(Org.Chemistry)','5 years','NO'),(20,'Ms.Pallavi Sharma','123456','Department of MCA','Chemistry','pallavi789@gmail.com','5467564567','Amritsar','M.Sc.(Chemistry)','5 years','NO'),(21,'Mr.Prabhjot Singjh','123456','Department of MCA','Mathematics','prabh@gmail.com','4567876787','Amritsar','M.Sc.(maths)','7 years','NO'),(22,'Ms.Shivani Sanan','123456','Department of MCA','Mathematics','shivani@gmail.com','3456765645','Amritsar','MSc.(Maths)','5 years','NO'),(23,'Ms.Deepshikha','123456','Department of MCA','Mathematics','deep56@gmail.com','4567876756','Amritsar','M.Sc(Maths),B.Ed','5 years','NO'),(24,'Mr.Sardar Singh','123456','Department of MBA','HRM','abc@gmail.com','5678675678','Amritsar','B.Lib,M.Lib,M.Phil','5years','NO'),(25,'Mr.Dilraj Singh','123456','Department of MBA','Marketing','dilraj@gmail.com','5678456787','Amritsar','B.P.Ed,M.P.ed','5 years','NO'),(26,'Ms.Manpreet Kaur','123456','Department of Mechanical','B.Tech','manpreet@gmail.com','5678675645','Amritsar','B.Tech,M.Tech(ME)','5 years','NO'),(27,'Mr.Talwinder Singh','123456','Department of Mechanical','B.Tech','talwinder@gmail.com','4567876756','Amritsar','B.Tech,M.Tech(ME)','5 years','NO'),(28,'Mr.Amrinder Singh','123456','Department of Mechanical','B.Tech','aman567@gmail.com','4783849449','Amritsar','B.Tech,M.Tech(ME)','4 years','NO');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
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
