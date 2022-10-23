package exercicio_introducao_java.parte02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[] args) {
        Scanner velocidade = new Scanner(System.in);
        System.out.println("----XXXX---- CONVERSÃO DE VELOCIDADE ----XXXX----");
        System.out.println("Qual a velocidade em m/s ?");
        double mPorSegundo = velocidade.nextDouble();
        double kmPorHora = mPorSegundo * 3.6;
        System.out.println("Convertendo temos que: " + mPorSegundo + " m/s correspondem a " + kmPorHora + " km/h.");
    }
}
