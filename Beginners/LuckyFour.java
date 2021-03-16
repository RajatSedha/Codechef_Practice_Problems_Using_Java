import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i = 0; i<times;i++){
            int addto = 0;
            int number = scanner.nextInt();
            String str = String.valueOf(number);
            for(int j = 0; j<str.length();j++){
                char ch = str.charAt(j);
                if(ch=='4'){
                    addto = addto+1;
                }
            }
            System.out.println(addto);

        }
    }
}
