import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double ladoA = leitor.nextDouble();
        double ladoB = leitor.nextDouble();
        double ladoC = leitor.nextDouble();
        boolean trueTriangle;

        trueTriangle = TrueTriangle(ladoA, ladoB, ladoC);

        if(trueTriangle) {
            System.out.println(String.format("Perimetro = %.1f",ladoA + ladoB + ladoC));
        } else {
            System.out.println(String.format("Area = %.1f", ((ladoA + ladoB) * ladoC) / 2));
        }
    }

    public static boolean TrueTriangle (double a, double b, double c) {
        boolean ladoValidoA, ladoValidoB, ladoValidoC;

        ladoValidoA = Math.abs(b - c) < a && a < b + c;
        ladoValidoB = Math.abs(a - c) < b && b < a + c;
        ladoValidoC = Math.abs(a - b) < c && c < a + b;

        return (ladoValidoA && ladoValidoB && ladoValidoC) ? true : false;

    }

}