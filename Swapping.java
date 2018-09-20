import java.util.Scanner;
class Swapping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no:");
		int x=sc.nextInt();
		System.out.println("Enter the 2nd no:");
		int y=sc.nextInt();

		//logic
		System.out.println("Nos before swapping is\nx="+x+"\n"+"y="+y);
		int temp=x;
		 x=y;
		 y=temp;
		System.out.println("Nos after swapping is \nx="+x+"\ny="+y);
	}
}