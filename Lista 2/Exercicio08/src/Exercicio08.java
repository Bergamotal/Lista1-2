import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int number;

        System.out.println("Insira um número inteiro: ");
        number = in.nextInt();

        if ((number%2) == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }
    }
}