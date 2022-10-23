package estruturas_de_decisao.parte02;
//milhas = km/1.61

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner distancia = new Scanner(System.in);
        System.out.println("CONVERTENDO KILOMETROS EM MILHAS");
        System.out.println("Digite a distância em quilometros:");
        double km = distancia.nextDouble();
        double milhas = km / 1.61;
        System.out.println("A distãncia em " + km + " corresponde a " + milhas+ "milhas");
    }
}