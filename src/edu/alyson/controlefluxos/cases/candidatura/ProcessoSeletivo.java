package edu.alyson.controlefluxos.cases.candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        // Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        for (String candidato : candidatos) {
            System.out.println(candidato);
        }

        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2300.0);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
