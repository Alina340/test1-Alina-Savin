import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int nr1 = scan.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int nr2 = scan.nextInt();

        System.out.println();

        System.out.println("Inmultirea lor este: " + nr1*nr2);
    }
}
