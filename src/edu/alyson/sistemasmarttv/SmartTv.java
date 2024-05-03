package edu.alyson.sistemasmarttv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        notificar(ligada);
    }

    public void desligar() {
        ligada = false;
        notificar(ligada);
    }

    public void aumentarVolume() {
        volume++;
        notificar(volume, "volume");
    }

    public void diminuirVolume() {
        volume--;
        notificar(volume, "volume");
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        notificar(canal, "canal");
    }

    public void subirCanal() {
        canal++;
        notificar(canal, "canal");
    }

    public void descerCanal() {
        canal--;
        notificar(canal, "canal");
    }

    public void estadoAtual() {
        System.out.println("Tv ligada? " + ligada);
        System.out.println("Canal atual: " + canal);
        System.out.println("Volume atual: " + volume);
    }

    public void notificar(boolean tvLigadaDesligada) {
        System.out.println("Novo estado -> TV ligada? " + tvLigadaDesligada);
    }

    public void notificar(int tvMudanca, String setor) {
        if (setor == "canal") {
            System.out.println("Novo estado -> Mudança de canal: " + tvMudanca);
        } else if ( setor == "volume" ) {
            System.out.println("Novo estado -> Mudança de volume: " + tvMudanca);
        } else {
            System.err.println("Erro ao definer qual a mudança");
        }
    }
}
