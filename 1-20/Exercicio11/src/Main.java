import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double Celsius;

        System.out.println("Digite um numero real:");
        Celsius = in.nextDouble();

        System.out.println("Voce digitou: " +  ((Celsius * 9/5 ) + 32)+ " fahrenheit");

    }
}