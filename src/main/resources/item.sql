SET sql_mode = '';

CREATE DATABASE IF NOT EXISTS microservices_training_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE microservices_training_db;

CREATE TABLE IF NOT EXISTS item
(
  id               Bigint(11) NOT NULL AUTO_INCREMENT,
  name             VARCHAR(50) NOT NULL,
  category         VARCHAR(50) NOT NULL,
  sub_category     VARCHAR(50) NOT NULL,
  quantity         Bigint(11) NOT NULL,
  PRIMARY KEY (id)
);