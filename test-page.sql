CREATE TABLE `tb_test_page` (
  `update_user` int(11) default NULL,
  `create_user` int(11) NOT NULL,
  `update_time` timestamp NULL default NULL,
  `create_time` timestamp NOT NULL default '0000-00-00 00:00:00' on update CURRENT_TIMESTAMP,
  `name` varchar(100) default NULL,
  `id` int(11) NOT NULL auto_increment COMMENT 'id',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;