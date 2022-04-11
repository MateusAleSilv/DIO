import java.util.Scanner;
public class DesafioDio {
    private static final int COMPROMISSO = 8 * 60;
    private static final int ATRASO_ATE_TERMINAL = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] relogio = scanner.nextLine().split(":");
            int horas = Integer.parseInt(relogio[0]);
            int minutos = Integer.parseInt(relogio[1]);
            System.out.printf("Atraso maximo: %d\n", getMaximumDeplay(horas, minutos));
        }
    }
    public static int getMaximumDeplay(int horas, int minutos) {
        return Math.max(ATRASO_ATE_TERMINAL + (horas * 60 + minutos) - COMPROMISSO, 0);
    }
}
