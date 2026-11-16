/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problemas_4;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMAS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Capturar la asistencia diaria de 3 estudiantes durante una semana
        (lunes a viernes). La asistencia se indica con un 1 (uno), las
        inasistencia con 0 (cero). Para cada estudiante indicar la cantidad
        de asistencia e inasistencias.
        */
        
        int[][] asistencia = new int[3][5];

        //LLENAR LA MATRIZ
        for(int i = 0; i < asistencia.length; i++){
            for(int j = 0; j < asistencia[i].length; j++){
                asistencia[i][j] = (int)(Math.random()*2); //0 O 1
            }
        }

        //MOSTRAR ASISTENCIA
        System.out.println("ASISTENCIA SEMANAL");
        for(int i = 0; i < asistencia.length; i++){
            System.out.print("ESTUDIANTE " + (i + 1) + ": ");
            
            for(int j = 0; j < asistencia[i].length; j++){
                System.out.print("[" + asistencia[i][j] + "]");
            }
            System.out.println("");
        }

        //CONTAR ASISTENCIAS E INASISTENCIAS
        for(int i = 0; i < asistencia.length; i++){
            int asistencias = 0;
            int inasistencias = 0;

            for(int j = 0; j < asistencia[i].length; j++){
                if(asistencia[i][j] == 1){
                    asistencias++;
                }else{
                    inasistencias++;
                }
            }

            System.out.println("ESTUDIANTE " + (i + 1));
            System.out.println("ASISTENCIAS: " + asistencias);
            System.out.println("INASISTENCIAS: " + inasistencias);
        }
    }
    
}
