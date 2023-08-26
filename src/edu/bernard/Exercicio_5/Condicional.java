package edu.bernard.Exercicio_5;

public class Condicional{
    public static void main(String[]argd){
        int nota=8;

        String resultado= nota > 7 ? "Aprovado" : nota <=5 && nota<6 ? "Prova de recuperação" : "Reprovado";

        System.out.println(resultado);

       /* if(nota>=7){System.out.println("Aprovado");}
        else if(nota>=5 && nota<=6){System.out.println("Prova recuperação");}
        if(nota<5){System.out.println("Reprovado");}*/
    }

}