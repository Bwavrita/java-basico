package edu.bernard.Exercicio_5;

public class SistemaMedida {

    public static void main(String[] args){
        String sigla= "M";

        /*if(sigla== "P"){System.out.println("PEQUENO");}
        else if(sigla== "M"){System.out.println("MÉDIO");}
        else if(sigla== "G"){System.out.println("GRANDE");}
        else{System.out.println("Indefinido");}*/

        switch(sigla){

        case "P":{
            System.out.println("PEQUENO");
        }
        case "M":{
            System.out.println("MÉDIO");
        }
        case "G":{
            System.out.println("GRANDE");
        }
        case "default":{
            System.out.println("INDEFINIDO");
        }
        }
    }
}
