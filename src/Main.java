import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a Calculadora com Scanner!");
        System.out.println("====================================");
        System.out.println("Esse projeto é uma atualização de um projeto já existente no meu Github, vão lá daruma olhada! @odanielnicolau");
        System.out.println("====================================");
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("====================================");
        System.out.println("Olá, " + name +", digite o priemiro valor: ");
        String op1 = scanner.nextLine();
        System.out.println("Agora digite o segundo valor: ");
        String op2 = scanner.nextLine();
        System.out.println("Olá, " + name +", escolha a operação a ser realizada.");
    }

}