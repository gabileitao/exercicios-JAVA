import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = 0, quantVogais = 0;

        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < arrVogais.length; j++) {
                if(str.charAt(i) == arrVogais[j]) {
                    quantVogais++;
                }
            }
            if(str.charAt(i) == ' ') {
                espacosEmBranco++;
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}