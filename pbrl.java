/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,b=0,i;
		int[] a=new int[10];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int j=0;j<n;j++)
		{
			a[j]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				b++;
			}
		}
		if(b!=0)
		{
		System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
