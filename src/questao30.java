import java.util.Scanner;

public class questao30 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int num = scan.nextInt();

        for (int i = 1; i < 11; i++){
            int resultado = num * i;
            System.out.printf("%d * %d = %d \n", num, i, resultado);
        }
    }
}
