public class  recursion3
{    
    public String fun(int n)
        {
            if(n==11)
            {
           return("biryani");
            }
         System.out.println(n);
         String s=fun(n+1);
          System.out.println(n);
          return s;
        }
	public static void main(String[] args) {
	    recursion3 m=new recursion3();
	 System.out.println(m.fun(1));
	}
}