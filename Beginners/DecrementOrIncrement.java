import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%4==0){
            System.out.println(n+1);
        }
        else{
            System.out.println(n-1);
        }
    }
}
