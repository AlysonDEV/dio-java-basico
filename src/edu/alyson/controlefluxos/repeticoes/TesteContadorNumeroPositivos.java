package edu.alyson.controlefluxos.repeticoes;

public class TesteContadorNumeroPositivos {
    // TODO: fazer um contagem de um a cem e só exibir os impares
    public static void main(String[] args) {
        for (int contador = 1; contador <= 100; contador++) {
            // if ( contador % 2 > 0) {
            //     System.out.println(contador);
            // }

            // if ( contador % 2 == 0)
            //     continue;
            
            // System.out.println(contador);

            if (contador % 2 > 0) {
                System.out.println(contador);
                break;
            }

        }
    }
}
