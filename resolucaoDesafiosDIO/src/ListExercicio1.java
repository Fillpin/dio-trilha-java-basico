import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercicio1 {
    //notas: 7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println("Lista notas: " + notas);

        List<Double> notas2 = new LinkedList<Double>();
        notas2.addAll(notas);
        System.out.println("Lista notas2: " + notas2);

        //mostrar a primeira nota da lista sem removê-lo:
        Double primeiraNota = notas2.get(0);
        System.out.println("Mostrando a primeira nota da lista sem removê-lo: " + primeiraNota);
        System.out.println("notas2: " + notas2);

        //mostrar a primeira nota da lista removendo-o:
        Double primeiraNota2 = notas2.get(0);
        System.out.println("Mostrando a primeira nota da lista removendo-o: " + primeiraNota);
        notas2.remove(0);
        System.out.println("notas2: " + notas2);


    }
}
