DECLARE
  num NUMBER := 5;
  fact NUMBER;
BEGIN
  fact := factorial(num);
  dbms_output.put_line('Factorial of ' || num || ' is ' || fact);
END;
/
