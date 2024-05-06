package edu.alyson.controlefluxos.repeticoes;

public class ExemploFor {
    public static void main(String[] args) {
        for(int carnerinho = 1; carnerinho <= 100; carnerinho++) {
            System.out.print(carnerinho);
            System.err.println(carnerinho > 1 ? " carneirinhos": " carneirinho");
        }
        System.out.println("Jãozinho domiu!");
    }

}
