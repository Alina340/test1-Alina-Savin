import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");

        int number = sc.nextInt();

        if(number % 2 == 0)
            System.out.println("Numarul este par");
        else
            System.out.println("Numarul este impar");
    }
}
