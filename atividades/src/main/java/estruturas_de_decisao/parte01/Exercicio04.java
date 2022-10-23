package estruturas_de_decisao.parte01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        System.out.println("Digite um número qualquer: ");
        Scanner numeros = new Scanner(System.in);
        double numero = numeros.nextDouble(); //Digitar numero Exemplo: 2,4
        double numero2 = Math.pow(numero, 2);
        System.out.println("Você sabia que " + numero + "² é igual a " + numero2 + " ?");

    }
}
