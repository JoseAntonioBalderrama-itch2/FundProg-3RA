/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_6_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String nombres[];
        int edad[];
        int cant;
        
        System.out.println("Cantidad de cientes a capturar");
        cant = captu.nextInt();
        nombres = new String[cant];
        edad = new int[cant];
        captu.nextLine();
        for (int i = 0; i < nombres.length; i++){
        System.out.println("Introduce el nombre del cliente: ");
        nombres[i] = captu.nextLine();
        System.out.println("Dame la edad del cliente: ");
        edad[i] = captu.nextInt();
        captu.nextLine();
        
        }
        System.out.println("Datos capturados:");
        for (int i = 0; i < nombres.length; i++){
        System.out.println(nombres [i] + ", edad: " + edad [i]);
        }
    }
    
}
