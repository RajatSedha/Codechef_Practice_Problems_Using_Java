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
        int t = scanner.nextInt();
        int i = 1;
        while(i<=t){
            int n = scanner.nextInt();
            String s = String.valueOf(n);
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length()-1);
            int a= Integer.parseInt(String.valueOf(c1));
            int b = Integer.parseInt(String.valueOf(c2));
            System.out.println(a+b);
            i++;
        }
        }
	}
