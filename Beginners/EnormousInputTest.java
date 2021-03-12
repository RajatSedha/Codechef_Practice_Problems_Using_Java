import java.util.Scanner;
public class EnormousInputTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            int ti = scanner.nextInt();
            if(ti%k==0){
                sum = sum+1;
            }
            i = i+1;

        }
        System.out.println(sum);
    }
}
