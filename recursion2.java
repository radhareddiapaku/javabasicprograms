public class recursion2
{    
    public static void fun(int n)
        {
            if(n==11)return;
         System.out.println(n);
         fun(n+1);
          System.out.println(n);
        }
	public static void main(String[] args) {
	    recursion2 m=new recursion2();
	 m.fun(1);
	}
}