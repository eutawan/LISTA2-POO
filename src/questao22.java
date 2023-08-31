import java.util.Scanner;

public class questao22 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        if (num > 0){
            System.out.print("o valor é positivo");
        }
        else {
            System.out.print("O valor é negativo");
        }
    }
}
