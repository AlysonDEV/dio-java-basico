package edu.alyson.sistemasmarttv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.estadoAtual();
        smartTv.ligar();
        smartTv.estadoAtual();
        

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();

        smartTv.descerCanal();

        smartTv.mudarCanal(120);
    }
}
