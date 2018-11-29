/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.19-log : Database - hod_meeting
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hod_meeting` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hod_meeting`;

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(50) DEFAULT NULL,
  `hod_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`dept_id`),
  KEY `hod_id` (`hod_id`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`hod_id`) REFERENCES `hod` (`hod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`dept_id`,`dept_name`,`hod_id`) values (15,'CS',1),(16,'CS',1),(17,'AAA',3),(18,'CS',4),(19,'CSP',5);

/*Table structure for table `hod` */

DROP TABLE IF EXISTS `hod`;

CREATE TABLE `hod` (
  `hod_id` int(11) NOT NULL AUTO_INCREMENT,
  `logid` int(11) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`hod_id`),
  KEY `logid` (`logid`),
  CONSTRAINT `hod_ibfk_1` FOREIGN KEY (`logid`) REFERENCES `login` (`logid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `hod` */

insert  into `hod`(`hod_id`,`logid`,`fname`,`lname`,`phone`,`email`) values (1,2,'JUNAID','KP','7894561339','junaid@gmail.com'),(2,3,'SHEFEEK','CK','1234567891','shefi@gmail.com'),(3,4,'AKHIL','B','0987654321','a@gmail.com'),(4,5,'QWE','ASDF','1234567890','ASD@GMAIL.COM'),(5,6,'QWE','ASDF','1234567890','ASD@GMAIL.COM');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `login` */

insert  into `login`(`logid`,`username`,`password`,`type`) values (1,'admin','admin','admin'),(2,'junaid','junaid','hod'),(3,'ss','ss','hod'),(4,'a2','a2','hod'),(5,'A','A','hod'),(6,'A','l','hod'),(7,'b','b','staff'),(8,'anu','anu','staff'),(9,'mi','mi','staff'),(10,'aj','aj','staff'),(11,'dd','dd','staff');

/*Table structure for table `meeting` */

DROP TABLE IF EXISTS `meeting`;

CREATE TABLE `meeting` (
  `meeting_id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_title` varchar(50) DEFAULT NULL,
  `generated_date` varchar(50) DEFAULT NULL,
  `meeting_date` varchar(50) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL,
  `venue` varchar(50) DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`meeting_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `meeting` */

insert  into `meeting`(`meeting_id`,`meeting_title`,`generated_date`,`meeting_date`,`time`,`venue`,`message`,`status`) values (1,'AAAA','11/3/18 11:30 AM','2018-11-05','10:30','SEMINAR HALL','AAA','open'),(2,'NEW','11/14/18 4:30 PM','2018-11-15','13:06','SEMINAR HALL','ALL SHOULD BE PRESENT','open');

/*Table structure for table `meeting_reply` */

DROP TABLE IF EXISTS `meeting_reply`;

CREATE TABLE `meeting_reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `hod_id` int(11) DEFAULT NULL,
  `meeting_id` int(11) DEFAULT NULL,
  `reply_message` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `hod_id` (`hod_id`),
  KEY `meeting_id` (`meeting_id`),
  CONSTRAINT `meeting_reply_ibfk_1` FOREIGN KEY (`hod_id`) REFERENCES `hod` (`hod_id`),
  CONSTRAINT `meeting_reply_ibfk_2` FOREIGN KEY (`meeting_id`) REFERENCES `meeting` (`meeting_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `meeting_reply` */

insert  into `meeting_reply`(`reply_id`,`hod_id`,`meeting_id`,`reply_message`,`date`) values (1,2,1,'ok','2018-11-03'),(2,3,1,'hiiii','2018-11-14'),(3,4,2,'not avail','2018-11-14');

/*Table structure for table `meeting_status` */

DROP TABLE IF EXISTS `meeting_status`;

CREATE TABLE `meeting_status` (
  `meet_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_id` int(11) DEFAULT NULL,
  `hod_id` int(11) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`meet_status_id`),
  KEY `meeting_id` (`meeting_id`),
  KEY `hod_id` (`hod_id`),
  CONSTRAINT `meeting_status_ibfk_1` FOREIGN KEY (`meeting_id`) REFERENCES `meeting` (`meeting_id`),
  CONSTRAINT `meeting_status_ibfk_2` FOREIGN KEY (`hod_id`) REFERENCES `hod` (`hod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `meeting_status` */

insert  into `meeting_status`(`meet_status_id`,`meeting_id`,`hod_id`,`status`) values (4,1,2,'Not Available'),(5,1,2,'Not Available'),(6,2,1,'pending'),(7,2,3,'Not Available'),(8,2,3,'Available'),(9,2,3,'Not Available');

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `logid` int(11) DEFAULT NULL,
  `hod_id` int(11) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`staff_id`),
  KEY `logid` (`logid`),
  KEY `hod_id` (`hod_id`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`logid`) REFERENCES `login` (`logid`),
  CONSTRAINT `staff_ibfk_2` FOREIGN KEY (`hod_id`) REFERENCES `hod` (`hod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`staff_id`,`logid`,`hod_id`,`fname`,`lname`,`phone`,`email`,`qualification`) values (1,7,1,'bb',NULL,NULL,NULL,NULL),(2,8,3,'Anu','m','9865236589','anu@gmail.com','mca'),(3,9,3,'Minu','k','968523652','minu@gmail.com','mca'),(4,10,2,'Aji','m','9655555556','aji@gm.com','mca'),(5,11,3,'Deena','kk','986523658','deena@gmail.com','mca');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
