package edu.alyson.controlefluxos.excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecoes {
    public static void main(String[] args) {
        try {
            // Number valor = Double.valueOf("a1.75");
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        // } catch (NumberFormatException e) {
        } catch (ParseException e) {
            System.out.println("Não foi possível fazer o parse");
        }
        finally {
            System.out.println("Terminando o programa");
        }
        
    }
}
