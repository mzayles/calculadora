import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===\n"+
        "1 - Somar\n" +
        "2 - Subtrair\n" +
        "3 - Multiplicar\n" +
        "4 - Dividir\n" +
        "5 - Dobrar\n" +
        "6 - Exponenciar\n" +
        "7 - Sair\n" +
        "\nEscolha uma opção: \n");      

        int opcao = sc.nextInt();

        if (opcao <= 0 || opcao > 7) {
            System.out.println("Opção inválida!");
        } else {
            System.out.print("Digite o 1° número: ");
            double a = sc.nextDouble();

            System.out.print("Digite o 2° número: ");
            double b = sc.nextDouble();

            switch(opcao) {
                case 1:
                    double resultadoSoma = Calculo.somar(a, b);
                    System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoSoma);
                    break;
                case 2:
                    double resultadoSubtracao = Calculo.subtrair(a, b);
                    System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoSubtracao);
                    break;
                case 3:
                    double resultadoProduto = Calculo.multiplicar(a, b);
                    System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoProduto);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("O divisor deve ser diferente de 0 (zero).");
                        break;
                    } else {
                        double resultadoDivisao = Calculo.dividir(a, b);
                        System.out.printf("O resultado da divisão de %.2f por %.2f é %.2f.", a, b, resultadoDivisao);
                        break;
                    }
                case 5:
                    double resultadoDobro = Calculo.dobrar(a);
                    System.out.printf("O resultado do dobro de %.2f é %.2f.", a, resultadoDobro);
                    break;
                case 6:
                    double resultadoExponencial = Calculo.exponenciar(a, b);
                    System.out.printf("O resultado da soma de %.2f com %.2f é %.2f.", a, b, resultadoExponencial);
                    break;
                default:
                    System.out.println("Inválido!");
            }
        }
        
        sc.close();
    }
}
