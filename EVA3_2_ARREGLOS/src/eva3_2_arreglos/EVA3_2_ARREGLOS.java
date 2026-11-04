/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] arreglo, x, y; Cuantos Arreglos hay? 3
        //int arreglo[], x, y; Cuantos Arreglos hay? 1
        int arreglo[], x, y;//Solo arreglo es un arreglo
        //int[] arreglo, x, y; Todos son Arreglos
        
        arreglo = new int[10];//Arreglo con 10 enteros
        
        //arreglo[10] = 100; el indice es incorrecto, 10 no es una posicion valida (llega hasta el 9)
        
        //EL USO DE AAREGLOS VA LIGADO AL USO DE CLICLOS.
        //EN PARTICULAR EL CICLOR FOR
        for(int i = 0; i < 10; i++ ){
            arreglo[i] = (int)(Math.random() * 100);//CASTING --> COMPATIBLE
        }
        
        for(int i = 0; i < 10; i++ ){
            System.out.print(arreglo [i] + " - ");
        }
    }
    
}
