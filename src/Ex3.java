import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int nr1 = scan.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int nr2 = scan.nextInt();

        System.out.println();

        System.out.println("Adunarea lor este: " + nr1+nr2);
        System.out.println("Scaderea lor este: " + (nr1-nr2));
        System.out.println("Inmultirea lor este: " + nr1*nr2);
        System.out.println("Impartirea lor este: " + nr1/nr2);
        System.out.println("Restul impartirii este: " + nr1%nr2);


    }
}
