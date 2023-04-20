SET SERVEROUTPUT ON
CREATE OR REPLACE PACKAGE emppackTask
AS
	PROCEDURE UPD_SAL( ijob IN varchar2, iminsal IN number, imaxsal IN number); 
	FUNCTION GET_SERVICE_YRS(iEmpNo IN number) RETURN number;
END;
/
 
CREATE OR REPLACE PACKAGE body emppackTask
AS
	PROCEDURE UPD_SAL( ijob IN varchar2, iminsal IN number, imaxsal IN number) 
	AS
		INVALID_MAXSAL EXCEPTION;
        Cnt NUMBER;
		BEGIN
			IF imaxsal < iminsal THEN
				RAISE INVALID_MAXSAL;
			END IF;
    
			SELECT COUNT(*) INTO Cnt FROM empCopy WHERE job = upper(ijob) ;
				IF Cnt = 0 THEN 
					RAISE NO_DATA_FOUND;
				ELSE
					UPDATE empCopy SET sal = imaxsal WHERE job = upper(ijob) and sal <= iminsal ;
					dbms_output.put_line('Salary updated for the specified JOB..');
				END IF;
    
				EXCEPTION
				WHEN NO_DATA_FOUND THEN
					dbms_output.put_line('Invalid Job Name ' ||ijob||' specified..');
				WHEN INVALID_MAXSAL THEN
					dbms_output.put_line('Minimum Salary should be less than Maximum Salary..');
		END UPD_SAL;

	FUNCTION GET_SERVICE_YRS(iEmpNo IN number) 
	RETURN number
	IS
		getResult number(10);
		BEGIN
			SELECT ROUND(TRUNC((SYSDATE-(hiredate))/30)/12,0) INTO getResult FROM emp WHERE empno = iEmpNo;
            RETURN getResult;
       		EXCEPTION
				WHEN no_data_found THEN 
                IF getResult IS NULL THEN
					raise_application_error(-20000,'Incorrect Employee ID-' || iEmpNo );
				END IF;
                RETURN getResult;
		END GET_SERVICE_YRS;
END emppackTask;
/


SELECT emppackTask.GET_SERVICE_YRS(7369) FROM dual;  -- Correct EmpID passed
SELECT emppackTask.GET_SERVICE_YRS(73) FROM dual;  -- InCorrect EmpID passed
EXECUTE emppackTask.UPD_SAL('SALESMANNNN', 1250, 1500); -- Incorrect JobName
EXECUTE emppackTask.UPD_SAL('SALESMAN', 125000, 1500); -- MinSal is > than MaxSal
EXECUTE emppackTask.UPD_SAL('SALESMAN', 1250, 1500); -- Update with MaxSal for the Salesman job whose salary is less than Minimum Salary
EXECUTE DBMS_OUTPUT.PUT_LINE(GET_SERVICE_YRS(999))
EXECUTE DBMS_OUTPUT.PUT_LINE ('Approximately .... ' ||GET_SERVICE_YRS(7499) || ' years')



SELECT * FROM empCopy

show error
