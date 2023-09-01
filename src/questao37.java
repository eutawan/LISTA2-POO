import java.util.Scanner;

public class questao37 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double totalPrestacao = 0;
        int quantidadePrestacoes = 0;

        while (true) {
            System.out.print("Digite o valor da prestação (ou tecle 0 para sair): ");
            double valorPrestacao = in.nextDouble();

            if (valorPrestacao == 0){
                break;
            }
            System.out.print("Digite o número de dias em atraso: ");
            int diasAtraso = in.nextInt();

            double valorAPagar = valorPagamento(valorPrestacao, diasAtraso);
            System.out.printf("Valor a ser pago: %.2f \n", valorAPagar);

            totalPrestacao += valorAPagar;
            quantidadePrestacoes++;
        }
        System.out.println("Relatório do dia: ");
        System.out.printf("Quantidade de prestações pagas:\n ", quantidadePrestacoes);
        System.out.printf("Valor total de prestações pagas no dia: ", totalPrestacao);

        in.close();
    }
    public static double valorPagamento(double valorPrestacao, int diasAtraso) {
        if (diasAtraso <= 0) {
            return valorPrestacao;
        }
        else {
            double multa = valorPrestacao * 0.03;
            double juros = valorPrestacao * (0.001 * diasAtraso);
            return valorPrestacao + multa + juros;
        }
    }
}
