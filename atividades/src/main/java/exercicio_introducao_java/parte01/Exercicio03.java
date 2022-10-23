package exercicio_introducao_java.parte01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro numero: ");
        Scanner numeros = new Scanner(System.in);
        int numero1 = numeros.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = numeros.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = numeros.nextInt();
        System.out.println("======================");
        int resultado = numero1 + numero2 + numero3;
        System.out.println("A soma de: " +numero1+ " + " +numero2+ " + " +numero3+ " + " + " = " + resultado);
    }
}
