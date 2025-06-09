public class recursion1
{    
    public static void fun(int n)
        {
            if(n==11)return;
         System.out.println(n);
         fun(n+1);
        }
	public static void main(String[] args) {
	    recursion1 m=new recursion1();
	 m.fun(1);
	}
}