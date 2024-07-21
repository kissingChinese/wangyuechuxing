/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : service-driver-user

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 13/05/2024 21:51:15
*/
create database `driver`;
use driver;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
                        `id` bigint unsigned NOT NULL,
                        `address` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆所在城市',
                        `vehicle_no` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆号牌',
                        `plate_color` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车牌颜色（1：蓝色，2：黄色，3：黑色，4：白色，5：绿色，9：其他）',
                        `seats` int(0) NULL DEFAULT NULL COMMENT '核定载客位',
                        `brand` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆厂牌',
                        `model` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆型号',
                        `vehicle_type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '1' COMMENT '车辆类型（1：轿车，2：SUV，3：MPV， 4 ：面包车， 9：其他',
                        `owner_name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆所有人',
                        `vehicle_color` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆颜色（1：白色，2：黑色）',
                        `engine_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '发动机号',
                        `vin` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                        `certify_date_a` date NULL DEFAULT NULL COMMENT '车辆注册日期',
                        `fue_type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '燃料类型(1：汽油，2：柴油，3：天然气，4：液化气，5：电动，9：其他）',
                        `engine_displace` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '发动机排量（毫升）',
                        `trans_agency` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆运输证发证机构',
                        `trans_area` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆经验区域',
                        `trans_date_start` date NULL DEFAULT NULL COMMENT '车辆运输证有效期起',
                        `trans_date_end` date NULL DEFAULT NULL COMMENT '车辆运输证有效期止',
                        `certify_date_b` date NULL DEFAULT NULL COMMENT '车辆初次登记日期',
                        `fix_state` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '车辆的检修状态(0：未检修，1：已检修，2：未知）',
                        `next_fix_date` date NULL DEFAULT NULL COMMENT '下次年检时间',
                        `check_state` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '年度审验状态（0：未年审，1：年审合格，2：年审不合格）',
                        `fee_print_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '发票打印设备序列号',
                        `gps_brand` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '卫星定位装置品牌',
                        `gps_model` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '卫星型号',
                        `gps_install_date` date NULL DEFAULT NULL COMMENT '卫星定位设备安装日期',
                        `register_date` date NULL DEFAULT NULL COMMENT '报备日期',
                        `commercial_type` int(0) NULL DEFAULT NULL COMMENT '服务类型：1：网络预约出租车，2：巡游出租车，3：私人小客车合乘',
                        `fare_type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '运价编码 关联计价规则',
                        `state` tinyint(1) NULL DEFAULT 0 COMMENT '状态：0:有效，1：失效',
                        `tid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '终端id',
                        `trid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '轨迹id',
                        `trname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '轨迹名称',
                        `gmt_create` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
                        `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
                        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (1, '110000', '京A2541', '1', 5, '比亚迪', '唐      ', '1', '王五', '2', '55487', NULL, '2023-11-28', '5', '1500', 'aa', '北京', '2023-11-15', '2023-11-25', '2023-11-07', '1', '2023-11-28', '1', '55487', 'ss', 'ss', '2023-11-06', '2023-11-22', 1, '110000$1', 0, NULL, NULL, NULL, '2024-05-01 19:21:03', '2024-05-01 19:21:03');
INSERT INTO `car` VALUES (2, '110000', '京A12345', '1', 5, '奥迪', 'A6', '1', '张三', '1', '123456', 'ABCDEFG123456789', '2022-01-01', '1', '2000', '北京交通局', '北京市', '2022-01-01', '2023-01-01', '2022-01-01', '0', '2023-01-01', '0', '123456', '华为', 'G100', '2022-01-01', '2022-01-01', 1, '110000$2', 0, '794927277', '20', '', '2024-05-01 19:21:05', '2024-05-01 19:21:05');
INSERT INTO `car` VALUES (3, '110000', '京A12346', '1', 5, '奥迪', 'A6', '1', '李四', '1', '123456', 'ABCDEFG123456789', '2022-01-01', '1', '2000', '北京交通局', '北京市', '2022-01-01', '2023-01-01', '2022-01-01', '0', '2023-01-01', '0', '123456', '华为', 'G100', '2022-01-01', '2022-01-01', 1, '110000$3', 0, '795077368', '40', '', '2024-05-01 19:21:08', '2024-05-01 19:21:08');
INSERT INTO `car` VALUES (4, '650100', '京A12347', '1', 5, '奥迪', 'A6', '1', '阿牛', '1', '123456', 'ABCDEFG123456789', '2022-01-01', '1', '2000', '北京交通局', '北京市', '2022-01-01', '2023-01-01', '2022-01-01', '0', '2023-01-01', '0', '123456', '华为', 'G100', '2022-01-01', '2022-01-01', 1, '110000$4', 0, '795079768', '60', '', '2024-05-01 19:21:11', '2024-05-01 19:21:11');

-- ----------------------------
-- Table structure for driver_car_binding_relationship
-- ----------------------------
DROP TABLE IF EXISTS `driver_car_binding_relationship`;
CREATE TABLE `driver_car_binding_relationship`  (
                                                    `id` bigint(0) NOT NULL AUTO_INCREMENT,
                                                    `driver_id` bigint(0) NULL DEFAULT NULL,
                                                    `car_id` bigint(0) NULL DEFAULT NULL,
                                                    `vehicle_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                                    `bind_state` int(0) NULL DEFAULT NULL,
                                                    `binding_time` datetime(0) NULL DEFAULT NULL,
                                                    `un_binding_time` datetime(0) NULL DEFAULT NULL,
                                                    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of driver_car_binding_relationship
-- ----------------------------
INSERT INTO `driver_car_binding_relationship` VALUES (4, 2, 4, '京A12347', 1, '2023-11-26 18:24:18', NULL);

-- ----------------------------
-- Table structure for driver_user
-- ----------------------------
DROP TABLE IF EXISTS `driver_user`;
CREATE TABLE `driver_user`  (
                                `id` bigint unsigned NOT NULL,
                                `address` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '司机注册地行政区划代码',
                                `driver_surname` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '司机姓',
                                `driver_name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '司机姓名',
                                `driver_phone` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                `driver_gender` tinyint(0) NULL DEFAULT NULL COMMENT '1:男，2：女',
                                `driver_birthday` date NULL DEFAULT NULL,
                                `driver_nation` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '驾驶员民族',
                                `total_orders` bigint(0) NULL DEFAULT 0 COMMENT '司机完成总单数',
                                `driver_contact_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                `license_id` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '机动车驾驶证号',
                                `get_driver_license_date` date NULL DEFAULT NULL COMMENT '初次领取驾驶证日期',
                                `driver_license_on` date NULL DEFAULT NULL COMMENT '驾驶证有效期起',
                                `driver_license_off` date NULL DEFAULT NULL COMMENT '驾驶证有效期止',
                                `taxi_driver` tinyint(0) NULL DEFAULT NULL COMMENT '是否巡游出租汽车：1：是，0：否',
                                `certificate_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网络预约出租汽车驾驶员资格证号',
                                `network_car_issue_organization` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '网络预约出租汽车驾驶员发证机构',
                                `network_car_issue_date` date NULL DEFAULT NULL COMMENT '资格证发证日期',
                                `get_network_car_proof_date` date NULL DEFAULT NULL COMMENT '初次领取资格证日期',
                                `network_car_proof_on` date NULL DEFAULT NULL COMMENT '资格证有效起始日期',
                                `network_car_proof_off` date NULL DEFAULT NULL COMMENT '资格证有效截止日期',
                                `register_date` date NULL DEFAULT NULL COMMENT '报备日期',
                                `commercial_type` tinyint(0) NULL DEFAULT NULL COMMENT '服务类型：1：网络预约出租汽车，2：巡游出租汽车，3：私人小客车合乘',
                                `contract_company` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '驾驶员合同（协议）签署公司',
                                `contract_on` date NULL DEFAULT NULL COMMENT '合同（协议）有效期起',
                                `contract_off` date NULL DEFAULT NULL COMMENT '合同有效期止',
                                `state` tinyint(0) NULL DEFAULT 0 COMMENT '司机状态：0：有效，1：失效',
                                `gmt_create` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
                                `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of driver_user
-- ----------------------------
INSERT INTO `driver_user` VALUES (1, '110000', '张', '张红', '13910733522', 1, '2020-01-03', '汉族', 0, '通信地址', '机动车驾驶证号', '2019-01-05', '2019-01-01', '2025-01-01', 1, '网络预约出租汽车驾驶员资格证号', '网络预约出租汽车驾驶员发证机构', '2020-01-02', '2020-01-01', '2020-01-03', '2020-01-03', '2020-02-03', 1, '合约公司', '2022-01-05', '2022-01-06', 0, '2024-04-30 22:08:04', '2024-04-30 22:08:05');
INSERT INTO `driver_user` VALUES (2, '650100', '牛', '阿牛', '15593318163', 1, '2023-11-14', '汉族', 36, '通信地址', '55421', '2023-11-08', '2023-11-14', '2023-11-14', 1, '54236', 'qw', '2023-11-14', '2023-11-15', '2023-11-14', '2023-11-08', '2023-11-14', 1, '合约公司', '2023-11-01', '2023-11-14', 0, '2024-04-30 17:16:28', '2024-05-05 03:13:36');
INSERT INTO `driver_user` VALUES (5, '110000', '张', '张三', '15748965437', 1, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '2024-04-30 22:17:18', '2024-04-30 22:17:18');

-- ----------------------------
-- Table structure for driver_user_work_status
-- ----------------------------
DROP TABLE IF EXISTS `driver_user_work_status`;
CREATE TABLE `driver_user_work_status`  (
                                            `id` bigint(0) NOT NULL AUTO_INCREMENT,
                                            `driver_id` bigint(0) NULL DEFAULT NULL,
                                            `work_status` int(0) NULL DEFAULT NULL,
                                            `gmt_create` datetime(0) NULL DEFAULT NULL,
                                            `gmt_modified` datetime(0) NULL DEFAULT NULL,
                                            PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of driver_user_work_status
-- ----------------------------
INSERT INTO `driver_user_work_status` VALUES (1, 2, 1, '2023-11-21 15:32:34', '2024-05-03 00:02:49');
INSERT INTO `driver_user_work_status` VALUES (2, 3, 0, '2024-04-30 22:08:44', '2024-04-30 22:08:44');
INSERT INTO `driver_user_work_status` VALUES (3, 4, 0, '2024-04-30 22:13:09', '2024-04-30 22:13:09');
INSERT INTO `driver_user_work_status` VALUES (4, 5, 0, '2024-04-30 22:17:18', '2024-04-30 22:17:18');

SET FOREIGN_KEY_CHECKS = 1;
