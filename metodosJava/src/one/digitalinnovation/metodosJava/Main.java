package one.digitalinnovation.metodosJava;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício Calculadora:");
        Calculadora.soma(30,2);
        Calculadora.subtracao(40,24);
        Calculadora.multiplicacao(3,2);
        Calculadora.divisao(542,2);

        //Mensagem
        System.out.println("Exercício Mensagem:");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

        //Empréstimo
        System.out.println("Exercício Empréstimo:");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(100, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }
}