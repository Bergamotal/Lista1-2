import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double pol;

        System.out.println("Digite um numero real:");
        pol = in.nextDouble();

        System.out.println("Voce digitou: " +  pol * 25.4 + " mm");

    }
}