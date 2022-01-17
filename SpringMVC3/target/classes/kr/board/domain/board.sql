-- board table
create table board(
	idx int not null auto_increment,
	memId varchar(20) not null, -- 추가
	title varchar(100) not null,
	contents varchar(2000) not null,
	writer varchar(20) not null, -- memName
	indate datetime default now(),
	count int default 0,
	primary key(idx)
);

drop table board;

insert into board(title,contents,writer)
values('스프링 게시판','스프링게시판내용','관리자');
insert into board(title,contents,writer)
values('스프링 게시판','스프링게시판내용','최한글');

select * from board;

create table member(
	memId varchar (20) not null,
	memPass varchar(20) not null,
	memName varchar(20) not null,
	primary key(memId)
);

insert into member values('chg','9252','최한글');
insert into member values('kjm','0613','김귀욤');

select * from member;
select * from board;

