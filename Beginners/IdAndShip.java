import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times-- >0){
            String str = scanner.next();
            char ch = str.charAt(0);
            if(ch == 'B' || ch =='b'){
                System.out.println("BattleShip");
            }
            else if(ch == 'C' || ch =='c'){
                System.out.println("Cruiser");
            }
            else if(ch == 'D' || ch =='d'){
                System.out.println("Destroyer");
            }
            else if(ch == 'F' || ch =='f'){
                System.out.println("Frigate");
            }
        }
    }
}
