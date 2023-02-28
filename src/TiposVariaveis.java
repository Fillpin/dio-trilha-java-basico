public class TiposVariaveis {
    public static void main(String[] args) {
        // A palavra "final" antes do tipo da variável indica um tipo de variável constante e, portanto, inalterável.
        final String nome = "Jordan";
        final String sobrenome = "Peterson";

        // int = valores inteiros
        int idade = 25;

        // String = valores em texto
        String endereco = "Tv. Capilé, nº";

        // short = representa valores de -32768 a 32767
        short numEndereco = 53;

        // doule = números decimais
        double salario = 1450.33;

        // float = números decimais (obrigatório o uso do "F" maiúsculo no final do número
        float peso = 68.3F;

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + "Kg");
        System.out.println("Endereço completo: " + endereco + " " + numEndereco);
        System.out.println("Salário: R$" + salario);

    }
}