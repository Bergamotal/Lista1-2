import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double A, B;

        System.out.println("Digite um numero real:");
        A = in.nextDouble();
        System.out.println("Digite um numero real:");
        B = in.nextDouble();

        System.out.println("O valor de x é: " + (-B / A));
    }
}