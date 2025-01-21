import java.io.*;
import java.util.*;
class NovowelException extends Exception
{
    public NovowelException(String message)
    {
        super(message);
    }
}
class Exceptv
{
  public static void vowels(String s)throws NovowelException
  {
      if(!s.matches(".*[aeiouAEIOU]*."))
         {
            throw new NovowelException("string doesn't contain any vowels");
         }
  } 
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   try
   {
      vowels(s);
    }
    catch(NovowelException a)
    {
        System.out.println("exception raised:"+a);
    }
    finally
    {
       System.out.println("code executed successfully");
    }
  }
}
      
       