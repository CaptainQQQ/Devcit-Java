import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ladiaStroka = scanner.nextInt();
        int ladiaStolbes = scanner.nextInt();
        int figuraStroka = scanner.nextInt();
        int figuraStolbes = scanner.nextInt();

        if (ladiaStroka == figuraStroka || ladiaStolbes == figuraStolbes){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
