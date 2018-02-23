import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int singX = scanner.nextInt();
        //singX > 0 = 1
        //singX < 0 = -1
        //singX = 0 = 0
        if (singX > 0){
            System.out.print(1);
        } else if (singX < 0){
            System.out.print(-1);
        } else {
            System.out.print(0);
        }
    }
}
