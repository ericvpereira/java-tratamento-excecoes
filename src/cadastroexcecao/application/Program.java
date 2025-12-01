package cadastroexcecao.application;

import cadastroexcecao.entities.IdadeInvalidaException;

import java.util.Scanner;

public class Program {

    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("Idade inválida! A idade deve estar entre 0 e 120.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        try {
            validarIdade(idade);
            System.out.println("Idade válida! Cadastro realizado.");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
