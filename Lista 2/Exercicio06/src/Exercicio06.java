import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1;

        System.out.println("Digite um número inteiro:");
        n1 = in.nextInt();

        if (n1 >= 5 && n1 <= 9){
            System.out.println(n1);
        }

        else {
            System.out.println("Opção inválida!");
        }

    }
}