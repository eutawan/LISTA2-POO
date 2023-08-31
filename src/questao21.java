import java.util.Scanner;

public class questao21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite um número: ");
        num1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        num2 = scan.nextInt();

        if (num1 > num2){
            System.out.printf("Número maior: %d", num1);
        }
        else {
            System.out.printf("Número maior: %d", num2);
        }

    }
}
