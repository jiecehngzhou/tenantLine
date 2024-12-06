-- 公司表
CREATE TABLE `company` (
                           `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                           `tenant_id` varchar(60) NOT NULL COMMENT '租户ID',
                           `company_name` varchar(30) DEFAULT NULL COMMENT '公司',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
INSERT INTO `tenantline`.`company`(`id`, `tenant_id`, `company_name`) VALUES (1, '00001', '腾讯');
INSERT INTO `tenantline`.`company`(`id`, `tenant_id`, `company_name`) VALUES (2, '00002', '阿里');
-- 员工表
CREATE TABLE `staff` (
                         `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                         `tenant_id` varchar(60) NOT NULL COMMENT '租户ID',
                         `staff_id` varchar(60) NOT NULL COMMENT '员工id',
                         `staff_name` varchar(30) DEFAULT NULL COMMENT '员工名称',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
INSERT INTO `tenantline`.`staff`(`id`, `tenant_id`, `staff_id`, `staff_name`) VALUES (1, '00001', '1', '马化腾');
INSERT INTO `tenantline`.`staff`(`id`, `tenant_id`, `staff_id`, `staff_name`) VALUES (2, '00001', '2', '张小龙');
INSERT INTO `tenantline`.`staff`(`id`, `tenant_id`, `staff_id`, `staff_name`) VALUES (3, '00002', '1', '马云');
INSERT INTO `tenantline`.`staff`(`id`, `tenant_id`, `staff_id`, `staff_name`) VALUES (4, '00002', '2', '蔡崇信');