-- EMP ���̺� �ۼ�
create table EMP_ws(
	empno int(4) primary key,
	ename varchar(10),
	job varchar(10),
	mgr int(4),
	hiredate date,
	sal decimal(7, 2),
	comm decimal(7, 2),
	deptno int(2),
	foreign key(deptno) 
		references DEPT_ws(deptno)
				on update set null
				on delete cascade
);

-- DEPT ���̺� �ۼ�
create table DEPT_ws(
	deptno int(2) primary key,
	dname varchar(14),
	loc varchar(13)
);

-- 1. �μ���ġ�� CHICAGO�� ��� ����� ���� �̸�,����,�޿� ����ϴ� SQL�� �ۼ��ϼ���.
select 
	e.ENAME,
	e.JOB,
	e.SAL
from 
	emp e, 
	dept d
where 
	d.LOC = 'CHICAGO';
	
-- 2. ���������� ���� ����� �����ȣ,�̸�,����,�μ���ȣ ����ϴ� SQL�� �ۼ��ϼ���.
select
	m.EMPNO,
	m.ENAME,
	m.JOB,
	m.DEPTNO,
	e.ENAME
from 
	emp e
	right join emp m
		    on e.MGR = m.EMPNO
where m.ENAME = 'JONES';
where e.ENAME is null;

-- 3. BLAKE�� ���� ��縦 ���� ����� �̸�,����,����ȣ ����ϴ� SQL�� �ۼ��ϼ���.
select
	e.ENAME,
	e.JOB,
	e.MGR
from 
	emp e
	right join (select * from emp where ename = 'BLAKE') b 
			on b.MGR = e.MGR;

-- 4. �Ի����� ���� ������ ��� 5���� �˻��ϼ���.
select 
	ENAME,
	HIREDATE
from 
	emp
order by HIREDATE
limit 5;

-- 5. JONES �� ���� ������ �̸�, ����, �μ����� �˻��ϼ���.
select
	e.ENAME,
	e.JOB,
	d.DNAME
from 
	dept d,
	emp e
	right join emp m
		    on e.MGR = m.EMPNO
where 
	m.ENAME = 'JONES' 
	and e.DEPTNO = d.DEPTNO;

