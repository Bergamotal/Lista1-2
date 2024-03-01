import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double Km;

        System.out.println("Digite um numero real:");
        Km = in.nextDouble();

        System.out.println("Voce digitou: " +  Km / 1.609 + " milhas");

    }
}