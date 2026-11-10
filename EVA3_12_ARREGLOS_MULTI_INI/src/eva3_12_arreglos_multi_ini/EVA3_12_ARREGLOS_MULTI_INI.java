/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_arreglos_multi_ini;

/**
 *
 * @author bisonte
 */
public class EVA3_12_ARREGLOS_MULTI_INI {
    
    public static void main(String[] args) {

        String dias[] = {
            "Domingo", "Lunes", "Martes",
            "Miercoles", "Jueves", "Viernes", "Sabado"
        };

        int califas[][] = {
            {50, 100, 75, 30},
            {80, 66, 22, 10}
        };

        for (int i = 0; i < dias.length; i++) {
            System.out.println("[" + dias[i] + "]");
        }

        System.out.println();

        for (int i = 0; i < califas.length; i++) { // Filas
            for (int j = 0; j < califas[i].length; j++) { // Columnas
                System.out.print("[" + califas[i][j] + "]");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}