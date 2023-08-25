package edu.bernard.ex1;
public class Aprendendo {
        //CÓDIGO VAI AQUI
        //quando progrma precisa realizar alguma açao o codigo é inicializado com main:

        public static void main(String [] args){
            String primeiroNome= "Bernard";
            String segundoNome= "Wavrita";

            System.out.printf(nomeCompleto(primeiroNome, segundoNome));
        }

        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do método " + primeiroNome+(" ").concat(segundoNome);
        }
}
