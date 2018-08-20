/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,b=0;
		String s1;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isLetter(ch[i])==true)
			{
				a++;
			}
			else if(ch[i]>='0'&&ch[i]<='9')
			{
				b++;
			}
			
				
			
			
		
		}
		if(a!=0&&b!=0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
