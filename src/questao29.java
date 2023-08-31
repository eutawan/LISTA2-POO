import java.util.Scanner;

public class questao29 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para representar um dia da semana (1 a 7): ");
        int diaNumero = scan.nextInt();

        String diaSemana;

        switch (diaNumero){
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido";
        }
        System.out.printf("Dia da semana correspondente: %s", diaSemana);

        scan.close();
    }
}
