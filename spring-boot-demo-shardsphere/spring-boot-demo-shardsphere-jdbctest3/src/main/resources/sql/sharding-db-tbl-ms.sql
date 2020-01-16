/*
SQLyog Community v13.1.2 (64 bit)
MySQL - 5.7.26-log : Database - cool
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cool` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cool`;



/*Table structure for table `user_0` */

DROP TABLE IF EXISTS `user_0`;

CREATE TABLE `user_0` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8;

/*Table structure for table `user_1` */

DROP TABLE IF EXISTS `user_1`;

CREATE TABLE `user_1` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8;

/*Table structure for table `user_2` */

DROP TABLE IF EXISTS `user_2`;

CREATE TABLE `user_2` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8;

/*Table structure for table `user_3` */

DROP TABLE IF EXISTS `user_3`;

CREATE TABLE `user_3` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `user_4`;

CREATE TABLE `user_4` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_user_0;
CREATE TABLE t_user_0(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_1;
CREATE TABLE t_user_1(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_2;
CREATE TABLE t_user_2(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_3;
CREATE TABLE t_user_3(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_4;
CREATE TABLE t_user_4(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


/*
SQLyog Community v13.1.2 (64 bit)
MySQL - 5.7.26-log : Database - cool
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cool2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cool2`;



/*Table structure for table `user_0` */

DROP TABLE IF EXISTS `user_0`;

CREATE TABLE `user_0` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8;

/*Table structure for table `user_1` */

DROP TABLE IF EXISTS `user_1`;

CREATE TABLE `user_1` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8;

/*Table structure for table `user_2` */

DROP TABLE IF EXISTS `user_2`;

CREATE TABLE `user_2` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8;

/*Table structure for table `user_3` */

DROP TABLE IF EXISTS `user_3`;

CREATE TABLE `user_3` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user_4`;

CREATE TABLE `user_4` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS t_user_0;
CREATE TABLE t_user_0(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_1;
CREATE TABLE t_user_1(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_2;
CREATE TABLE t_user_2(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_3;
CREATE TABLE t_user_3(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);
DROP TABLE IF EXISTS t_user_4;
CREATE TABLE t_user_4(
	user_id int PRIMARY key,
	user_name varchar(30) not null,
	user_work varchar(50) ,
	user_tel varchar(20),
	user_age int,
	user_sex varchar(10),
	user_email varchar(50),
	user_desc VARCHAR(2000)
);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
