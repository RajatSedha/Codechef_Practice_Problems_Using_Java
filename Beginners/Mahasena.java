package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Smallfactorials
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evencount=0 , oddcount = 0;
        for(int i = 0 ;  i < n ; i++) {

            if((sc.nextInt() & 1) == 0)  evencount++;
            else oddcount++;

        }
        if(evencount > oddcount) System.out.println("READY FOR BATTLE");
        else System.out.println("NOT READY");
        System.exit(0);


    }
}
