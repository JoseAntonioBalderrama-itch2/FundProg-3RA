/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_22_AREAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
        String[] menu = {"circulo", "rectangulo", "triangulo", "salir"};
        int opcion;

        do {
            System.out.println("****Menu de formulas****");
            imprimir(menu);
            opcion = capturarEntero("Selecciona una opcion:");

            switch (opcion) {
               
                case 1:
                    double radio = capturarDouble("Ingresa el radio del circulo:");
                    double areaCirculo = calcularAreaCirculo(radio);
                    System.out.println("El area del circulo es: " + areaCirculo);
                    break;

                case 2:
                    double baseRect = capturarDouble("Ingresa la base del rectangulo:");
                    double alturaRect = capturarDouble("Ingresa la altura del rectangulo:");
                    double areaRectangulo = calcularAreaRectangulo(baseRect, alturaRect);
                    System.out.println("El area del rectangulo es: " + areaRectangulo  );
                    break;

                case 3:
                    double baseTri = capturarDouble("Ingresa la base del triangulo:");
                    double alturaTri = capturarDouble("Ingresa la altura del triangulo:");
                    double areaTriangulo = calcularAreaTriangulo(baseTri, alturaTri);
                    System.out.println("El area del triangulo es: " + areaTriangulo);
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                
            }

        } while (opcion != 4);
    }

    public static void imprimir(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". " + arreglo[i]);
        }
        System.out.println("");
    }

    public static int capturarEntero(String mensaje) {
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = captu.nextInt();
        return valor;
    }

    public static double capturarDouble(String mensaje) {
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        return captu.nextDouble();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

        
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base*altura) / 2;
    }
}
