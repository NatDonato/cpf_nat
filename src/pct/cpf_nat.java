package pct;
import java.util.Scanner;

public class cpf_nat {
    public static void main(String[] args) {
   
        int soma = 0, indice = 0, d1, d2;
        String cpf;
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o CPF: \n");
        
        cpf = entrada.next();
        
        if (cpf.length() == 11){
            for (int i=10;i>=2;i--){
                soma += Character.getNumericValue(cpf.charAt(indice)) * i;
                indice++;
            }

        d1 = soma % 11;

        if (d1>=2){
            d1 = 11 - d1;
        }
            else{
            d1 = 0;
        }

        soma = 0;
        indice = 0;
        for(int i=11;i>=2;i--){
            soma += Character.getNumericValue(cpf.charAt(indice)) * i;
            indice++;
        }

        d2 = soma % 11;

        if(d2 >= 2){
            d2 = 11 - d2;
        }
            else{
            d2 = 0;
        }
        
        if(d1 == Character.getNumericValue(cpf.charAt(9)) && d2 == Character.getNumericValue(cpf.charAt(10))){
            System.out.println("Válido.");
            }
        else 
                System.err.println("Inválido.");
        }
        else{
                System.err.println("Cpf " + cpf + "  quantidade incorreta.");
            }
    }
}