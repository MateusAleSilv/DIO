import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Theon {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<Integer> avaliacaoP = new ArrayList<>();
        var N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            avaliacaoP.add(scanner.nextInt());

        }
        System.out.println(getBestAvaliacaoPIndexOf(avaliacaoP));
    }

    public static int getBestAvaliacaoPIndexOf(List<Integer> avaliacaoP) {
        return avaliacaoP.indexOf(Collections.min(avaliacaoP)) + 1;
    }

}
