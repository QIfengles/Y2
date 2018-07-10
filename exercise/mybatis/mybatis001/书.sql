DROP DATABASE IF EXISTS book;
CREATE DATABASE book;
USE book;


DROP TABLE IF EXISTS bookinfo;
CREATE TABLE bookinfo(
      
       id  INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
       `name` VARCHAR(10) NOT NULL COMMENT '书名',
       isbn VARCHAR(20) NOT NULL COMMENT '出版商',
       price INT(10) NOT NULL COMMENT '价格',
       discount INT(10) NOT NULL COMMENT '折扣',
       publisher VARCHAR(50) NOT NULL COMMENT '出版社'
)ENGINE = INNODB CHARSET = utf8;

SELECT * FROM bookinfo;
INSERT INTO bookinfo(`name`,isbn,price,discount,publisher)VALUES('起风了','北京',29,5,'电子工业出版社');
INSERT INTO bookinfo(`name`,isbn,price,discount,publisher)VALUES('风中奇缘','日本',39,3,'商务工业出版社');
INSERT INTO bookinfo(`name`,isbn,price,discount,publisher)VALUES('等风来','上海',35,5,'计算机出版社');
INSERT INTO bookinfo(`name`,isbn,price,discount,publisher)VALUES('一切随风','北京',23,5,'商务工业出版社');
INSERT INTO bookinfo(`name`,isbn,price,discount,publisher)VALUES('风继续吹','深圳',45,4,'计算机出版社');
INSERT INTO bookinfo(`name`,isbn,price,discount,publisher)VALUES('风起了','北京',29,5,'电子工业出版社');