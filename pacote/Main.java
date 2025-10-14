package pacote;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Dobrar");
        System.out.println("6 - Exponenciar");
        System.out.println("7 - Sair");
        System.out.print("\nEscolha uma opção: ");

        String opcao = sc.nextLine();
        System.out.println("");

        System.out.print("Digite o 1° número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o 2° número: ");
        double b = sc.nextDouble();

        switch(opcao) {
            case "1":
                double resultadoSoma = Calculo.somar(a, b);
                System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoSoma);
                break;
            case "2":
                double resultadoSubtracao = Calculo.subtrair(a, b);
                System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoSubtracao);
                break;
            case "3":
                double resultadoProduto = Calculo.multiplicar(a, b);
                System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoProduto);
                break;
            case "4":
                if (b == 0) {
                    System.out.println("O divisor deve ser diferente de 0 (zero).");
                }
                break;
            case "5":
                //
            case "6":
                double resultadoExponencial = Calculo.exponenciar(a, b);
                System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoExponencial);
                break;
        }

        sc.close();
    }
}
