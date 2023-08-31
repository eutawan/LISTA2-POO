import java.util.Scanner;

public class questao27 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o atual salário do colaborador: ");
        double salarioAtual = scan.nextDouble();

        double percentualAumento;
        if (salarioAtual <= 280.0){
            percentualAumento = 0.2;
        }
        else if (salarioAtual <= 700.0){
            percentualAumento = 0.15;
        }
        else if (salarioAtual <= 1500.0){
            percentualAumento = 0.1;
        }
        else {
            percentualAumento = 0.05;
        }
        double aumento = salarioAtual * percentualAumento;
        double novoSalario = salarioAtual + aumento;

        System.out.printf("Salário antes do reajuste: R$%.2f \n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.2f \n", percentualAumento);
        System.out.printf("Valor do aumento: R$%.2f \n", aumento);
        System.out.printf("Novo salário após o aumento: R$%.2f", novoSalario);

        scan.close();
    }
}
