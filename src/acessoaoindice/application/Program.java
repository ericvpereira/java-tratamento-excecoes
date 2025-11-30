package acessoaoindice.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int vetor[] = new int[5];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = sc.nextInt();
            }
            int indice = sc.nextInt();
            System.out.println(vetor[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INDICE INVALIDO. ERRO: " + e.getMessage());
        }

        sc.close();
    }
}
