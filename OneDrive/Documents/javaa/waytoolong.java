import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //StringBuilder x=new StringBuilder();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            if(s.length()>10)
            {
                //char ch=s.charAt(i);
                String str=""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1);
                  System.out.println(str);
            }
            else
            {
              System.out.println(s);
            }
        }
    }
}