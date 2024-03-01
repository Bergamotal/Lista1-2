import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite um numero real:");
        n1 = in.nextDouble();
        System.out.println("Digite um numero real:");
        n2 = in.nextDouble();

        System.out.println("Voce digitou: " + (n1 + 2 * n2) / 3);
    }
}