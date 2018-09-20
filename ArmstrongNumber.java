import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String v[])
	{
		int i=1;
		int num;
		int temp;
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		sum=0;
		i=num;

		//logic
		while(num>0)
		{
			int n=0;
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		
		}

		if(sum==i)
			System.out.println(i+"\tIs an Armstrong number\n");

		else
			System.out.println(i+"\tIs not an Armstrong number\n");
	
	}
}