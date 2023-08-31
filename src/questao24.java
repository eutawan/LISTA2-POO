import java.util.Scanner;

public class questao24 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Digite um número: ");
        num1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        num2 = scan.nextInt();
        System.out.print("Digite mais um número: ");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.printf("O número %d é maior", num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.printf("O número %d é maior", num2);
        }
        else {
            System.out.printf("O número %d é maior", num3);
        }

    }
}
