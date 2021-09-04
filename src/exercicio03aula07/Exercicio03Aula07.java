package exercicio03aula07;
import java.util.Scanner;

public class Exercicio03Aula07 {

    public static void main(String[] args) {
    //Construa em Java, um programa que recebe um valor(1) entre zero e nove(2) e 
    //exibe uma mensagem informando qual o valor digitado(3). 
    //Caso o valor seja inválido(4) exiba uma mensagem de erro e solicite novamente(5) 
    //um valor válido.
    
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        boolean valido = false;
        
        //(n>=0 && n<=9) <--- condição
        //System.out.println("O valor digitado foi: " + n);
        //enquanto o numero for maior que zero e menor que 9 faça alguma coisa..
        //do(faça)-while(enquanto)
        
        do { 
            double n = input.nextDouble();
            if(n >= 0 && n <= 9) {
                valido = true;
                System.out.println("O valor digitado foi: " + n);
            } else {
                System.out.println("Erro! Digite o número novamente.");
            }
        } while(valido == false);      
        
    }
    
}
