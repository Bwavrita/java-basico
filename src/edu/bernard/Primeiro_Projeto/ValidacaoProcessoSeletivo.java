package edu.bernard.Primeiro_Projeto;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ValidacaoProcessoSeletivo {

    public static void main(String[] args) {
        int i = 0;
        int salario = 2000;
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        String[] totalSelecionado = new String[5];
        int proximoCandidato = 0;
        
        
        while (i < 5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato];
            double proposta = valorPretendido();
            System.out.println("O candidato " + candidato + " está pedindo " + proposta);
            
            if (proposta > salario) {
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
            } else {
                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                totalSelecionado[i] = candidato;
                i++; 
            }
            
            proximoCandidato++; 
            System.out.println("Total de selecionados: " + i);
            System.out.println("Total de consultados: " + proximoCandidato);
        }
        
        System.out.println("Candidatos selecionados:");
        for (i = 0; i < 5; i++) {
            System.out.println(totalSelecionado[i]);
        }
        for (i = 0; i < 5; i++) {
           ligar(totalSelecionado[i]);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
    static void ligar(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
}
