-- Write PL/SQL code in Procedure to find the Reverse of the  number

set serveroutput on;
declare 
 val number(5) := &val;
 initval number(5); 
 samp varchar2(20) := '';
 sampout varchar2(20) := '';
 
 begin
    samp := to_char(val);
    initval := length(samp);
    loop
        sampout := sampout || substr(samp, initval, 1);
        initval:= initval -1;
            if initval <= 0 then exit;
            end if;
    end loop;
    dbms_output.put_line(sampout);
end;