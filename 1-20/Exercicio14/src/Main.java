import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double b, h;

        System.out.println("Digite um numero real:");
        b = in.nextDouble();
        System.out.println("Digite um numero real:");
        h = in.nextDouble();

        System.out.println("Voce digitou: " +  0.5 * b * h);
    }
}