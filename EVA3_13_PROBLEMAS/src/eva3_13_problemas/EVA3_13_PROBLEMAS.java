/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problemas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMAS {

/**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Llenar un arreglo de 10 elementos con valores aleatorios (entre 0 y 9).
        Solicitar un valor al usuario y mostrarle cuantas veces el valor se repite
        dentro del arreglo.
        */
        
        Scanner captu = new Scanner(System.in);

        int[] valores = new int[10];
        for(int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random()*10); //LOS NUMEROS VAN DE 0 A 9
        }

        for(int i = 0; i < valores.length; i++){
            System.out.print("[" + valores[i] + "]");
        }
        System.out.println("");

        do{
            int contador = 0;

            //PEDIR EL VALOR
            System.out.print("INTRODUCCE UN VALOR: ");
            int valorencontrado = captu.nextInt();

            for(int i = 0; i < valores.length; i++){
                if(valorencontrado == valores[i]){
                    contador++;
                }
            }

            if(contador > 1){
                System.out.println("EL VALOR SE REPITE: " + contador);
                break;
            }else{
                System.out.println("EL VALOR QUE QUIERES NO SE REPITE");
            }

        }while(true);
    }
}