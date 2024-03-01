import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite as notas:");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        double m = (n1 + n2) / 2;

        if (m < 50){
            System.out.println("Reprovado!");
        }

        else {
            System.out.println("Aprovado!");
        }

    }
}