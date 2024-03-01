import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double pi = Math.PI;
        double raio;

        System.out.println("Digite um numero real:");
        raio = in.nextDouble();

        System.out.println("Voce digitou: " +  Math.PI * raio * raio);
    }
}