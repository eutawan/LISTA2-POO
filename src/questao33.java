import java.util.Scanner;

public class questao33 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int N = scan.nextInt();
        scan.close();

        double H = 0;

        System.out.print("H = ");
        for (int i = 1; i < N + 1; i++){
            H =+ 1.0 / i;

            if (i != N){
                System.out.printf("1/%d + ", i);

            }
            else {
                System.out.printf("1/%d + ", i);

            }
        }
        System.out.printf("%f", H);
    }
}
