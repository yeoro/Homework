-- EMP 테이블 작성
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

-- DEPT 테이블 작성
create table DEPT_ws(
	deptno int(2) primary key,
	dname varchar(14),
	loc varchar(13)
);

-- 1. 부서위치가 CHICAGO인 모든 사원에 대해 이름,업무,급여 출력하는 SQL을 작성하세요.
select 
	e.ENAME,
	e.JOB,
	e.SAL
from 
	emp e, 
	dept d
where 
	d.LOC = 'CHICAGO';
	
-- 2. 부하직원이 없는 사원의 사원번호,이름,업무,부서번호 출력하는 SQL을 작성하세요.
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

-- 3. BLAKE와 같은 상사를 가진 사원의 이름,업무,상사번호 출력하는 SQL을 작성하세요.
select
	e.ENAME,
	e.JOB,
	e.MGR
from 
	emp e
	right join (select * from emp where ename = 'BLAKE') b 
			on b.MGR = e.MGR;

-- 4. 입사일이 가장 오래된 사람 5명을 검색하세요.
select 
	ENAME,
	HIREDATE
from 
	emp
order by HIREDATE
limit 5;

-- 5. JONES 의 부하 직원의 이름, 업무, 부서명을 검색하세요.
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

