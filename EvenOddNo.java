//Program to find even odd no
import java.util.Scanner;
class  EvenOddNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();

		//logic
		if(x%2==0)
			System.out.println("No is Even Number.");

		else
			System.out.println("No is Odd Number.");
	}
}
