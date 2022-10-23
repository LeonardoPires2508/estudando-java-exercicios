package estruturas_de_decisao.parte02;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner distancia = new Scanner(System.in);
        System.out.println(" --- CONVERTENDO DISTANCIAS ---");
        System.out.println("Qual a distância em milhas?");
        double milhas = distancia.nextDouble();
        double km = 1.61 * milhas;
        System.out.println(" Temos que: "+milhas+" milhas, correspondem a "+km+" quilometros");

    }
}
