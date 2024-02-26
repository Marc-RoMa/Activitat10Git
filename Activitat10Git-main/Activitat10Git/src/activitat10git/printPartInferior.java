/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitat10git;

/**
 *
 * @author phoen
 */
public class printPartInferior {

    // Mètode per imprimir la part inferior
    public static void printPartInferior(String M) {
        for (int i = 0; i < M.length(); i++) {
            // Imprimeix el primer triangle de la segona part
            for (int j = i; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }

            // Imprimeix espais entre el primer i segon triangle de la segona part
            for (int j = 0; j <= i; ++j) {
                System.out.print(" ");
            }

            // Imprimeix el segon triangle de la segona part
            for (int j = 0; j < i + 1; ++j) {
                System.out.print(M.charAt(j));
            }
            System.out.println();
        }
    }
}
