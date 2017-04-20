--创建数据表account
create table `account`(
    `id` int(11) not null auto_increment,
    `name` varchar(20) not null,
    `money` double default null,
    primary key(`id`)
)engine=InnoDB auto_increment=4 default charset=utf8;

insert into account(id, name, money) values('1', 'aaa', 1000);
insert into account(id, name, money) values('2', 'bbb', 1000);
insert into account(id, name, money) values('3', 'ccc', 1000);