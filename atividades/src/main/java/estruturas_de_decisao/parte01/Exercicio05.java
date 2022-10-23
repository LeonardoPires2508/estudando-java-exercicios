package estruturas_de_decisao.parte01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String [] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        double n = numeros.nextDouble();
        System.out.println(n + " dividido por 5 é igual a: " + n/5);

    }
}
