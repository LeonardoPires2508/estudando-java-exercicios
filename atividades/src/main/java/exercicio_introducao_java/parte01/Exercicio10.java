package exercicio_introducao_java.parte01;

//Converter Km/h em m/seg

import java.util.Scanner;

public class Exercicio10 {
    public static void  main (String[] args){
        Scanner velocidade = new Scanner(System.in);
        System.out.println("----XXXX---- CONVERSÃO DE VELOCIDADE ----XXXX----");
        System.out.println("Qual a velocidade em km/h ?");
        double kmPorHora = velocidade.nextDouble();
        double mPorSegundo = kmPorHora/3.6;
        System.out.println("Convertendo temos que: " + kmPorHora + " km/h correspondem a " + mPorSegundo + " m/s.");
    }
}
