

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times-- > 0){
            int num = scanner.nextInt();
            int rem = 0;
            int res = 0;
            while(num!=0){
                res=res*10;
                rem=num%10;
                num=num/10;
                res+=rem;
            }
            System.out.println(res);
        }
    }
}
