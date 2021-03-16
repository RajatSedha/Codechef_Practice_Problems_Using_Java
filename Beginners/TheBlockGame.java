import java.util.Scanner;
public class Main{

    public static int palindrome(int num) {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while (times-- > 0) {
            int a = scanner.nextInt();
            if (palindrome(a) == a) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
    }
}
