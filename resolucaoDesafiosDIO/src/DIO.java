import java.util.Scanner;

public class DIO {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double cont = 1;

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h = h + (1 / cont);
            cont++;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(String.format("%.1f", Math.ceil(h)));
    }

}