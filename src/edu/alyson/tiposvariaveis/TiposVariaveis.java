package edu.alyson.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Apreendendo sobre tipos e variáveis");
        double salarioMinimo = 2.5;
        System.out.println("O salário mínimo é: " + salarioMinimo);

        byte idade = 123;
        imprimir("Idade: ", String.valueOf(idade));
        short ano = 2021;
        imprimir("Ano: ", String.valueOf(ano));
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        imprimir("CEP: ", String.valueOf(cep));
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        imprimir("CPF: ", String.valueOf(cpf));
        float pi = 3.14F;
        imprimir("PI: ", String.valueOf(pi));
        double salario = 1275.33;
        imprimir("Salário: ", String.valueOf(salario));


        Separador(40);
        int numeroTesteUnario = 5;
        System.out.println("Numero 5 com o unário negativo: " + -numeroTesteUnario);

        numeroTesteUnario = -numeroTesteUnario;
        System.out.println("Numero 5 com o unário negativo: " + numeroTesteUnario);
        
        numeroTesteUnario = -numeroTesteUnario; // seria o mesmo que: numero = numero * -1;
        System.out.println("Numero 5 com o unário negativo: " + numeroTesteUnario);

        Separador(40);

        System.out.println("Comparador ternário");
        int comparadorA = 5;
        int comparadorB = 6;
        // String resultado;

        /*if (comparadorA == comparadorB) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }*/

        String resultado = comparadorA == comparadorB ? "Verdadeiro" : "Falso"; // Mesmo resultado de um if normal

        System.out.println("A comparação entre os valores A(" + comparadorA + ") e B(" + comparadorB + ") é " + resultado);

        
    }

    

    public static void imprimir(String... args) {
        final String MENSAGEM = "Método para imprimir informações: ";
        final byte DIVISOR = 40;

        byte totalImpressoes = 0;

        for (String argsString : args) {
            Separador(DIVISOR);
            if (totalImpressoes == 0) {
                System.out.println(MENSAGEM);
            }
            System.out.println(argsString);
            totalImpressoes++;
        }
    }
    
    public static void Separador(Byte total) {
        for (byte i = 0; i < total; i++) {
            System.out.print("-");
        }
        System.out.println(""); // Apenas para quebrar a linha
    }

    private static void Separador(int totalVelho) {
        byte total = (byte) totalVelho;
        for (byte i = 0; i < total; i++) {
            System.out.print("-");
        }
        System.out.println(""); // Apenas para quebrar a linha
    }
}
