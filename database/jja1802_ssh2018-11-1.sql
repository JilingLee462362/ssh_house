/*
 Navicat Premium Data Transfer

 Source Server         : tzhu_3306
 Source Server Type    : MySQL
 Source Server Version : 50522
 Source Host           : tzhu:3306
 Source Schema         : jja1802_ssh

 Target Server Type    : MySQL
 Target Server Version : 50522
 File Encoding         : 65001

 Date: 01/11/2018 09:43:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for guanggao
-- ----------------------------
DROP TABLE IF EXISTS `guanggao`;
CREATE TABLE `guanggao`  (
  `ggid` int(11) NOT NULL AUTO_INCREMENT,
  `ggtitle` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ggimg` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ggurl` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ggtime` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ggid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of guanggao
-- ----------------------------
INSERT INTO `guanggao` VALUES (1, '百年润发', 'guanggao/timg.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (2, '百年润发', 'guanggao/gz.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (3, '千年润发', 'guanggao/timg.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (5, '无印良品', 'guanggao/wuyinliangpin.jpg', 'http://www.muji.com.cn/', 15);
INSERT INTO `guanggao` VALUES (6, '百年润发', 'guanggao/gz.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (7, '外星人', 'guanggao/timg.jpg', 'http://www.dell.com.cn', 15);
INSERT INTO `guanggao` VALUES (8, '三只松鼠', 'img/20151030162040_zX3vE.thumb.700_0.gif', 'https://sanzhisongshu.tmall.com/?mm_gxbid=1_1174981_3d70e8ac5079f4bd4e228892a840b9eb', 20);
INSERT INTO `guanggao` VALUES (9, 'vivo智能手机', 'img/u=3403099419,198331705&fm=23&gp=0.jpg', 'http://www.vivo.com.cn/?source=vivo_baidu_brand', 30);
INSERT INTO `guanggao` VALUES (10, '百年润发', 'guanggao/timg.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (11, '123', '123', '12', 123);
INSERT INTO `guanggao` VALUES (12, '你猜是啥', 'guanggao/timg.jpg', 'https://v.qq.com/x/cover/2iqrhqekbtgwp1s/c01350046ds.html?ptag=sogou.cartoon.free&fromvsogou=1', 15);
INSERT INTO `guanggao` VALUES (13, '魅蓝 E2', 'guanggao/Cgbj0FkAUN2ATV5ZAApC2cR5ZJw311.png680x680.jpg', 'https://detail.meizu.com/item/meilane2.html?click=hd_sale_party2_14dian_1', 20);
INSERT INTO `guanggao` VALUES (14, '自我迭代升级', 'guanggao/56.jpg', 'http://www.jianshu.com/p/f54deb1d1bb2', 500);
INSERT INTO `guanggao` VALUES (15, '润发', 'guanggao/timg.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (16, '润发', 'guanggao/gz.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (17, '小米6', 'img/xiaomi.jpg', 'http://www.mi.com/', 40);
INSERT INTO `guanggao` VALUES (18, '润发', 'guanggao/10783362.jpg', 'https://item.taobao.com/item.htm?id=542537937487&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e&ali_refid=a3_430673_1006:1104680592:N:%E6%B6%A6%E5%8F%91%E6%B4%97%E5%8F%91%E6%B0%B4:f4a4033d22a9263c993646e219d79fcd&ali_trackid=1_f4a4033d22a9263c993646e219d79fcd&spm=a2e15.8261149.07626516002.3.RKq39e', 30);
INSERT INTO `guanggao` VALUES (19, '自我迭代升级', 'guanggao/56.jpg', 'http://www.jianshu.com/p/f54deb1d1bb2', 500);

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `user_id` int(100) NULL DEFAULT NULL,
  `type_id` int(100) NULL DEFAULT NULL,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` int(100) NULL DEFAULT NULL,
  `pubdate` date NULL DEFAULT NULL,
  `floorage` int(100) NULL DEFAULT NULL,
  `contact` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `street_id` int(100) NULL DEFAULT NULL,
  `flag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `type_id`(`type_id`) USING BTREE,
  INDEX `street_id`(`street_id`) USING BTREE,
  CONSTRAINT `FKejb0f1e386loliqe2dc889lmr` FOREIGN KEY (`street_id`) REFERENCES `streetnumber` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK35771pxdrce8p2bt8oys80qmg` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK3u8wwj7kr9l3ca517nm23rxw6` FOREIGN KEY (`type_id`) REFERENCES `type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 279 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES (49, 5, 1, ' 房主不要了 ', '厦门好房子', 50000, '2018-10-31', 80, 'test', 4, '出售中');
INSERT INTO `house` VALUES (50, 2, 1, '贵妃7楼小卖部', '走过路过不要错过', 50000, '2017-05-04', 100, '拒绝被撩', 1, NULL);
INSERT INTO `house` VALUES (51, 2, 1, '贵妃8楼小卖部', '走过路过不要错过', 50000, '2017-05-04', 100, '拒绝被撩', 1, NULL);
INSERT INTO `house` VALUES (52, 2, 1, '贵妃9楼小卖部', '走过路过不要错过', 50000, '2017-05-04', 100, '拒绝被撩', 1, NULL);
INSERT INTO `house` VALUES (56, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (57, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (58, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (60, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (61, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (62, 20, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (63, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (64, 2, 1, '海景房', '海边上，空气 好', 10000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (65, 2, 3, '沙滩度假公寓', '面向大海，心暖花开', 5000, '2017-05-04', 10, '只为质量而生', 2, NULL);
INSERT INTO `house` VALUES (69, 2, 1, '楼中楼 -第3号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (70, 34, 1, '楼中楼 -第4号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (71, 2, 1, '楼中楼 -第5号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (72, 2, 1, '楼中楼 -第6号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (73, 2, 1, '楼中楼 -第7号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (74, 2, 1, '楼中楼 -第8号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (75, 2, 1, '楼中楼 -第9号楼', '安逸平静生活好！', 80, '2017-05-04', 20, '舌尖上的小区', 4, NULL);
INSERT INTO `house` VALUES (76, 2, 1, '楼中楼 -第0号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (77, 2, 1, '楼中楼 -第1号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (79, 2, 1, '楼中楼 -第3号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (80, 2, 1, '楼中楼 -第4号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (81, 2, 1, '楼中楼 -第5号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (83, 2, 1, '楼中楼 -第7号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (84, 2, 1, '楼中楼 -第8号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (85, 2, 1, '楼中楼 -第9号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (86, 2, 3, '沙滩度假公寓', '面向大海，心暖花开', 5000, '2017-05-04', 10, '只为质量而生', 2, NULL);
INSERT INTO `house` VALUES (87, 2, 1, '水中阁楼0号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (88, 2, 1, '水中阁楼1号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (89, 2, 1, '水中阁楼2号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (90, 2, 1, '水中阁楼3号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (93, 2, 1, '水中阁楼6号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (94, 2, 1, '水中阁楼7号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (95, 2, 1, '水中阁楼8号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (96, 2, 1, '水中阁楼9号楼', '太湖区，风景 好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (98, 2, 3, '沙滩度假公寓', '面向大海，心暖花开', 5000, '2017-05-04', 10, '只为质量而生', 2, NULL);
INSERT INTO `house` VALUES (99, 2, 1, '第0号楼', '湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (100, 2, 1, '第1号楼', '湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (103, 2, 1, '第4号楼', '湖边上', 1000, '2017-05-04', 80, '河北边上的河南', NULL, NULL);
INSERT INTO `house` VALUES (104, 2, 1, '第5号楼', '湖边上', 1000, '2017-05-04', 80, '河北边上的河南', NULL, NULL);
INSERT INTO `house` VALUES (105, 2, 1, '第6号楼', '湖边上', 1000, '2017-05-04', 80, '河北边上的河南', NULL, NULL);
INSERT INTO `house` VALUES (106, 2, 1, '第7号楼', '湖边上', 1000, '2017-05-04', 80, '河北边上的河南', NULL, NULL);
INSERT INTO `house` VALUES (107, 2, 1, '第8号楼', '湖边上', 1000, '2017-05-04', 80, '河北边上的河南', NULL, NULL);
INSERT INTO `house` VALUES (108, 2, 1, '第9号楼', '湖边上', 1000, '2017-05-04', 80, '河北边上的河南', NULL, NULL);
INSERT INTO `house` VALUES (109, 2, 1, '棚户区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (110, 2, 1, '棚户0区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (111, 2, 1, '棚户1区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (113, 2, 1, '棚户3区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (114, 2, 1, '棚户4区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', NULL, NULL);
INSERT INTO `house` VALUES (116, 2, 1, '水中阁楼0号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (117, 2, 1, '水中阁楼1号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (118, 2, 1, '水中阁楼2号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (119, 2, 1, '水中阁楼3号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (121, 2, 1, '水中阁楼5号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (122, 2, 1, '水中阁楼6号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (123, 2, 1, '水中阁楼7号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (124, 2, 1, '水中阁楼8号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (126, 2, 1, '水中阁楼0号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (127, 2, 1, '水中阁楼1号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (128, 2, 1, '水中阁楼2号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (129, 2, 1, '水中阁楼3号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (130, 2, 1, '水中阁楼4号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (131, 2, 1, '水中阁楼5号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (132, 2, 1, '水中阁楼6号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (133, 2, 1, '水中阁楼7号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (134, 2, 1, '水中阁楼8号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (135, 2, 1, '水中阁楼9号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (136, 2, 3, '中国第一高楼', '空中花园', 9000, '2017-05-04', 100, '中国中心', 3, NULL);
INSERT INTO `house` VALUES (137, 2, 1, '棚户0区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (138, 2, 1, '棚户1区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (140, 2, 1, '棚户3区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (141, 2, 1, '棚户4区', '都是穷人', 500, '2017-05-04', 50, '垃圾场边上', 2, NULL);
INSERT INTO `house` VALUES (142, 2, 1, '水中阁楼0号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (144, 2, 1, '水中阁楼2号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (145, 2, 1, '水中阁楼3号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (146, 2, 1, '水中阁楼4号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (147, 2, 1, '水中阁楼5号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (148, 2, 1, '水中阁楼6号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (149, 2, 1, '水中阁楼7号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (150, 2, 1, '水中阁楼8号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (151, 2, 1, '水中阁楼9号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (152, 2, 1, '水中阁楼0号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (153, 2, 1, '水中阁楼1号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (154, 2, 1, '水中阁楼2号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (155, 2, 1, '水中阁楼3号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (156, 2, 1, '水中阁楼4号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (157, 2, 1, '水中阁楼5号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (158, 2, 1, '水中阁楼6号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (159, 2, 1, '水中阁楼7号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (160, 2, 1, '水中阁楼8号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (161, 2, 1, '水中阁楼9号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (162, 2, 1, '水中阁楼0号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (163, 2, 1, '水中阁楼1号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (165, 2, 1, '水中阁楼3号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (166, 2, 1, '水中阁楼4号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (167, 2, 1, '水中阁楼5号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (168, 2, 1, '水中阁楼6号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (169, 2, 1, '水中阁楼7号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (170, 2, 1, '水中阁楼8号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (171, 2, 1, '水中阁楼9号楼', '太湖区，风水好', 10000, '2017-05-04', 80, '白洋淀边上', 4, NULL);
INSERT INTO `house` VALUES (183, 2, 1, '楼中楼 -第0号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (184, 2, 1, '楼中楼 -第1号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (185, 2, 1, '楼中楼 -第2号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (186, 2, 1, '楼中楼 -第3号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (187, 2, 1, '楼中楼 -第4号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (188, 2, 1, '楼中楼 -第5号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (189, 2, 1, '楼中楼 -第6号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (190, 2, 1, '楼中楼 -第7号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (191, 2, 1, '楼中楼 -第8号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (192, 2, 1, '楼中楼 -第9号楼', '雄湖边上，风景 好', 1000, '2017-05-04', 80, '河北边上的河南', 4, NULL);
INSERT INTO `house` VALUES (197, 2, 1, '海市蜃楼 -第0号楼', '雄湖边上，风景 好', 10000, '2017-05-04', 80, '天庭上的瑶池', 4, NULL);
INSERT INTO `house` VALUES (198, 2, 1, '海市蜃楼 -第1号楼', '雄湖边上，风景 好', 10000, '2017-05-04', 80, '天庭上的瑶池', 4, NULL);
INSERT INTO `house` VALUES (211, 2, 2, '小宝的家', '这房子好大，大草原，随便盖', 800, '2017-12-12', 10, NULL, 5, NULL);
INSERT INTO `house` VALUES (212, 2, 2, '请填写单位名称', '这房子好大,安逸，恬静过好日子', 800, '2017-12-12', 80, '草原儿女：12580', 2, NULL);
INSERT INTO `house` VALUES (213, 2, 3, '高级套房', '这房子好大，以安静舒适为广大人们的首选！！', 1000, '2017-05-10', 10, '15464553694', 2, NULL);
INSERT INTO `house` VALUES (214, 2, 1, '请填写单位名称', '这房子好大', 800, '2017-12-12', 80, '草原儿女：12580', 1, NULL);
INSERT INTO `house` VALUES (218, 2, 1, '大大', '就这样吧', 800, '2017-05-06', 20, '五环之地', 1, NULL);
INSERT INTO `house` VALUES (224, 2, 1, '请填写单位名称', '这房子好大', 800, '2017-12-12', 80, '草原儿女：12580', 1, NULL);
INSERT INTO `house` VALUES (225, 2, 3, '请填写单位名称', '这房子好大', 800, '2017-12-12', 80, '草原儿女：12580', 3, NULL);
INSERT INTO `house` VALUES (227, 2, 1, '迪拜第一高楼', '2222', 3333, '2016-10-20', 100, '丰城', 1, NULL);
INSERT INTO `house` VALUES (228, 2, 1, '请填写单位名称', '这房子好大', 800, '2017-12-12', 80, '草原儿女：12580', 1, NULL);
INSERT INTO `house` VALUES (233, 2, 6, '天琴湾', '海景房', 50000000, '2018-07-06', 150, 'mr.hao', 7, NULL);
INSERT INTO `house` VALUES (236, 2, 3, '老虎城A8001', '商业房', 50000000, '2018-07-06', 150, 'mr.hao', 10, NULL);
INSERT INTO `house` VALUES (272, 61, 2, ' 房主不要了 ', '厦门好房子1007', 50000, '2018-10-31', 80, 'test', 4, '出售中');
INSERT INTO `house` VALUES (273, NULL, 2, ' 房主不要了 ', '厦门好房子1007', 50000, '2018-10-31', 80, 'test', 4, '出售中');
INSERT INTO `house` VALUES (274, NULL, 2, ' 房主不要了 ', '厦门好房子1007', 50000, '2018-10-31', 80, 'test', 4, '出售中');
INSERT INTO `house` VALUES (275, NULL, 2, ' 房主不要了 ', '厦门好房子1007', 50000, '2018-10-31', 80, 'test', 4, '出售中');
INSERT INTO `house` VALUES (276, 59, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `house` VALUES (277, 60, 2, ' 房主不要了 ', '厦门好房子1007', 50000, '2018-10-31', 80, 'test', 4, '出售中');
INSERT INTO `house` VALUES (278, NULL, 2, ' 房主不要了 ', '厦门好房子1007', 50000, '2018-10-31', 80, 'test', 4, '出售中');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `personid` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `personname` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`personid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('40289f8d66a91df70166a91dfdce0000', '全都是泡沫');
INSERT INTO `person` VALUES ('40289f8d66a920bf0166a920c5bb0000', '全都是泡沫');
INSERT INTO `person` VALUES ('6a01578d-7420-4a5c-94fa-25f0fd73241a', '全都是泡沫');
INSERT INTO `person` VALUES ('6ded479c-a5ea-4b3f-8679-5052bfd8ae86', '全都是泡沫');
INSERT INTO `person` VALUES ('7b4a7c6d-8524-405a-90f8-1707f08b114b', '全都是泡沫');
INSERT INTO `person` VALUES ('ac4dc95d-4b06-4699-a582-256147b56b86', '持久化数据的三种状态  持久态，瞬时态，游离（脱管）态');
INSERT INTO `person` VALUES ('c6107d64-ba59-4d1a-8db3-8bad4f9563b6', '持久化数据的三种状态  持久态，瞬时态，游离（脱管）态');

-- ----------------------------
-- Table structure for streetnumber
-- ----------------------------
DROP TABLE IF EXISTS `streetnumber`;
CREATE TABLE `streetnumber`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `district_id` int(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `district_id`(`district_id`) USING BTREE,
  CONSTRAINT `FKdhg7abq5xa8pa3t1t7el0uuxm` FOREIGN KEY (`district_id`) REFERENCES `xiaoqu` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 63 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of streetnumber
-- ----------------------------
INSERT INTO `streetnumber` VALUES (1, '新北京路', 1);
INSERT INTO `streetnumber` VALUES (2, '思明南路', 1);
INSERT INTO `streetnumber` VALUES (3, '雄安一区', 3);
INSERT INTO `streetnumber` VALUES (4, '雄县', 3);
INSERT INTO `streetnumber` VALUES (5, '安新区', 3);
INSERT INTO `streetnumber` VALUES (7, '集美大街123号', 4);
INSERT INTO `streetnumber` VALUES (10, ' 中山路   ', 1);
INSERT INTO `streetnumber` VALUES (11, '集美大街123号', 5);
INSERT INTO `streetnumber` VALUES (19, '码农之街', 18);
INSERT INTO `streetnumber` VALUES (53, ' 泉州大街 ', 46);
INSERT INTO `streetnumber` VALUES (54, ' 厦门大街 ', 46);
INSERT INTO `streetnumber` VALUES (55, ' 漳州大街 ', 46);
INSERT INTO `streetnumber` VALUES (57, '天桥洞洞口集', 48);
INSERT INTO `streetnumber` VALUES (58, '广州歪果仁大街', 49);
INSERT INTO `streetnumber` VALUES (59, '北京歪果仁大街', 49);
INSERT INTO `streetnumber` VALUES (60, '上海歪果仁大街', 49);
INSERT INTO `streetnumber` VALUES (62, '北京路', 1);

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (1, '两室一厅');
INSERT INTO `type` VALUES (2, '三室两厅');
INSERT INTO `type` VALUES (3, '八室八厅');
INSERT INTO `type` VALUES (6, '无敌海景房');
INSERT INTO `type` VALUES (7, '无敌海景房');
INSERT INTO `type` VALUES (8, '内蒙古海景房');
INSERT INTO `type` VALUES (11, '内蒙包');
INSERT INTO `type` VALUES (12, '外太空空景房');
INSERT INTO `type` VALUES (14, '五缘湾天桥桥洞');
INSERT INTO `type` VALUES (15, '五缘湾观景房');
INSERT INTO `type` VALUES (16, '星星湾小区');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userpass` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userfamily` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userphone` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `usermail` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 62 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (2, 'zshow', '123123', 'AAAA<世界杯,俄罗斯2018>', '1288000', '管理员');
INSERT INTO `userinfo` VALUES (5, '111', '123123', 'java,javaweb,javascript', '111', '111');
INSERT INTO `userinfo` VALUES (8, '智华', 'userpass', 'java,javaweb,javascript', 'userphone', 'usermail');
INSERT INTO `userinfo` VALUES (15, '华赋', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (16, 'admin1', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (17, 'admin2', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (18, 'admin3', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (19, 'admin4', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (20, 'admin5', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (29, '张飞', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (30, '关雨', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (34, '小张', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (35, '张三三', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (36, 'admin', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (37, '张三丰', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (39, 'admin11', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (40, 'admin11222', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (41, 'admin223', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (42, 'admin23', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (49, '星星', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (50, 'admin43', '123123', 'java,javaweb,javascript', '12580', 'tzhu@qq.com');
INSERT INTO `userinfo` VALUES (52, '洪良', '123123', 'java,javaweb,javascript', 'userphone', 'usermail');
INSERT INTO `userinfo` VALUES (53, '刘华斌', '123456', 'java,javaweb,javascript', '12580', '58@');
INSERT INTO `userinfo` VALUES (54, '黄洪良大号', '123456', 'java,javaweb,javascript', '12580', '126@');
INSERT INTO `userinfo` VALUES (55, '1', '123456', 'java,javaweb,javascript', '12580', '126@');
INSERT INTO `userinfo` VALUES (56, 'hello', '555', NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (57, 'test', '555', NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (58, '蕾姆', '123123', 'java,javaweb,javascript', '1806506491', '115102@qq.com');
INSERT INTO `userinfo` VALUES (59, '蕾姆', '123123', 'java,javaweb,javascript', '1806506491', '115102@qq.com');
INSERT INTO `userinfo` VALUES (60, '蕾姆', '123123', 'java,javaweb,javascript', '1806506491', '115102@qq.com');
INSERT INTO `userinfo` VALUES (61, '蕾姆', '123123', 'java,javaweb,javascript', '1806506491', '115102@qq.com');

-- ----------------------------
-- Table structure for xiaoqu
-- ----------------------------
DROP TABLE IF EXISTS `xiaoqu`;
CREATE TABLE `xiaoqu`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of xiaoqu
-- ----------------------------
INSERT INTO `xiaoqu` VALUES (1, '厦门市思明区');
INSERT INTO `xiaoqu` VALUES (2, '厦门市湖里区');
INSERT INTO `xiaoqu` VALUES (3, '雄安新区');
INSERT INTO `xiaoqu` VALUES (4, '厦门市集美区');
INSERT INTO `xiaoqu` VALUES (5, '厦门市集美区');
INSERT INTO `xiaoqu` VALUES (8, '何厝小区');
INSERT INTO `xiaoqu` VALUES (18, '码农之区');
INSERT INTO `xiaoqu` VALUES (46, '厦门漳州泉州同城一体化');
INSERT INTO `xiaoqu` VALUES (48, '天桥洞小区');
INSERT INTO `xiaoqu` VALUES (49, '北上广同城多元化');
INSERT INTO `xiaoqu` VALUES (51, '测试小区');

-- ----------------------------
-- Table structure for yaohaoconfig
-- ----------------------------
DROP TABLE IF EXISTS `yaohaoconfig`;
CREATE TABLE `yaohaoconfig`  (
  `yaohaoconfig` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for yaohaohouse
-- ----------------------------
DROP TABLE IF EXISTS `yaohaohouse`;
CREATE TABLE `yaohaohouse`  (
  `yaohaohouse` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for yaohaozhuhu
-- ----------------------------
DROP TABLE IF EXISTS `yaohaozhuhu`;
CREATE TABLE `yaohaozhuhu`  (
  `yaohaoid` int(255) NOT NULL AUTO_INCREMENT,
  `yaohaouserid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`yaohaoid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
