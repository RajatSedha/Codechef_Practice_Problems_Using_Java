import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times-->0){
            int n = scanner.nextInt();
            if(n<10){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
