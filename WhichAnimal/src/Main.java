import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        String caracteristica1,caracteristica2,caracteristica3;

        caracteristica1 = sc.nextLine();
        caracteristica2 = sc.nextLine();
        caracteristica3 = sc.nextLine();

        if (caracteristica1.equals("vertebrado")) {
            if(caracteristica2.equals("ave")) {
                if(caracteristica3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if(caracteristica3.equals("onivoro")){
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if(caracteristica2.equals("inseto")) {
                if(caracteristica3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if(caracteristica3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}