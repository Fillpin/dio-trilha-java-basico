public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();


        // Ligando a TV...
        // String statusTV = smartTv.ligada ? "TV Ligada!" : "TV Desligada.";

        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
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
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //Desligando a TV...
        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("fim.");

    }
}