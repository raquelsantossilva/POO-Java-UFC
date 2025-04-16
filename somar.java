import java.util.Scanner;


public class somar{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int num1;
        int num2;
        int soma;

        System.out.print("digite um numero: ");
        num1 = scanner.nextInt();

        System.out.print("digite outro numero: ");
        num2 = scanner.nextInt();

        soma = num1+num2;

        System.out.println("a soma é:"+soma);
    }
}