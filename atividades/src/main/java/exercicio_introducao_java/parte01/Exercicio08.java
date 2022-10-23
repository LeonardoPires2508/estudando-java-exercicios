package exercicio_introducao_java.parte01;

// C = K - 273.15

import java.util.Scanner;

public class Exercicio08 {
    public static void main (String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Convertendo graus Kelvin em Celcius");
        System.out.println("Digite um valor de temperatura em Kelvin");
        double grausK = temp.nextDouble();
        double grausC =  grausK - 273.15;
        System.out.println("-->>"+grausK+"° Kelvin, corresponde a "+grausC+"° Celcius <<--");
    }
}
