import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double ms;

        System.out.println("Digite um numero real:");
        ms = in.nextDouble();

        System.out.println("Voce digitou: " +  ms * 3.6 + " Kmh");

    }
}