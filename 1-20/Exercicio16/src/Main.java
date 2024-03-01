import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double r, h;
        double pi = Math.PI;

        System.out.println("Digite um numero real:");
        r = in.nextDouble();
        System.out.println("Digite um numero real:");
        h = in.nextDouble();

        System.out.println("Voce digitou: " +  Math.PI * (r * r) * h / 3 + " Litros");
    }
}