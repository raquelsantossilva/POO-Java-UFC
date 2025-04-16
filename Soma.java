import java.util.Scanner;

public class Soma{
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);//analisar entradas de diferentes fontes (como teclado, arquivos, strings, etc.) e convertê-las em tipos de dados primitivos (como int, double, boolean, etc.) ou strings.

        int numero1;
        int numero2;
        int soma;

        System.out.print("digite um numero: ");
        numero1=scanner.nextInt();

        System.out.print("digite outro numero: ");
        numero2=scanner.nextInt();

        soma =numero1+numero2;

        System.out.println("A soma de " +numero1+" e "+numero2+" é: "+soma);// Este método imprime "algum texto" no console e, em seguida, adiciona uma nova linha 
        scanner.close();
    }
}