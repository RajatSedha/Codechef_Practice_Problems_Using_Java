import java.util.Scanner;
public class Main {
    public static int angles(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while (times-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (angles(a, b, c) == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
