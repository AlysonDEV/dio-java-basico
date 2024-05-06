package edu.alyson.controlefluxos.condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 4;
        
        // Condicinonal Simple e Composta
        // if(nota >= 7){
        //     System.out.println("Aprovado");
        // }
        // else if( nota >= 5 && nota < 7) {
        //     System.out.println("Recuperação");
        // }
        // else {
        //     System.out.println("Reprovado");
        // }

        // Condicional Ternária

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Prova de recuperação" : "Reprovado";
        System.out.println(resultado);

     }
}
