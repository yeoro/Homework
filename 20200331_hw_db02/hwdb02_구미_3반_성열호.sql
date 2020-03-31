-- 1. 상품 정보를 저장할 수 있는 테이블 구성
create 
	table product(
				code varchar(50),
				name varchar(50),
				price int);

-- 2. 상품 데이터를 5개 이상 저장하는 SQL 작성 (상품명에 TV, 노트북 포함 하도록 하여 5개 이상)
insert into product values('1', 'TV', 3300000);
insert into product values('2', '노트북', 1700000);
insert into product values('3', '냉장고', 3000000);
insert into product values('4', '에어컨', 1500000);
insert into product values('5', '세탁기', 3800000);
select * from product;

-- 3. 상품을 세일하려고 한다. 15% 인하된 가격의 상품 정보 출력
select 
	code,
	name,
	price * .85 as 'sale price'
from product;

-- 4. TV 관련 상품의 가격을 20% 인하하여 저장 후 출력
update
	product
	set price = price * .8
	where name like '%TV%';

-- 5. 저장된 상품 가격의 총 금액을 출력하는 SQL 문장 작성
select sum(price) as '상품 가격의 총 금액' from product;
	
	