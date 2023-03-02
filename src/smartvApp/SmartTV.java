package src.smartvApp;

import java.sql.SQLOutput;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }


    public void ligar (){
        ligada = true;
        System.out.println("TV Ligada.");
    }
    public void desligar (){
        ligada = false;
        System.out.println("TV Desligada.");
    }
}
