package edu.bernard.Exercicio_4;

public class SmarTv {
        boolean ligada=false;
        int volume=25;
        int canal=1;
        
        public void ligar(){
            ligada=true;
        }
        public void desligar(){
            ligada=false;
        }
        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando volume para "+ volume);
        }
        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo volume para "+ volume);
        }
        public void mudarCanal(int canalDifente){

            canal=canalDifente;
            System.out.println("Mudando canal para "+ canal);
            
        }
        public void aumentarCanal(){
            canal++;
            System.out.println("Aumentando canal para "+ canal);
        }
        public void diminuirCanal(){
            canal--;
            System.out.println("Diminuindo canal para "+ canal);
        }
    
}
