package multiplasexcecoes.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada1, entrada2;
        int num1, num2;
        double resultado;

        int[] vetor = {10,20,30};
        int indice;

        try {
            System.out.print("Digite o primeiro número: ");
            entrada1 = sc.next();

            System.out.print("Digite o segundo número: ");
            entrada2 = sc.next();

            num1 = Integer.parseInt(entrada1);
            num2 = Integer.parseInt(entrada2);

            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não permitida!");
            }

            resultado = (double) num1 / num2;
            System.out.println("Resultado: " + resultado);

            System.out.print("Digite um índice para acessar o vetor (0 a 2): ");
            indice = sc.nextInt();

            System.out.println("Valor no vetor: " + vetor[indice]);

        } catch (NumberFormatException e) {
            System.out.println("Erro: valor digitado não é número.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Erro: índice inválido no vetor.");
        } finally {
            System.out.println("\nProcesso finalizado!");
        }

        sc.close();
    }
}
