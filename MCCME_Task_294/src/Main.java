import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pervoeChislo = scanner.nextInt();
        int vtoroeChislo = scanner.nextInt();
        int treteChislo = scanner.nextInt();
        int maximum = 0;

        if (pervoeChislo >= vtoroeChislo){
            if (pervoeChislo > treteChislo){
                maximum = pervoeChislo;
            } else {
                maximum = treteChislo;
            }
        } else if (vtoroeChislo > pervoeChislo){
            if (vtoroeChislo > treteChislo){
                maximum = vtoroeChislo;
            }else {
                maximum = treteChislo;
            }
        }
        System.out.print(maximum);
    }
}
