package divisaosegura.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            double c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("O NUMERO NAO PODE SER DIVIDIDO POR ZERO. ERRO: " + e.getMessage());
        }
        sc.close();
    }
}
