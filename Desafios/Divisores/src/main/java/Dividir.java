import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dividir {
    public static void main(String[] args) {
        for(Integer dividir : getDividirOf(new Scanner(System.in).nextInt())) {
            System.out.println(dividir);
        }
    }

    public static List<Integer> getDividirOf(int numero){
        var dividir = new ArrayList<Integer>();
        for(int i = 1; i <= numero; i++) {
            if(numero % i == 0) dividir.add(i);
        }
        return dividir;
    }

}
