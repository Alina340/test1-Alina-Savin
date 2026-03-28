import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");


        int number = sc.nextInt();

        switch(number) {
            case 12, 1, 2:
                System.out.println("Este iarna");
                break;
            case 3, 4, 5:
                System.out.println("Este primavara");
                break;
            case 6, 7, 8:
                System.out.println("Este vara");
                break;
            case 9, 10, 11:
                System.out.println("Este toamna");
                break;
            default:
                System.out.println("Numar invalid");

        }
    }
}
