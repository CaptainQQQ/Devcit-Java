import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pervoeChislo = scanner.nextInt();
        int vtoroeChislo = scanner.nextInt();

        // pervoeChislo > vtoroeChislo = 1
        // pervoeChislo < vtoroeChislo = 2
        // pervoeChislo = vtoroeChislo = 0

        if (pervoeChislo > vtoroeChislo){
            System.out.print(1);
        } else if (pervoeChislo < vtoroeChislo){
            System.out.print(2);
        } else {
            System.out.print(0);
        }
    }
}
