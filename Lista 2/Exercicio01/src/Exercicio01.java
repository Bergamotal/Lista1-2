import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x;

        System.out.println("Digite um numero real:");
        x = in.nextDouble();

        if (x >= 0){
            System.out.println("A raiz é: " + Math.sqrt(x));
        }

        else {
            System.out.println("Valor inválido!");
        }

    }
}