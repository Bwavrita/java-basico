package edu.bernard.ex4;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        SmarTv smarTv= new SmarTv();
        int canalDiferente;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Qual canal gostaria? ");

        canalDiferente= scanner.nextInt();
        smarTv.ligar();
        smarTv.mudarCanal(canalDiferente);
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirCanal();
        smarTv.aumentarCanal();

        System.out.println("TV ligada?  "+ smarTv.ligada);
        System.out.println(" Canal Atual: "+ smarTv.canal);
        System.out.println("Volume Atul: "+ smarTv.volume);

        scanner.close();
        
    }

    
}
