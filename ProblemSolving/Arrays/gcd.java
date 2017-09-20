public class gcd{
	int calculategcd(int a,int b)
		{
			if(b==0)
			 return a;
			else
			 return calculategcd(b,a%b);
		}
	public static void main(String args[])
		{
			gcd obj=new gcd();
			int a=5,b=10;
			System.out.println(obj.calculategcd(10,5));
		}
}
