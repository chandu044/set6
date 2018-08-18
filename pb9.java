/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,d=0,r;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a!=0)
		{
		   r=a%10;
		   d=d+1;
		   a=a/10;
		}
		System.out.print(d);
	}
}
