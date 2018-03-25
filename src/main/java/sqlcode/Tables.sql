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