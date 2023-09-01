import java.util.ArrayList;
import java.util.Scanner;

public class questao39{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.print("Digite sua nota: ");
            double nota = in.nextDouble();
            if (nota == -1) {
                System.out.println("Entrada finalizada");
                break;

            }
            else if (nota > 10){
                System.out.println("Opção inválida!");

            }
            else {
                notas.add(nota);
            }
        }
        double somaDeValores = 0;
        for (int i = 0; i < notas.size(); i++) {
            somaDeValores += notas.get(i);
        }
        System.out.println("Ordem das notas: ");
        for (int t = 0; t < notas.size(); t++) {
            System.out.printf("%f.1f \n", notas.get(t));
        }
        System.out.println("Notas na ordem inversa: ");
        for (int c = notas.size() - 1; c > -1; c--) {
            System.out.printf("%.1f \n", notas.get(c));
        }
        in.close();

        System.out.printf("""
        \nQuantidade de valores: %d
        Soma dos valores: %.1f
        Média dos valores: %.1f
        """, notas.size(), somaDeValores, somaDeValores / notas.size());
        System.out.println("\nPrograma finalizado.");
    }
}

