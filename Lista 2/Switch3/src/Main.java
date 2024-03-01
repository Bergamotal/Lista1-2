import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opcao;
        double b, h, r;
        double pi = Math.PI;

        System.out.println("Escolha uma opção: ");
        System.out.println("1.Círculo");
        System.out.println("2.Triangulo Retângulo");
        System.out.println("3.Retângulo");
        System.out.println("Escolha uma opção: ");
        opcao = in.nextInt();


        switch (opcao) {

            case 1:
                System.out.println("Digite a raio: ");
                r = in.nextDouble();
                System.out.println("Área: " + pi * r * r);
            break;

            case 2:
                System.out.println("Digite a base: ");
                b = in.nextDouble();
                System.out.println("Digite a altura: ");
                h = in.nextDouble();
                System.out.println("Área: " + (b * h) / 2);
                System.out.println("Perímetro: " + h * 3);
            break;

            case 3:
                System.out.println("Digite a base: ");
                b = in.nextDouble();
                System.out.println("Digite a altura: ");
                h = in.nextDouble();
                System.out.println("Área: " + (b * h));
                System.out.println("Perímetro: " + (b * 2 + h * 2));
            break;
            default:

                System.out.println("Valor Inválido");

                break;

        }

    }
}