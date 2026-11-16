/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problemas_3;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMAS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea una matriz de 5 x 5, llenarla con valores aleatorios.
        Imprimirla de manera normal y luego en orden inverso.
        
        [3][5]     [9][7]
        [7][9] --> [5][3]
        */
        
        int[][] matriz = new int[5][5];

        //LLENAR LA MATRIZ
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random()*10);
            }
        }

        //IMPRIMIR NORMAL
        System.out.println("MATRIZ NORMAL");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        //IMPRIMIR INVERSA
        System.out.println("MATRIZ INVERSA");
        for(int i = matriz.length - 1; i >= 0; i--){
            for(int j = matriz[i].length - 1; j >= 0; j--){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}