package somadenumeros.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        while (true) {
            System.out.print("Digite um número (ou sair): ");
            String entrada = sc.next();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                soma += numero;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite apenas números ou 'sair'.");
            }
        }

        System.out.println("Soma final = " + soma);

        sc.close();
    }
}
