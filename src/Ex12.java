import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti varsta: ");

        int varsta = sc.nextInt();

        if(varsta <= 0 || varsta > 135)
            System.out.println("Varsta invalida");
        else if (varsta < 12)
            System.out.println("Esti copil");
        else if ( varsta <= 18)
            System.out.println("Esti adolescent");
        else
            System.out.println("Esti adult");




    }
}
