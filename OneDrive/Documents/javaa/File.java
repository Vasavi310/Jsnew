
import java.io.File;
import java.io.IOException;
class File
{
   public static void main(String[] args)
   {
      String file="file1.txt";
      String directory="directory";
      File f=new File(file);
      File d=new File(directory);
      System.out.println("file is readable "+f.canRead());
      try{
      if(f.createNewFile())
      {
          System.out.println("file is created");
      }
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
             System.out.println("directory created");
         else
             System.out.println("not created");
      }
       else
            System.out.println("directory already exists");
       System.out.println("file exists"+f.exists());
       if(f.exists())
       {
          if(f.delete())
          System.out.println("file deleted successfully");
          else
          System.out.println("failed to delete file");
       }
       else
          System.out.println("file dosenot exist");
      if(d.exists())
      {
         if(d.delete())
           System.out.println("directory deleted");
         else
           System.out.println("unable to delete directory");
      }
      else
        System.out.println("directory doesnot exist");
   }
}      
      