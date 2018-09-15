import java.util.*;
class AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double radius;
		final double PI=3.14159;
		System.out.println("Enter the Radius of the circle");
		radius=sc.nextDouble();
		double area=PI*radius*radius;
		System.out.println("Radius of the Circle is:"+area);
	}
}
