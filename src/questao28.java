import java.util.Scanner;

public class questao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double fgts = salarioBruto * 0.11;
        double sindicato = salarioBruto * 0.03;

        double impostoRenda = 0.0;
        if (salarioBruto <= 900) {
            impostoRenda = 0;
        } else if (salarioBruto <= 1500) {
            impostoRenda = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            impostoRenda = salarioBruto * 0.1;
        } else {
            impostoRenda = salarioBruto * 0.2;
        }

        double salarioLiquido = salarioBruto - impostoRenda - sindicato;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto Imposto de Renda: R$ " + impostoRenda);
        System.out.println("Desconto Sindicato: R$ " + sindicato);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}


