package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite dois valores positivos e escolha uma opção\n");
        System.out.print("Valor 1\n");
        double valor1 = leitor.nextDouble(); 
        System.out.print("Valor 2\n");
        double valor2 = leitor.nextDouble(); 

        if(valor1 <= 0 || valor2 <= 0){
            System.out.println("Valores inválidos. Tente novamente");

        }else{
            System.out.print("Menu de opções escolha:\n 1 - Somar\n 2 - Subtrair\n" 
            + " 3 - Multiplicar\n 4 - Dividir\nDigite sua opção: ");
            int opcao = leitor.nextInt();

            switch(opcao){
                case 1: {
                    System.out.printf("Selecionado somar\n Resultado -> " + (valor1 + valor2) + "\n");
                }break;
                case 2: {
                    System.out.printf("Selecionado subtrair\n Resultado -> " + (valor1 - valor2) + "\n");
                }break;
                case 3: {
                    System.out.printf("Selecionado multiplicar\n Resultado -> " + (valor1 * valor2) + "\n");
                }break;
                case 4: {
                    System.out.printf("Selecionado dividir\n Resultado -> " + (valor1 / valor2) + "\n");
                }break;
                default:{
                    System.out.println("Operação desconhecida. Tente outra vez.\n");
                }   
            }
        }
        leitor.close();
    }
}
