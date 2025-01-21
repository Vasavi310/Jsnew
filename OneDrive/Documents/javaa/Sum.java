import java.util.*;
public class Sum
{
        public static void find(String x)
        {
            int sum=0;
            String sum1="";
            String s[]=x.split("\\s+");
            for(String s1:s)
            {
            try
            {
              int p=Integer.parseInt(s1);
                 sum=sum+p;
		 
            }
            catch(NumberFormatException a1)
            {
               sum1=sum1+s1;
            }
	    }
            if(sum!=0)
              System.out.println(sum);
            else
               System.out.println(sum1);
        }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
                String sum1="";
                String x="hi i am fine";
                find(x);
                
	    
	}
}
      