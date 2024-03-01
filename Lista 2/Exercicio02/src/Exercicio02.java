import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x, y;

        System.out.println("Digite um numero real:");
        x = in.nextDouble();
        y = in.nextDouble();

        if (x > y){
            System.out.println("O número maior é: " + x);
        }

        else {
            System.out.println("O número maior é: " + y);
        }

    }
}