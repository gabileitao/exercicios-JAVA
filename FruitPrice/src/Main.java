//morangos - até 5kg = 2,50; +5kg = 2,20
//maças - até 5kg = 1,80; +5kg = 1,50
//se der +8kg frutas (morango e maça) OU 25,00 = +10% de desconto
//saida = valor a ser pago, com até duas casas decimais

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantidadeMorangos = input.nextInt();
        int quantidadeMacas = input.nextInt();
        double valorFinal;
        double somaPrecos, somaFrutas;
        double valorMorango, valorMaca;

        if(quantidadeMorangos <= 5) {
            valorMorango = quantidadeMorangos * 2.50;
        } else {
            valorMorango = quantidadeMorangos * 2.20;
        }

        if(quantidadeMacas <= 5) {
            valorMaca = quantidadeMacas * 1.80;
        } else {
            valorMaca = quantidadeMacas * 1.50;
        }

        somaPrecos = valorMorango + valorMaca;
        somaFrutas = quantidadeMacas + quantidadeMorangos;

        if (somaPrecos > 25.00 || somaFrutas > 8) {
            valorFinal = somaPrecos - (somaPrecos * 0.1);
        } else {
            valorFinal = somaPrecos;
        }

        System.out.println(valorFinal);
    }
}