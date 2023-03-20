import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto, sobraRenda;

        if(renda <= 2000.00) {
            System.out.println("Isento");
        } else if(renda > 2000.00 && renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            System.out.println(String.format("R$ %.2d", imposto));
        } else if(renda > 3000.00 && renda <= 4500.00) {
            sobraRenda = renda - 3000;
            imposto = (1000 * 0.08) + (sobraRenda * 0.18);
            System.out.println(String.format("R$ %.2d", imposto));
        } else {
            sobraRenda = renda - 4500.00;
            imposto = (1000 * 0.08) + (1500 * 0.18) + (sobraRenda * 0.28);
            System.out.println(String.format("R$ %.2d", imposto));
        }
    }

}