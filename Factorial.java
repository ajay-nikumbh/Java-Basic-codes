import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		
		System.out.println("---FACTORIAL PROGRAM---");
		int fact=1,no;
		System.out.println("Enter the no :");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		if(no<0)
			System.out.println("Factorial for the negative no dosent exists");
		for(int i=1;i<=no;i++)
		{
		
			fact=fact*i;
		}
		System.out.println("Factorial of the number is ="+fact);
	}
}
