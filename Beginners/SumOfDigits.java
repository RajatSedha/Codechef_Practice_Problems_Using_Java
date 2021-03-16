/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 for(int i=0; i<a; i++) {
			 int sum=0;
			 int a1 = sc.nextInt();
			 while(a1 !=0) {
				 int num = a1%10;
				 sum = sum + num;
				 a1=a1/10;
			 }
			 System.out.println(sum);
		 }
		 sc.close();
	}
}
