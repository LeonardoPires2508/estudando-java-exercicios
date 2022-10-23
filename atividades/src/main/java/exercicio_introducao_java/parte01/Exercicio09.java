package exercicio_introducao_java.parte01;
 //K = C + 273.15
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("===== CONVETENDO GRAUS CELCIUS EM KELVIN ========");
        System.out.println("Digite um valor de temperatura em Celcius");
        double grausC = temp.nextDouble();
        double grausK = grausC + 273.15;
        System.out.println("-->>"+grausC+"° Celcius, corresponde a "+grausK+"° Kelvin <<--");

    }
}
