import java.util.Scanner;

public class questao38 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int respostas = 0;

        System.out.println("Telefonou para a vítima? (S/N): ");
        String perg1 = in.next().toUpperCase();

        if (perg1.equals("S")){
            respostas += 1;
        }

        System.out.println("Esteve no local do crime? (S/N): ");
        String perg2 = in.next().toUpperCase();

        if (perg2.equals("S")){
            respostas += 1;
        }

        System.out.println("Mora perto da vítima? (S/N): ");
        String perg3 = in.next().toUpperCase();

        if (perg3.equals("S")){
            respostas += 1;
        }

        System.out.println("Devia para a vítima? (S/N): ");
        String perg4 = in.next().toUpperCase();

        if (perg4.equals("S")){
            respostas += 1;
        }

        System.out.println("Já trabalhou com a vítima? (S/N): ");
        String perg5 = in.next().toUpperCase();

        if (perg5.equals("S")){
            respostas += 1;
        }

        if (respostas == 2){
            System.out.println("Você é uma pessoa suspeita!");

        } else if (respostas > 2 && respostas < 5){
            System.out.println("Você é cúmplice de assassinato!");

        } else if (respostas == 5){
            System.out.println("Você é o assassino!");

        } else {
            System.out.println("Você é inocente!");
        }


    }
}
