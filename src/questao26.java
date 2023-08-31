import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite em qual turno você estuda. (V - vespertino M - matutino N - Noturno): ");
        char turno = scan.next().charAt(0);

        switch (turno) {
            case 'M':
            case 'm':
                System.out.print("Bom dia!");
                break;
            case 'V':
            case 'v':
                System.out.print("Boa tarde!");
                break;
            case 'N':
            case 'n':
                System.out.print("Boa noite!");

            default:
                System.out.print("Valor inválido!");

        scan.close();
        }
    }
}