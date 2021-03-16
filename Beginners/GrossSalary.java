/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times-->0){
            int n = scanner.nextInt();
            if(n<1500){
                System.out.println((n)+(0.1*n)+(0.90*n));
            }
            else
                System.out.println((n)+500+(0.98*n));
        }
	}
}
