/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problemas_2;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMAS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Llenar un arreglo de 10 elementos con valores aleatorios.
        //Imprimir el mas pequeño y el mas grande.
        
        int[] valores = new int[10];

        for(int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random()*100); //NUMEROS DE 0 A 99
        }

        for(int i = 0; i < valores.length; i++){
            System.out.print("[" + valores[i] + "]");
        }

        System.out.println("");

        int menor = valores[0];
        int mayor = valores[0];

        for(int i = 1; i < valores.length; i++){
            if(valores[i] < menor){
                menor = valores[i];
            }

            if(valores[i] > mayor){
                mayor = valores[i];
            }
        }

        System.out.println("EL VALOR MAS PEQUENO ES: " + menor);
        System.out.println("EL VALOR MAS GRANDE ES: " + mayor);
    }

}
