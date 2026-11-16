/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problemas_5;

/**
 *
 * @author bisonte
 */
import java.util.Scanner;

public class EVA3_13_PROBLEMAS_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Arreglo con cinco ciudades (Inicializar en codigo los nombres)
        Capturar la temperatura de 7 dias para cada ciudad.
        Imprimir para cada ciudad, el nombre de la ciudad y el promedio
        de temperatura de esos 7 dias.
        */
        
        Scanner captu = new Scanner(System.in);

        String[] ciudades = {"Chihuahua", "Juarez", "Delicias", "Parral", "Cuauhtemoc"};
        int[][] temperaturas = new int[5][7];

        //CAPTURAR TEMPERATURAS
        for(int i = 0; i < ciudades.length; i++){
            System.out.println("CIUDAD: " + ciudades[i]);

            for(int j = 0; j < temperaturas[i].length; j++){
                System.out.print("TEMPERATURA DIA " + (j + 1) + ": ");
                temperaturas[i][j] = captu.nextInt();
            }
        }

        System.out.println("");

        //CALCULAR PROMEDIO
        for(int i = 0; i < ciudades.length; i++){
            double suma = 0;

            for(int j = 0; j < temperaturas[i].length; j++){
                suma += temperaturas[i][j];
            }

            double promedio = suma / 7;

            System.out.println("CIUDAD: " + ciudades[i]);
            System.out.println("PROMEDIO: " + promedio);
            System.out.println("");
        }
    }
    
}
