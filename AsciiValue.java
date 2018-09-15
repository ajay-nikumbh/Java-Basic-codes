import java.util.*;
public class AsciiValue
	{

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Single character to get its equivalent Ascii-value");
		     char ch = sc.next().charAt(0);
			 int ascii = ch;
			 int castAscii = (int) ch;

			
	        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}