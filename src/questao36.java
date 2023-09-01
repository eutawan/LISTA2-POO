import java.util.Scanner;

public class questao36 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = in.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = in.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = in.nextInt();

        int result = (soma(num1, num2, num3));

        System.out.printf("A soma dos argumentos: %d", soma(num1, num2, num3));
    }
    public static int soma( int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
