package edu.bernard.Exercicio_6;

public class FormatarCep {
    public static void main(String[]args){
        try {
            String cepFormatador = formatarCep("2376506");
            System.out.println(cepFormatador);
        } catch (CepInvalidoException e) {
            System.out.println("Cep não condiz com as normas");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8 )
          throw new CepInvalidoException();

        return "23.765-064";
    }
    
}
