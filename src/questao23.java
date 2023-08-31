import java.util.Scanner;

public class questao23 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;

        System.out.print("Digite sua primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10){
            System.out.printf("Média %.2f. Aluno aprovado!", media);
        }
        else if (media < 7){
            System.out.printf("Média %.2f. Aluno reprovado!", media);
        }
        else if (media == 10){
            System.out.printf("Média %.0f. Aluno aprovado com distinção", media);
        }

    }
}
