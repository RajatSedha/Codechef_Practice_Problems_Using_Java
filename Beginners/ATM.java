import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int withdraw = scanner.nextInt();
        double balance = scanner.nextDouble();
        if (withdraw%5==0){
            if(withdraw>balance-0.5){
                System.out.println(balance);
            }
            else{
                System.out.println(balance-(withdraw+0.5));
            }

        }
	}
}
