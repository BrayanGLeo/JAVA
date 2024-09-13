/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioClaseN1;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello da");
        System.out.println("Bye bye little b?");
        String nombre="Wacoldo"; //Escritura
        System.out.println("Hola "+nombre);
        int numero = 5; //Numero entero
        System.out.println("El numero es: "+numero);
        float numero2 = 5.1f; //Numero flotante
        System.out.println("El numero es: "+numero2);
        double db = 7.5; //Incluye int y float
        System.out.println("El numero es: "+db);
        char simbolo = '@'; // Cualquier tipo de caracter
        System.out.println("El simbolo indicado es: "+simbolo);
        boolean bool = true; //True o False
        System.out.println(bool);
        int x=10;
        int y=5;
        System.out.println("El resultado es "+(x+y));
        int resultado = x+y;
        
        if (resultado>10) {
            System.out.println("Es mayor que 10");
        }
        else if (resultado<10) {   
            System.out.println("Es menor que 10");
        }
        else {
            System.out.println("Es igual que 10");
        }
        
        String nombraso = "Luceris";
        
        switch (nombraso) { //Match de Java
            case "Wacoldo":
                System.out.println("Es Wacoldo");
                break;
            case "Diogenes":
                System.out.println("Es Diogenes");
                break;
            case "Luceris":
                System.out.println("Es Luceris");
                break;
                
            default:
                System.out.println("Es otro nombre");
        }
        
        System.out.println("Este es FOR");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        int z = 0;
        System.out.println("Este es While");
        while (z < 10) {      
            System.out.println(z);
            z++;
        }
        System.out.println("Esto es Do While");
        
        do {
            System.out.println(z);
            z++;
        } while (z<10);
    }    
} 

