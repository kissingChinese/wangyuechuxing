/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : service-price

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 13/05/2024 21:56:47
*/
create database `price`;
use `price`;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for price_rule
-- ----------------------------
DROP TABLE IF EXISTS `price_rule`;
CREATE TABLE `price_rule`  (
                               `id` int(0) NOT NULL AUTO_INCREMENT,
                               `city_code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '城市代码',
                               `vehicle_type` char(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆类型',
                               `start_fare` double(4, 2) NULL DEFAULT NULL COMMENT '起步价',
                               `start_mile` int(0) NULL DEFAULT NULL,
                               `unit_price_per_mile` double(4, 2) NULL DEFAULT NULL,
                               `unit_price_per_minute` double(4, 2) NULL DEFAULT NULL,
                               `fare_version` int(0) NULL DEFAULT 1,
                               `fare_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                               PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of price_rule
-- ----------------------------
INSERT INTO `price_rule` VALUES (1, '110000', '1', 10.00, 3, 1.80, 0.30, 1, '110000$1');
INSERT INTO `price_rule` VALUES (2, '620100', '1', 10.00, 3, 1.80, 0.30, 1, '620100$1');
INSERT INTO `price_rule` VALUES (3, '620800', '1', 10.00, 3, 1.80, 0.30, 1, '620800$1');
INSERT INTO `price_rule` VALUES (4, '621100', '1', 10.00, 3, 1.80, 0.30, 1, '621100$1');
INSERT INTO `price_rule` VALUES (5, '650100', '1', 10.00, 3, 1.80, 0.30, 1, '650100$1');
INSERT INTO `price_rule` VALUES (8, '110000', '2', 10.00, 3, 1.80, 0.50, 1, '110000$2');

SET FOREIGN_KEY_CHECKS = 1;
