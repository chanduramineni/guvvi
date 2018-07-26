import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s=new Scanner(System.in);
			double sp=s.nextDouble();
			double ep=s.nextDouble();
			double d=ep-sp;
			int ch=s.nextInt();
			int kmc=0;
			if(ch==1)
			{
			kmc = 10;
			}
			else if(ch==2)
			{
			kmc=20;
			}
			else 
			{}
		System.out.println("cost is: " +(d*kmc));
	}
}
