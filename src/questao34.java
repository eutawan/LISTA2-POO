import java.util.Scanner;

public class questao34 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int N = scan.nextInt();
        scan.close();

        for (int i = 1; i < N + 1; i++){
            for (int a = 1; a < i + 1; a++){

                System.out.print(i);

            }
            System.out.println(" ");

        }
    }
}
