import java.util.*;
public class Main {
    public static void main(String[] args) {
        int casos;
        int poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();
            if (poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
    }
}