import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times-->0){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            if(A>B && A>C){
                if(B<C){
                    System.out.println(C);
                }
                else{
                    System.out.println(B);
                }
            }
            else if(B>A && B>C){
                if(A>C){
                    System.out.println(A);
                }
                else{
                    System.out.println(C);
                }
            }
            else if(C>A && C>B){
                if(A<B){
                    System.out.println(B);
                }
                else{
                    System.out.println(A);
                }
            }
        }
    }
}
