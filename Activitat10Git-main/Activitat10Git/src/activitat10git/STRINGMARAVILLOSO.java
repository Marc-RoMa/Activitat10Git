package activitat10git;

import static activitat10git.printPartInferior.printPartInferior;
import static activitat10git.printPartSuperior.printPartSuperior;

public class STRINGMARAVILLOSO {

    public static void main(String[] args) {
        String M = "MARAVILLOSO";

        System.out.println("LA versió que tenim a github ha estat actualitzada i és més actual que la que tinc en local");

        // Part superior
        printPartSuperior(M);

        // Part inferior
        printPartInferior(M);
    }

}
