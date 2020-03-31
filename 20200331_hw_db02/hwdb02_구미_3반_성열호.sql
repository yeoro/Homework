-- 1. ��ǰ ������ ������ �� �ִ� ���̺� ����
create 
	table product(
				code varchar(50),
				name varchar(50),
				price int);

-- 2. ��ǰ �����͸� 5�� �̻� �����ϴ� SQL �ۼ� (��ǰ�� TV, ��Ʈ�� ���� �ϵ��� �Ͽ� 5�� �̻�)
insert into product values('1', 'TV', 3300000);
insert into product values('2', '��Ʈ��', 1700000);
insert into product values('3', '�����', 3000000);
insert into product values('4', '������', 1500000);
insert into product values('5', '��Ź��', 3800000);
select * from product;

-- 3. ��ǰ�� �����Ϸ��� �Ѵ�. 15% ���ϵ� ������ ��ǰ ���� ���
select 
	code,
	name,
	price * .85 as 'sale price'
from product;

-- 4. TV ���� ��ǰ�� ������ 20% �����Ͽ� ���� �� ���
update
	product
	set price = price * .8
	where name like '%TV%';

-- 5. ����� ��ǰ ������ �� �ݾ��� ����ϴ� SQL ���� �ۼ�
select sum(price) as '��ǰ ������ �� �ݾ�' from product;
	
	