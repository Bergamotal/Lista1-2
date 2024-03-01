import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opcao;
        double n1, n2;

        System.out.println("Digite um número: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("Escolha uma opção: ");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        System.out.println("Escolha uma opção: ");
        opcao = in.nextInt();



        switch (opcao) {

                case 1:
                    System.out.println("Resultado: " + (n1+n2));
                break;

                case 2:
                    System.out.println("Resultado: " + (n1-n2));
                break;

                case 3:
                    System.out.println("Resultado: " + (n1*n2));
                break;

                case 4:
                    System.out.println("Resultado: " + (n1/n2));
                break;

        }
    }
}