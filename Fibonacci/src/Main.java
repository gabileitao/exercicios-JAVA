import java.io.IOException;
import java.util.Scanner;
public class Main {
        static long fibo(int n) {
            int F = 0;     // atual
            int ant = 0;   // anterior

            for (int i = 1; i <= n; i++) {

                if (i == 1) {
                    F = 1;
                    ant = 0;
                } else {
                    F += ant;
                    ant = F - ant;
                }

            }

            return F;
        }

        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            int quantidadeFibo = leitor.nextInt();

            for (int i = 0; i < quantidadeFibo; i++) {
                System.out.print(fibo(i) + " ");
            }

        }

    }