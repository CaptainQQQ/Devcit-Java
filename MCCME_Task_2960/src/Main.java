import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int otvetTest = scanner.nextInt();
        int otvetShkolnik = scanner.nextInt();

        if (otvetTest != 1 && otvetShkolnik != 1 ){
            System.out.print("YES");
        } else if (otvetTest == 1 && otvetShkolnik == 1){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
