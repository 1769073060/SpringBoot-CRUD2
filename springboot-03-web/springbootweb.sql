/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : springbootweb

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-05-28 22:09:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `departmentName` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '市场部');
INSERT INTO `department` VALUES ('2', '技术部');
INSERT INTO `department` VALUES ('3', '销售部');
INSERT INTO `department` VALUES ('4', '客服部');
INSERT INTO `department` VALUES ('5', '公关部');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮箱',
  `gender` int(10) DEFAULT NULL COMMENT '性别(1:女,2:男)',
  `departmentId` int(11) NOT NULL,
  `date` datetime DEFAULT NULL COMMENT '出生日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三133323', 'zhangsan@gmail.com', '0', '1', '2020-02-21 00:00:00');
INSERT INTO `employee` VALUES ('2', '李四1', 'lisi@qq.com', '1', '2', '2020-02-11 00:00:00');
INSERT INTO `employee` VALUES ('3', '王五', 'wangwu@126.com', '0', '3', '2020-02-15 00:00:00');
INSERT INTO `employee` VALUES ('4', '赵六', 'zhaoliu@163.com', '1', '4', '2020-02-21 00:00:00');
INSERT INTO `employee` VALUES ('5', '田七', 'tianqi@foxmail.com', '0', '3', '2020-02-14 00:00:00');
INSERT INTO `employee` VALUES ('6', '王伟', 'wangwei@gmail.com', '1', '3', '2020-02-08 00:00:00');
INSERT INTO `employee` VALUES ('7', '张伟', 'zhangwei@gmail.com', '1', '2', '2020-02-11 00:00:00');
INSERT INTO `employee` VALUES ('9', '111', '222@qq.com', null, '2', '2020-05-20 00:00:00');
INSERT INTO `employee` VALUES ('10', '李四', '111@qq.com', '0', '4', '2020-05-29 00:00:00');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1');
