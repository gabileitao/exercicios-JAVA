import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        //int valorDistribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        //int valorImpostos = (custoFabrica * percentualImpostos) / 100;
        //int valorFinal = custoFabrica + valorDistribuidor + valorImpostos;

        int valorFinal = custoFabrica + ((custoFabrica * porcentagemDistribuidor) / 100) + ((custoFabrica * percentualImpostos) / 100);

        System.out.println(valorFinal);

    }
}