import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int god = scanner.nextInt();
        if (god % 4 != 0){
            System.out.print("NO");
        } else if (god % 100 != 0){
            System.out.print("YES");
        } else if (god % 400 != 0){
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }

    }
}
