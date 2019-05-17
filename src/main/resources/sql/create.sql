
drop table if EXISTS admin;
create table admin(
	id bigint(20) not null PRIMARY KEY  AUTO_INCREMENT,
	`name` varchar(255),
	`password` VARCHAR(255),

	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	`create_operator` bigint(20) DEFAULT '-1' COMMENT '创建的管理员id',
	`update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
	`update_operator` bigint(20) DEFAULT '-1' COMMENT '最后更新的管理员id',
	`delete_time` datetime DEFAULT NULL COMMENT '删除的时间',
	`delete_operator` bigint(20) DEFAULT '-1' COMMENT '删除者id',
	`delete_flag` int(2) NOT NULL DEFAULT '0' COMMENT '是否删除标记（0未删除，1已删除）'
);

drop table if exists category;
create table category(
	id bigint(20) not null PRIMARY KEY  AUTO_INCREMENT,
	`name` varchar(255),
   icon_path varchar(255),

	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	`create_operator` bigint(20) DEFAULT '-1' COMMENT '创建的管理员id',
	`update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
	`update_operator` bigint(20) DEFAULT '-1' COMMENT '最后更新的管理员id',
	`delete_time` datetime DEFAULT NULL COMMENT '删除的时间',
	`delete_operator` bigint(20) DEFAULT '-1' COMMENT '删除者id',
	`delete_flag` int(2) NOT NULL DEFAULT '0' COMMENT '是否删除标记（0未删除，1已删除）'
) ;

drop table if exists link;
create table link(
	id  bigint(20) not null PRIMARY KEY  AUTO_INCREMENT,
	category_id int(10) not null,
	`name` varchar(255),
   icon_path varchar(255),
	link_url VARCHAR(255),

	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	`create_operator` bigint(20) DEFAULT '-1' COMMENT '创建的管理员id',
	`update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
	`update_operator` bigint(20) DEFAULT '-1' COMMENT '最后更新的管理员id',
	`delete_time` datetime DEFAULT NULL COMMENT '删除的时间',
	`delete_operator` bigint(20) DEFAULT '-1' COMMENT '删除者id',
	`delete_flag` int(2) NOT NULL DEFAULT '0' COMMENT '是否删除标记（0未删除，1已删除）'
);


INSERT INTO `category` VALUES (1, '综合', '-', '2019-5-24 21:47:56', -1, NULL, -1, NULL, -1, 0);
INSERT INTO `link` VALUES (1, 1, '天猫', '-', 'https://jx.tmall.com/?ali_trackid=2:mm_131955459_43834449_478842995:1558100934_223_1756875530', '2019-5-17 21:49:05', -1, NULL, -1, NULL, -1, 0);
