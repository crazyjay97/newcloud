/*
 Navicat Premium Data Transfer

 Source Server         : Local
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : newcloud

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 26/02/2020 21:25:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_test
-- ----------------------------
DROP TABLE IF EXISTS `sys_test`;
CREATE TABLE `sys_test` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `VERSION` varchar(255) DEFAULT NULL,
  `TEST_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_test
-- ----------------------------
BEGIN;
INSERT INTO `sys_test` VALUES (1, 'TEST', '1.0.0', '2020-02-26 18:42:51');
INSERT INTO `sys_test` VALUES (2, 'TEST', '1.0.0', '2020-02-26 19:03:12');
INSERT INTO `sys_test` VALUES (3, 'TEST', '1.0.0', '2020-02-26 19:03:13');
INSERT INTO `sys_test` VALUES (4, 'TEST', '1.0.0', '2020-02-26 19:03:13');
INSERT INTO `sys_test` VALUES (5, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (6, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (7, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (8, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (9, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (10, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (11, 'TEST', '1.0.0', '2020-02-26 19:03:14');
INSERT INTO `sys_test` VALUES (12, 'TEST', '1.0.0', '2020-02-26 19:03:15');
INSERT INTO `sys_test` VALUES (13, 'TEST', '1.0.0', '2020-02-26 19:03:15');
INSERT INTO `sys_test` VALUES (14, 'TEST', '1.0.0', '2020-02-26 19:03:15');
INSERT INTO `sys_test` VALUES (15, 'TEST', '1.0.0', '2020-02-26 19:03:15');
INSERT INTO `sys_test` VALUES (16, 'TEST', '1.0.0', '2020-02-26 19:03:15');
INSERT INTO `sys_test` VALUES (17, 'TEST', '1.0.0', '2020-02-26 19:03:15');
INSERT INTO `sys_test` VALUES (18, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (19, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (20, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (21, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (22, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (23, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (24, 'TEST', '1.0.0', '2020-02-26 19:03:16');
INSERT INTO `sys_test` VALUES (25, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (26, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (27, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (28, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (29, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (30, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (31, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (32, 'TEST', '1.0.0', '2020-02-26 19:03:17');
INSERT INTO `sys_test` VALUES (33, 'TEST', '1.0.0', '2020-02-26 21:21:18');
COMMIT;

-- ----------------------------
-- Table structure for sys_test_example
-- ----------------------------
DROP TABLE IF EXISTS `sys_test_example`;
CREATE TABLE `sys_test_example` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `TEST_ID` int DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_test_example
-- ----------------------------
BEGIN;
INSERT INTO `sys_test_example` VALUES (1, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (2, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (3, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (4, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (5, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (6, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (7, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (8, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (9, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (10, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
INSERT INTO `sys_test_example` VALUES (11, 1, 'I AM IRON MAN', 'LOVE 3000 TIMES');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
