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

        //operador ternário
        int a = 5;
        int b = 7;

        // tipo pode ser String ou int ; expressão booleana (true ou false) símbolo "?" valor se true : valor se false;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //operadores relacionais
        /* == comparador se dois valores são iguais
        * != comparador se dois valores são diferentes
        * >= maior ou igual a
        * <= menor ou igual a
        * > maior que
        * < menor que
        * */

        /* operadores lógicos
        * && operador lógico "E" as duas condições devem ser verdadeiras
        * || operador lógico "OU" uma condição deve ser verdadeira
         */
    }
}
