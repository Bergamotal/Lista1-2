import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite as notas:");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        double m = (n1 + n2) / 2;

        if (m >= 50){
            System.out.println("Aprovado!");
        }

        else {
            System.out.println("Digite a nota da recuperação: ");
            n3 = in.nextDouble();
            double m2 = (n3 + m) / 2;

            if (m2 < 50){
                System.out.println("Reprovado!");
            }
            else{
                System.out.println("Aprovado!");
            }


        }


    }
}