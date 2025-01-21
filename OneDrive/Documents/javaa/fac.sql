CREATE OR REPLACE FUNCTION factorial(n NUMBER) RETURN NUMBER IS
  result NUMBER := 1;
BEGIN
  IF n < 0 THEN
    RETURN NULL;  -- Factorial is not defined for negative numbers
  ELSIF n = 0 THEN
    RETURN 1;  -- Factorial of 0 is 1
  ELSE
    FOR i IN 1..n LOOP
      result := result * i;
    END LOOP;
    RETURN result;
  END IF;
END;
/
