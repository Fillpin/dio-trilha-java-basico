package src.smartvApp;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();


        // Ligando a TV...
        System.out.println("Ligando a TV...");
        smartTv.ligar();
        String TVligada = smartTv.ligada==true ? "TV Ligada!" : "TV Desligada.";
        System.out.println(TVligada);

        // Diminuindo o volume...
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        // Imprimindo o volume atual...
        System.out.println("Volume atual? " + smartTv.volume);

        // Imprimindo o canal atual...
        System.out.println("Canal atual " + smartTv.canal);

        // Mudando de canal...
        smartTv.mudarCanal(14);

        // Imprimindo novo Status da Tv...
        System.out.println("Novo Status da TV >>>");
        System.out.println(TVligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //Desligando a TV...
        System.out.println("Desligando a TV...");
        smartTv.desligar();
        String TVdesligada = smartTv.ligada==false ? "TV Desligada." : "TV Ligada!";
        System.out.println(TVdesligada);
        System.out.println("fim.");

    }
}