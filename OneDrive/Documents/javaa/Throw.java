class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
class Throw
{
   public static void main(String[] args)throws CustomException
   {
       try
       {
           operation();
       }
       catch(CustomException a)
       {
          System.out.println(a);
       }
    }
   public static void operation()
   {
       try
       {
          int a=1/0;
       }
       catch(ArithmeticException a)
       {
           System.out.println("division by zero is not possible");
           throw new CustomException("exception occured");
       }
    }
}

       