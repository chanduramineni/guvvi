import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if(a/2==0)
			{
					System.out.println("given number is even");
			}
			else if(a/2!=0)
			{
				System.out.println("given number is odd");
			}
			else
			{
				System.out.println("given number is invalid");
			}
	}
}
