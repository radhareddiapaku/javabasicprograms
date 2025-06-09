
public class notStatic
{    
    public static void fun(int n)
        {
         System.out.println(n);
        }
	public static void main(String[] args) {
	    notStatic m=new notStatic();
	 m.fun(8);
	}
}