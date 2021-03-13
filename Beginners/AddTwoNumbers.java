import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i<=n){
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int sum = b+c;
            System.out.println(sum);
            i = i+1;
        }
    }
}
