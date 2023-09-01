import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class questao40 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, Integer> votos = new HashMap<>();
        votos.put("Windows Server", 0);
        votos.put("Unix", 0);
        votos.put("Linux", 0);
        votos.put("Netware", 0);
        votos.put("Mac OS", 0);
        votos.put("Outro", 0);

        int voto;
        while (true){
            System.out.print("Informe o seu voto: (0 a 6): ");
            voto = in.nextInt();
            if (voto == 0){
                break;

            }
            else if (voto >= 1 && voto <= 6){
                String sist = obterNomeSistema(voto);
                votos.put(sist, votos.get(sist) + 1);

            }
            else {
                System.out.println("Voto inválido. Por favor informe um valor entre 0 e 6 (incluindo)");
            }
        }
        int totalVotos = votos.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sistema Operacional     Votos   %");
        System.out.println("-------------------     -----   ---");

        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            String sistema = entry.getKey();
            int votosSistema = entry.getValue();
            double percentual = (votosSistema / (double) totalVotos) * 100;
            System.out.printf("%-24s %-7d %.1f%%\n", sistema, votosSistema, percentual);
        }
        System.out.println("-------------------      -----    ---");
        System.out.printf("Total                   %-7d\n", totalVotos);

        String vencedor = obterSistemaMaisVotado(votos);
        System.out.printf("System.out.printf(\"\\nO Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.1f%% dos votos.", vencedor, votos.get(vencedor), (votos.get(vencedor) / (double) totalVotos) * 100);

    }
    public static String obterNomeSistema(int voto) {

        switch (voto){
            case 1:
                return "Windows Server";
            case 2:
                return "Unix";
            case 3:
                return "Linux";
            case 4:
                return "Netware";
            case 5:
                return "Mac OS";
            case 6:
                return "Outro";
            default:
                return " ";
        }
    }
    public static String obterSistemaMaisVotado(Map<String, Integer> votos) {
        String vencedor = null;
        int maxVotos = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                vencedor = entry.getKey();
            }
        }
        return vencedor;
    }
}

