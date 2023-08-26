package edu.bernard.Exercicio_5;

import java.util.Scanner;

public class Plano {
    public static void main(String[] args){
        String plano;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Qual plano o senhor tem? [BASIC][MIDIA][TURBO]");
        plano=scanner.next();

        switch (plano) {
            case "BASIC":
                System.out.println("100 minutos de ligação");
                break;
            case "MIDIA":
                System.out.println("100 minutos de ligação + Whats e Instagram grátis");
                break;
            case "TURBO":
                System.out.println("100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube");
                break;
            default:
                System.out.println("PLANO INEXISTENTE");
    }
}
}
