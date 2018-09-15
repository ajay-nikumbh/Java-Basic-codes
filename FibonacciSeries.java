import java.util.*;
class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many fibonacci numbers");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series");
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}
}
