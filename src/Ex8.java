import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti ora: ");

        int hour = sc.nextInt();

        switch(hour) {
            case 0, 1, 2, 3, 4, 5:
                System.out.println("Noapte");
                break;
            case 6, 7, 8, 9, 10, 11:
                System.out.println("Dimineata");
                break;
            case 12, 13, 14, 15, 16, 17:
                System.out.println("Dupa-amaiza");
                break;
            case 18, 19, 20, 21, 22, 23:
                System.out.println("Seara");
            default:
                System.out.println("zi invalida");
        }
    }
}
