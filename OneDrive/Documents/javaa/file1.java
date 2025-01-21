import java.io.*;
import java.util.*;
import java.io.File;
class File1
{
  public static void main(String[] args)
  {
   String file="File1.txt";
   String directory="directory";
   File f=new File(file);
   File d=new File(directory);
   try{
   if(f.createNewFile())
       System.out.println("file is created");
   else
       System.out.println("file is not created");
   }
   catch(IOException a)
   {
       System.out.println("exception raised");
   }
   if(!(d.exists()))
   {
       if(d.mkdir())
        System.out.println("DIRECTORY is created");
       else
        System.out.println("directory is not created");
   }
   else
       System.out.println("directory already created");
   System.out.println("file existed"+f.exists());
   if(f.exists())
   {
      if(f.delete())
          System.out.println("file is deleted");
      else
          System.out.println("file is not deleted");
   }
   else
       System.out.println("file doesnt exists");
   if(d.exists())
   {
      if(d.delete())
         System.out.println("directory is deleted");
      else
         System.out.println("directory is not deleted");
   }
   else
      System.out.println("directory doesn't exist");
  }
}