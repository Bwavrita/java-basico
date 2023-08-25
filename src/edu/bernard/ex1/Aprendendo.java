package edu.bernard.ex1;
public class Aprendendo {
        

        public static void main(String [] args){
            String primeiroNome= "Bernard";
            String segundoNome= "Wavrita";

            System.out.printf(nomeCompleto(primeiroNome, segundoNome));
        }

        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do método " + primeiroNome+(" ").concat(segundoNome);
        }
}
