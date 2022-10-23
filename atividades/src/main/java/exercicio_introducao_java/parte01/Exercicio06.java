package exercicio_introducao_java.parte01;

// F = C * (9.0/5.0) + 32

import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Convertendo graus Celcius em Fahrenheit");
        System.out.println("Digite um valor de temperatura em Celcius:");
        double grausC = temp.nextDouble();
        double grausF = (grausC * (9.0/5.0) + 32);
        System.out.println("Convertendo " + grausC + "°" + " Celcius para Fahrenheit, temos: " + grausF + "°F");
    }



}
