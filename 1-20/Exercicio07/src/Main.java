import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double mm;

        System.out.println("Digite um numero real:");
        mm = in.nextDouble();

        System.out.println("Voce digitou: " +  mm / 25.4 + " pol");

    }
}