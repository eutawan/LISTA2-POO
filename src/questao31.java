import java.util.Scanner;

public class questao31 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int num = scan.nextInt();
        System.out.print("Digite o início da tabuada: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o fim da tabuada: ");
        int fim = scan.nextInt();


        for (int i = inicio; i < fim + 1; i++){
            int resultado = num * i;
            System.out.printf("%d * %d = %d \n", num, i, resultado);
        }
    }
}
