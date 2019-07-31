
drop table if exists `manager`;
CREATE TABLE `manager` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

drop table if exists `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mobile` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `validation` int(11) NOT NULL,
  `nick_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `file` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `company` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `location` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `invitation_Count` int(11) NOT NULL,
  `sex` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weixin` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `collect_Num` int(11) NOT NULL,
  `activity_Num` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `verify_Code` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `access_Token` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,

  `expire_Time` datetime DEFAULT NULL,
  `vip_Start_Time` datetime DEFAULT NULL,
  `vip_End_Time` datetime DEFAULT NULL,
  `business_Id` int(11) DEFAULT NULL,
  `is_Vip` int(11) default '0' NOT NULL,
  `is_Admin` int(11) default '0' NOT NULL,
  `extend` mediumtext COLLATE utf8mb4_unicode_ci,

  `create_Time` datetime DEFAULT NULL,
  `update_Time` datetime DEFAULT NULL,
  `delete_Time` datetime DEFAULT NULL,
  `delete_flag` int(11) NOT NULL DEFAULT '0' COMMENT '删除标志，1删除 0未删除 -1未激活' ,

  `rong_Cloud_Token` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weChat_Open_Id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weChat_Access_Token` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weChat_Refresh_Token` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `wx_Union_Id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `outTradeNo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `wx_Session_Key` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `binding_Id` bigint(20) DEFAULT NULL,
  `last_Inform_Time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


drop table if exists `user_address`;
CREATE TABLE `user_address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='用户收货地址';


drop table if exists `user_bank`;
CREATE TABLE `user_bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `amt` int(11) DEFAULT NULL COMMENT '红包金额',
  `uptime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=890 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


drop table if exists `user_collection`;
CREATE TABLE `user_collection` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `data_id` bigint(20) DEFAULT NULL,
  `data_type` int(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`) USING BTREE,
  KEY `idx_data_id` (`data_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3546 DEFAULT CHARSET=utf8;


drop table if exists `user_group`;
CREATE TABLE `user_group` (
  `wx_openid` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `open_gid` varchar(50) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

drop table if exists `identify_code`;
CREATE TABLE `identify_code` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `hard_code` varchar(255) DEFAULT NULL COMMENT '注册机器的验证特征码',
  `identify_code` varchar(255) DEFAULT NULL COMMENT '要发送的验证码',

  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除的时间',
  `delete_flag` int(2) NOT NULL DEFAULT '0' COMMENT '是否删除标记（0未删除，1已删除）',

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

