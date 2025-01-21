import java.util.*;
class NoVowelsException extends Exception
   {
    public NoVowelsException(String message)
   {
        super(message);
    }
}
class Stringv
{
   public static void main(String[] args)throws NoVowelsException
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String s1=s.toLowerCase();
       try
       {
           if(!(s1.contains("a") || s1.contains("e") || s1.contains("i") || s1.contains("o") || s1.contains("u")))
              throw new NoVowelsException("string doesnot contains vowels");
       }
       catch(NoVowelsException a)
       {
            System.out.println("exception occurs "+a.getMessage());
       }
       finally
       {
          System.out.println("excecuted successfully");
       }
   }
}