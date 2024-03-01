import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double milha;

        System.out.println("Digite um numero real:");
        milha = in.nextDouble();

        System.out.println("Voce digitou: " +  milha * 1.609 + " Km");

    }
}