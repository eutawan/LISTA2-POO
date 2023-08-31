import java.util.Scanner;

public class questao32 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do atleta: ");
        String name = scan.nextLine();

        double[] saltos = new double[5];
        double melhorSalto = 0;
        double piorSalto = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Salto %d: ", i + 1);
            double salto = scan.nextDouble();
            saltos[i] = salto;

            if (i == 0){
                melhorSalto = saltos[i];
                piorSalto = saltos[i];
            }
            if (saltos[i] > melhorSalto){
                melhorSalto = saltos[i];

            }
            else if (saltos[i] < piorSalto){
                piorSalto = saltos[i];

            }
            else {
                saltos[i] = saltos[i];
            }
        }
        double mediaSaltos = 0;
        for (int i = 0; i < saltos.length; i++){
            mediaSaltos += saltos[i];

        }
        double medSaltos = (mediaSaltos - (melhorSalto + piorSalto)) / 3;

        scan.close();

        System.out.println("");
        System.out.printf("""
                Nome do atleta: %s

                Melhor salto: %.2f m
                Segundo salto: %.2f m
                Terceiro salto: %.2f m
                Quarto salto: %.2f m
                Quinto salto: %.2f m

                O melhor salto: %.2f m
                O pior salto: %.2f m
                Média dos saltos: %.2f m

                Resultado: 
                %s - %.2f m
                """, name, saltos[0], saltos[1], saltos[2], saltos[3], saltos[4], melhorSalto, piorSalto, mediaSaltos, name, medSaltos);



    }
}
