public class OperadoresJava {
    public static void main(String[] args) {
        // valor original é sempre positivo
        int numero = 5;
        System.out.println(numero);

        // deixar o número negativo
        numero = - numero;
        System.out.println(numero);

        //converter números negativos em positivos (multiplicar por -1)
        numero = numero * -1;
        System.out.println(numero);

        // x repeticao
        //numero = numero + 1; incrementar
        System.out.println( ++ numero);

        numero = numero ++;
        System.out.println(numero);

        //decrementar
        //numero = numero -1;
        System.out.println( -- numero );

        boolean variavel = true;
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);


    }
}
