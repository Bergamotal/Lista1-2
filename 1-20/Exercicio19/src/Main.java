import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double A, B, C, x1, x2;

        System.out.println("Digite um numero real:");
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        double Delta = Math.pow (B, 2) - 4 * A * C;
        x1 = ((-B) + Math.sqrt(Delta)) / (2 * A);
        x2 = ((-B) - Math.sqrt(Delta)) / (2 * A);

        System.out.println(A+"X^2 + (" + B + ")X + (" + C + ") = 0, \n Entao\n x1="+x1+" e x2="+x2);

    }

}