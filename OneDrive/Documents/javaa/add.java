public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,sum1=0;
		//String s[]=new String[0];
		ArrayList<String> s=new ArrayList<>();
		for(int i=0;i<s.size();i++)
		{
		    s[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
            if(s[i] instanceof Integer)
            {
		    sum=sum+Integer.parseInt(s[i]);
            System.out.println(sum);
            return;
            }
            else
            {
               sum1=sum1+s[i];
               System.out.println(sum1);
               return;
            }
		}
	}
}