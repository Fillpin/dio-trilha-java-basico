package dio.listexercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercicio2 {
    public static void main(String[] args) {


        //Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
        //Após isto, calcule a média semetral das temperaturas e mostre todas as temperaturas acima desta média,
        // e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro, etc).

        List<Double> temperaturas = new ArrayList<Double>();
        temperaturas.add(27d);
        temperaturas.add(23d);
        temperaturas.add(19d);
        temperaturas.add(25d);
        temperaturas.add(32d);
        temperaturas.add(28d);

        System.out.println("Temperaturas: " + temperaturas);

        //soma:
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        //média:
        double media = soma / temperaturas.size();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        //mostrar as temperaturas acima da média:
        System.out.println("Temperaturas acima da média:");
        Iterator<Double> iterator1 = temperaturas.iterator();
        double acimaMedia = 0d;
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next > media) {
                acimaMedia = next;
                if (temperaturas.indexOf((acimaMedia)) == 0) System.out.println("1 - Janeiro " + acimaMedia);
                else if (temperaturas.indexOf((acimaMedia)) == 1) System.out.println("2 - Fevereiro " + acimaMedia);
                else if (temperaturas.indexOf((acimaMedia)) == 2) System.out.println("3 - Março " + acimaMedia);
                else if (temperaturas.indexOf((acimaMedia)) == 3) System.out.println("4 - Abril " + acimaMedia);
                else if (temperaturas.indexOf((acimaMedia)) == 4) System.out.println("5 - Maio " + acimaMedia);
                else if (temperaturas.indexOf((acimaMedia)) == 5) System.out.println("6 - Junho " + acimaMedia);
            }
        }
    }
}