 `librarymanagement`.CREATE DATABASE `librarymanagement` /*!40100 DEFAULT CHARACTER SET latin1 */;

DROP TABLE IF EXISTS `librarymanagement`.`addbook`;
CREATE TABLE  `librarymanagement`.`addbook` (
  `bookno` int(10) unsigned NOT NULL DEFAULT '0',
  `name` varchar(45) NOT NULL DEFAULT '',
  `author` varchar(45) NOT NULL DEFAULT '',
  `publisher` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`bookno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `librarymanagement`.`bookstdent`;
CREATE TABLE  `librarymanagement`.`bookstdent` (
  `booknumber` int(10) unsigned NOT NULL DEFAULT '0',
  `studentnum` int(10) unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `librarymanagement`.`students`;
CREATE TABLE  `librarymanagement`.`students` (
  `stuid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `rollno` varchar(45) NOT NULL DEFAULT '0',
  `stdname` varchar(45) NOT NULL DEFAULT '',
  `stdmobile` varchar(45) NOT NULL DEFAULT '0',
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `librarymanagement`.`adminregister`;
CREATE TABLE  `librarymanagement`.`adminregister` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fullname` varchar(45) NOT NULL DEFAULT '',
  `username` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) NOT NULL DEFAULT '',
  `emailid` varchar(45) NOT NULL DEFAULT '',
  `mobileno` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `librarymanagement`.`librarianregister`;
CREATE TABLE  `librarymanagement`.`librarianregister` (
  `librarianId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `librarianName` varchar(45) NOT NULL DEFAULT '',
  `librarianEmail` varchar(45) NOT NULL DEFAULT '',
  `librarianPassword` varchar(45) NOT NULL DEFAULT '',
  `librarianMobileNumber` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`librarianId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;