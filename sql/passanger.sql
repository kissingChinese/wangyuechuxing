/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : service-passenger-user

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 13/05/2024 21:52:03
*/
create database `passanger`;
use passanger;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for passenger_user
-- ----------------------------
DROP TABLE IF EXISTS `passenger_user`;
CREATE TABLE `passenger_user`  (
                                   `id` bigint unsigned NOT NULL,
                                   `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
                                   `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
                                   `passenger_phone` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                   `passenger_surname` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                   `passenger_name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                   `passenger_gender` tinyint(1) NULL DEFAULT 1 COMMENT '1：男，2：女',
                                   `state` tinyint(1) NULL DEFAULT 0 COMMENT '0：有效，1：失效',
                                   `profile_photo` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像图片地址的url',
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of passenger_user
-- ----------------------------
INSERT INTO `passenger_user` VALUES (1, '2022-06-21 17:17:21', '2024-05-01 18:22:59', '18178101668', '张', '张三', 1, 0, 'pic.msb.com');
INSERT INTO `passenger_user` VALUES (2, '2023-11-23 18:10:25', '2024-05-01 18:23:02', '15593318164', '牛', '阿牛', 1, 0, NULL);
INSERT INTO `passenger_user` VALUES (3, '2023-11-23 18:21:11', '2024-05-01 18:23:05', '18132241747', '王', '王五', 1, 0, NULL);

SET FOREIGN_KEY_CHECKS = 1;
