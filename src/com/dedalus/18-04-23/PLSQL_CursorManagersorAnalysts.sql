-- To write a  Cursor to display the list of employees who are Working as a Managers or Analyst.

set serveroutput on;
declare
    emprec emp%rowtype;
    cursor mycur is select * from emp where job ='MANAGER' or job='ANALYST';
begin
    open mycur;
    loop
    fetch mycur into emprec;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprec.empno || '     ' || emprec.ename || '    ' || emprec.deptno || emprec.job); 
    end loop;
    close mycur;
end;
/