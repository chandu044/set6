/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=0,j=0,d=0,b;
		int[] a=new int[10];
		int[] c=new int[10];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			b=n%10;
			a[i]=b;
			i++;
			n=n/10;
			d++;
		}
	          i=d-1;
	          while(j<d)
	          {
	          	c[j]=a[i];
	          	System.out.print(c[j]+" ");
	          	j++;
	          	i--;
	          }

	}

}
