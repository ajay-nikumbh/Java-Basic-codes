import java.util.Scanner;
class LargestDigit
{
   public static void main(String args[])
   
   {
	   Scanner sc=new Scanner(System.in);
	   int max,i,n;
	   System.out.println("Enter any number=");
	   n=sc.nextInt();
	   int a[]=new int[n];
	   System.out.println("Enter the array elements:\n");
	   for(i=0;i<n;i++)
	   {
			a[i]=sc.nextInt();
	   
	   }

	   max=max_num(a,n);
	   System.out.println("The largest number is :"+max);
   }

   //max method

   static int max_num(int []a,int n)
   {
	   int i;
	   int m=0;

	   for(i=0;i<n;i++)
	   {
	   
				if(a[i]>m)
				{
					m=a[i];
				
				}
	   
	   }
	   return m;
   
   
   
   }	
}