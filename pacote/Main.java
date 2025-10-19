package pacote;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;

        System.out.println("=== CALCULADORA ===\n"+
        "1 - Somar\n" +
        "2 - Subtrair\n" +
        "3 - Multiplicar\n" +
        "4 - Dividir\n" +
        "5 - Dobrar\n" +
        "6 - Exponenciar\n" +
        "7 - Sair\n" +
        "\nEscolha uma opção: ");      

        int opcao = sc.nextInt();

        while (opcao <= 0 || opcao > 7) {
            System.out.println("Opção inválida! Digite novamente: ");
            opcao = sc.nextInt();
        }

        if (opcao != 5 && opcao != 7) {
            System.out.print("\nDigite o 1° número: ");
            a = sc.nextDouble();

            System.out.print("Digite o 2° número: ");
            b = sc.nextDouble();

            while (opcao == 4 && b == 0) {
                System.out.println("\nO divisor deve ser diferente de 0 (zero). Digite novamente o valor do denominador: ");
                b = sc.nextInt();
            }
        } else if (opcao == 5) {
            System.out.print("\nDigite o número: ");
            a = sc.nextDouble();
        } else {
            System.out.println("Encerrando o programa Calculadora.");
            System.exit(0);
        }

        switch(opcao) {
            case 1:
                System.out.printf("\nO resultado da soma de %.2f com %.2f é %.2f.", a, b, Calculo.somar(a, b));
                break;
            case 2:
                System.out.printf("\nO resultado da subtração de %.2f com %.2f é %.2f.", a, b, Calculo.subtrair(a, b));
                break;
            case 3:
                System.out.printf("\nO resultado da multiplicação de %.2f por %.2f é %.2f.", a, b, Calculo.multiplicar(a, b));
                break;
            case 4:
                System.out.printf("\nO resultado da divisão de %.2f por %.2f é %.2f.", a, b, Calculo.dividir(a, b));
                break;
            case 5:
                System.out.printf("\nO dobro de %.2f é %.2f.", a, Calculo.dobrar(a));
                break;
            case 6:
                System.out.printf("\nO resultado da base %.2f pelo expoente %.2f é %.2f.", a, b, Calculo.exponenciar(a, b));
                break;
        }
        
        sc.close();
    }
}
