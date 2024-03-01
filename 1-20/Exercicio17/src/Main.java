import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double Vi, A, T;

        System.out.println("Digite um numero real:");
        Vi = in.nextDouble();
        System.out.println("Digite um numero real:");
        A = in.nextDouble();
        System.out.println("Digite um numero real:");
        T = in.nextDouble();

        System.out.println("A velocidade final é : " + (Vi + A * T));
    }
}