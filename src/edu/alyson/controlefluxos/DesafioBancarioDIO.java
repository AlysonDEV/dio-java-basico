package edu.alyson.controlefluxos;

import java.util.Scanner;

public class DesafioBancarioDIO {
    static double saldo = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                int opcao = scanner.nextInt();
    
                switch (opcao) {
                    case 1:
                        double valorAdicional = scanner.nextDouble();
                        saldo += valorAdicional;
                        exibirSaldo(saldo);
                        break;
                    case 2:
                        double valorRetirada = scanner.nextDouble();
                        if ( saldo >= valorRetirada ) {
                          saldo -= valorRetirada;
                          exibirSaldo(saldo);
                        } else {
                          System.out.println("Saldo insuficiente");
                        }
                        break;
                    case 3:
                        exibirSaldo(saldo);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch ( Exception e) {
                System.out.println("Erro deseconhecido: " + e.getMessage());
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void exibirSaldo(double saldo) {
        String textoFormatado = String.format("Saldo atual: %.1f", saldo);
        System.out.println(textoFormatado);
    }
}
