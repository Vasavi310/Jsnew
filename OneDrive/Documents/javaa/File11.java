import java.util.*;
import java.io.*;
import java.io.File;
class File11
{
   public static void main(String[] args)throws IOException
   {
      String file="file1.txt";
      String directory="directory";
      File f=new File(file);
      File d=new File(directory);
      if(f.createNewFile())
         System.out.println("file created");
      else
         System.out.println("file not created");
      if(!(d.exists()))
      {
         if(d.mkdir())
            System.out.println("directory created");
         else
            System.out.println("directory is not created");
      }
      else
          System.out.println("directory already exists");
      if(f.exists())
      {
         if(f.delete())
             System.out.println("file deleted");
         else
             System.out.println("file cannot be deleted");
      }
      else
         System.out.println("file not present");
    }
}