-- 1. emp�� dept Table�� JOIN�Ͽ� �̸�, �޿�, �μ����� �˻��ϼ���
select 
	e.ENAME, 
	e.SAL, 
	d.DNAME
from 
	emp e 
	inner join dept d 
			on e.DEPTNO = d.DEPTNO;
			
-- 2. �̸��� ��KING���� ����� �μ����� �˻��ϼ���
select 
	e.ENAME,
	d.DNAME
from 
	emp e
	inner join dept d
			on e.ENAME = 'KING' 
			and e.DEPTNO = d.DEPTNO;
		
-- 3. dept Table�� �ִ� ��� �μ��� ����ϰ�, emp Table�� �ִ� DATA�� JOIN�Ͽ� ��� ����� �̸�, �μ���ȣ, �μ���, �޿��� ��� �϶�. 
select 
	e.ENAME,
	e.DEPTNO,
	d.DNAME,
	e.SAL
from 
	emp e
	inner join dept d
			on e.DEPTNO = d.DEPTNO;
			
-- 4. emp Table�� �ִ� empno�� mgr�� �̿��Ͽ� ������ ���踦 ������ ���� ��µǵ��� ������ �ۼ��ϼ���. ��SCOTT�� �Ŵ����� JONES�̴١� 
select 
	e.EMPNO, 
	e.ENAME, 
	e.MGR, 
	m.ENAME
from 
	emp e
	left join emp m 
			on e.MGR = m.EMPNO;
			
-- 5. 'SCOTT'�� ������ ���� ����� �̸�, �μ���, �޿�, ������  �˻��ϼ���.
select
	e.ENAME,
	d.DNAME,
	e.SAL,
	e.JOB
from 
	emp e
	left join dept d
	 		on e.DEPTNO = d.DEPTNO
where e.JOB = (select job from emp where ename = 'SCOTT');

-- 6. 'SCOTT���� ���� �ִ� �μ��� ��� ����� �����ȣ, �̸�, �Ի���, �޿��� �˻��ϼ���.
select
	EMPNO,
	ENAME,
	HIREDATE,
	SAL
from 
	emp
where
	DEPTNO = (select DEPTNO from emp where ename = 'SCOTT');
	
-- 7. ��ü ����� ��ձ޿����� �޿��� ���� ����� �����ȣ, �̸�,�μ���, �Ի���, ����, �޿��� �˻��ϼ���.
select
	e.EMPNO,
	e.ENAME,
	d.DNAME,
	e.HIREDATE,
	d.LOC,
	e.SAL
from 
	emp e
	left join dept d
	 		on e.DEPTNO = d.DEPTNO
where
	e.sal > (select round(avg(sal)) from emp);

-- 8. 30�� �μ��� ���� ���� �ϴ� ����� �����ȣ, �̸�, �μ���, ����, �޿��� �޿��� ���� ������ �˻��ϼ���.
select
	e.EMPNO,
	e.ENAME,
	d.DNAME,
	d.LOC,
	e.SAL
from 
	emp e
	left join dept d
			on e.DEPTNO = d.DEPTNO
where
	e.JOB in (select job from emp where deptno = 30)
order by sal desc;

-- 9. 10�� �μ� �߿��� 30�� �μ����� ���� ������ �ϴ� ����� �����ȣ, �̸�, �μ���, �Ի���, ������ �˻��ϼ���. 
select
	e.EMPNO,
	e.ENAME,
	d.DNAME,
	e.HIREDATE,
	d.LOC
from 
	emp e
	left join dept d
		   on e.DEPTNO = d.DEPTNO
where
	e.DEPTNO = 10
	and e.JOB not in (select job from emp where DEPTNO = 30);

-- 10. ��KING���̳� ��JAMES'�� �޿��� ���� ����� �����ȣ, �̸�, �޿��� �˻��ϼ���. 
select 
	EMPNO,
	ENAME,
	SAL
from 
	emp
where
	SAL in (select SAL from emp where ENAME in ('KING', 'JAMES'));

-- 11. �޿��� 30�� �μ��� �ְ� �޿����� ���� ����� �����ȣ, �̸�, �޿��� �˻��ϼ���.
select
	EMPNO,
	ENAME,
	SAL
from 
	emp
where
	SAL > (select max(SAL) from emp where DEPTNO = 30);

-- 12. �̸� �˻��� ���� ������ �����ϱ� ���� emp ���̺� ename�� �ε����� �����Ͻÿ�.
create index ind_emp_ename on emp(ename);

-- 13. �̸��� 'ALLEN'�� ����� �Ի翬���� ���� ������� �̸��� �޿��� ����ϼ���.
select
	ENAME,
	SAL 
from 
	emp
where
	year(HIREDATE) = (select year(HIREDATE) from emp where ENAME = 'ALLEN');

-- 14.�μ��� �޿��� �հ踦 ����ϴ� View�� �ۼ��ϼ���. 
create or replace view dept_sal_sum
as
select
	e.DEPTNO,
	sum(e.SAL) as "�μ��� �޿�"
from 
	emp e
group by 
	DEPTNO;
select * from dept_sal_sum;

-- 15. 14������ �ۼ��� View�� �̿��Ͽ� �μ��� �޿��� �հ谡 ū 1~3������ ����ϼ���.
 select 
 	*
 from 
 	dept_sal_sum dss
 order by `�μ��� �޿�` desc
 limit 3;