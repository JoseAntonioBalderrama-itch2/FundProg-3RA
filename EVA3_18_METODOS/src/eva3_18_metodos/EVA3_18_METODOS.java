/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //LLAMAR O INVOCAR EL METODO
      mostrarMensaje("hola Mundo!!!");
      mostrarMensaje("Jose Balderrama");
      mostrarMensaje("Fundamentos de programacion");
      mostrarMensaje("SISTEMAS COMPUTACIONALES");
      
      //QUE HACER CON METODOS QUE REGRESAN VALORES
      //1. RECUPERAR EL VALOR PARA USARLO DESPIES
      int resultado = sumar(10, 20);
      System.out.println("Suma de 10 + 20 = " + resultado);
      //2. USARLO DIRECTAMENTE
      System.out.println("Suma de 10 + 20 = " + sumar(10, 20));
      //3. NO IMPORTA EL VALOR DE RETORNO
     sumar(10,20);
     
   }
   
   //modificadores, valor de retorno
                       //DEBE SER UN VERBO INFINITIVO
                       //VARIAS PALABRAS: iniciar en minusculas, demas iniciar en mayusculas
   public static void mostrarMensaje(String mensaje)//CABECERA
   {//CUERPO DEL METODO O IMPLEMENTACION
       System.out.println(mensaje);
   } 
   
   public static int sumar(int val1, int val2){
      int resu = val1 + val2;
      return resu;
   }
   
}
