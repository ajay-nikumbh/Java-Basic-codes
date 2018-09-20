import java.util.Scanner;
class SwappingWithout3rdVar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no:");
		int b=sc.nextInt();

		//logic
		System.out.println("Nos before swapping is\na="+a+"\n"+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Nos after swapping is \na="+a+"\nb="+b);
	}
}