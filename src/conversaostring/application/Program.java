package conversaostring.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String number = sc.next();
            int convertedNumber = Integer.parseInt(number);
            System.out.println(convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("VALOR NÃO NUMÉRICO. ERRO: " + e.getMessage());
        }
        sc.close();
    }
}
