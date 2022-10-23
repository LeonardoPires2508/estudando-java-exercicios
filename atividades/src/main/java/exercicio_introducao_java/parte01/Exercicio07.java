package exercicio_introducao_java.parte01;

// C = 5.0 * (F - 32)/9.0
import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Convertendo Fahrenheit para Celcius");
        System.out.println("Digite um valor de temperatura em Fahrenheit:");
        double grausF = temp.nextDouble();
        double grausC = 5*(grausF - 32)/9;
        System.out.println(grausF + "° Fahrenheit, corresponde a " + grausC +"° Celcius" );
    }
}
