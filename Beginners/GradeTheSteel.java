package com.company;
import java.util.Scanner;
public class GradeTheSteel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times-->0){
            int hardness = scanner.nextInt();
            double carbonContent = scanner.nextFloat();
            int tensileStrength = scanner.nextInt();
            if(hardness>50&&carbonContent<0.7&&tensileStrength>5600){
                System.out.println("10");
            }
            else if(hardness>50&&carbonContent<0.7){
                System.out.println("9");
            }
            else if(carbonContent<0.7&&tensileStrength>5600){
                System.out.println("8");
            }
            else if(hardness>50&&tensileStrength>5600){
                System.out.println("7");
            }
            else if(hardness>50||carbonContent<0.7||tensileStrength>5600){
                System.out.println("6");
            }
            else{
                System.out.println("5");
            }
        }
    }
}
