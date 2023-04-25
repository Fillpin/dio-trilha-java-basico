import java.util.Scanner;

public class DesafioDragao {


    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe quantos casos você encontrou:");
        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            System.out.println("Informe o poder de luta:");
            poderDeLuta = ler.nextInt();

            if(poderDeLuta <= 8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
}
