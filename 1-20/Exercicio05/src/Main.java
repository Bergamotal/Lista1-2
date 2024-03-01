import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double Kmh;

        System.out.println("Digite um numero real:");
        Kmh = in.nextDouble();

        System.out.println("Voce digitou: " +  Kmh / 3.6 + " m/s");

    }
}