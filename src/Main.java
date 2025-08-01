import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora com Scanner!");
        System.out.println("====================================");
        System.out.println("Esse projeto é uma atualização de um projeto já existente no meu Github, vão lá dar uma olhada! @odanielnicolau");
        System.out.println("====================================");
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        boolean continuar = true;

        while (continuar) {
            System.out.println("====================================");
            System.out.println("Olá, " + name + ", digite o primeiro valor: ");
            int op1 = scanner.nextInt();
            System.out.print("Agora digite o segundo valor: ");
            int op2 = scanner.nextInt();

            System.out.println("====================================");
            System.out.println("Vamos escolher a operação a ser realizada:");
            System.out.println("1 - Soma (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (x)");
            System.out.println("4 - Divisão (/)");
            System.out.println("5 - Executar todas as operações disponíveis");
            System.out.println("6 - Sair do Programa");
            System.out.print("Digite o número da operação desejada: ");
            int escolha = scanner.nextInt();

            System.out.println("====================================");

            switch (escolha) {
                case 1:
                    System.out.println("A soma dos valores é: " + (op1 + op2));
                    break;
                case 2:
                    System.out.println("A subtração dos valores é: " + (op1 - op2));
                    break;
                case 3:
                    System.out.println("A multiplicação dos valores é: " + (op1 * op2));
                    break;
                case 4:
                    if (op2 != 0) {
                        System.out.println("A divisão dos valores é: " + (op1 / op2));
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 5:
                    System.out.println("Soma: " + (op1 + op2));
                    System.out.println("Subtração: " + (op1 - op2));
                    System.out.println("Multiplicação: " + (op1 * op2));
                    if (op2 != 0) {
                        System.out.println("Divisão: " + (op1 / op2));
                    } else {
                        System.out.println("Divisão: impossível (divisão por zero)");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o programa... Até mais, " + name + "!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }

            // Pergunta se o usuário deseja sair
            System.out.println("====================================");
            System.out.print("Deseja sair do programa? (s/n): ");
            scanner.nextLine(); // consome a quebra de linha pendente
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("s") || resposta.equals("sim")) {
                continuar = false;
                System.out.println("Encerrando o programa... Até mais, " + name + "!");
            }
        }

        scanner.close();
    }
}
