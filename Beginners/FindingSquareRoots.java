import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i = 0; i<times; i++){
            int num = scanner.nextInt();
            System.out.println((int)Math.sqrt(num));
        }
        }
    }
