/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author Usuario
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Imprimir el menu de un restaurante. 10 productos, cada uno con su precio (decimal)
        String[] productos = {"Tacos", "Tortas", "Tamales", "Tlacoyos", "Tlayudas", 
            "Pizza", "Hamburguesa", "Hot Dog", "Enchiladas", "Quesadillas"}; 
        
        double[] precios = {25.50, 35.00, 18.75, 22.50, 60.00, 120.00, 85.50, 40.00, 55.25, 30.50};

        System.out.println("===== MENÚ DEL RESTAURANTE =====");

            for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
        }
    }
}
    
