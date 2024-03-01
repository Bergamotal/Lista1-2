import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite as notas:");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        double m = (n1 + n2) / 2;

        if (m > 8.5){
            System.out.println("A");
        }
        if (m >= 7 && m < 8.5){
            System.out.println("B");
        }
        if (m >= 5 && m < 7){
            System.out.println("C");
        }
        if (m < 5){
            System.out.println("D");
        }

    }
}