-- Write PL/SQL code in Cursor to display employee names and salary

set serveroutput on;
declare 
TYPE emprec is record(
 enameval varchar2(20),
 esalval number(8,2));
  
 erec emprec;
 
 cursor curEmp is select ename,sal from emp;
 begin
 open curEmp;
 loop
 fetch curEmp into erec.enameval, erec.esalval;
 exit when curEmp%NOTFOUND;
 dbms_output.put_line(' Name: ' || erec.enameval || '     Salary ' || erec.esalval );
 end loop;
  close curEmp;
 end;
 