/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : springbootdb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-05-26 10:16:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for asset
-- ----------------------------
DROP TABLE IF EXISTS `asset`;
CREATE TABLE `asset` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `recod_date` date NOT NULL COMMENT '记录日期',
  `alipay` float(10,2) unsigned DEFAULT NULL COMMENT '支付宝',
  `tenpay` float(10,2) unsigned DEFAULT NULL COMMENT '腾讯理财通',
  `ceb` float(10,2) unsigned DEFAULT NULL COMMENT '广大银行',
  `zjrc` float(10,2) unsigned DEFAULT NULL COMMENT '浙江农信',
  `other_bank` float(10,2) unsigned DEFAULT NULL COMMENT '其他银行',
  `current` float(10,2) unsigned DEFAULT NULL COMMENT '活期',
  `dad_money` float(10,2) unsigned DEFAULT NULL COMMENT '老公私房钱',
  `cash` float(10,2) unsigned DEFAULT NULL COMMENT '现金',
  `others` float(10,2) unsigned DEFAULT NULL COMMENT '其他',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of asset
-- ----------------------------

-- ----------------------------
-- Table structure for expense
-- ----------------------------
DROP TABLE IF EXISTS `expense`;
CREATE TABLE `expense` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `month` date NOT NULL COMMENT '月份',
  `total_pay` float(10,2) unsigned DEFAULT NULL COMMENT '花销额',
  `from_who` varchar(25) DEFAULT NULL COMMENT '谁的花销',
  `info` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `traffic_pay` float(10,2) unsigned DEFAULT NULL COMMENT '交通花费',
  `traffic_info` varchar(255) DEFAULT NULL COMMENT '交通备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expense
-- ----------------------------

-- ----------------------------
-- Table structure for money_management
-- ----------------------------
DROP TABLE IF EXISTS `money_management`;
CREATE TABLE `money_management` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `begin_date` date DEFAULT NULL COMMENT '开始日期',
  `platform` varchar(25) NOT NULL COMMENT '理财平台',
  `name` varchar(25) NOT NULL COMMENT '理财产品名称',
  `rate_of_return` float(25,0) unsigned DEFAULT NULL COMMENT '利率',
  `capital_sum` float(10,2) unsigned NOT NULL COMMENT '本金',
  `locking_date` date DEFAULT NULL COMMENT '锁定时间',
  `belong` varchar(10) NOT NULL COMMENT '财主',
  `interest` float(10,2) unsigned DEFAULT NULL COMMENT '到期利息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of money_management
-- ----------------------------
