import java.util.*;
class SumOFDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,temp;
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num!=0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("Sum of the number is:"+sum);
	}
}
