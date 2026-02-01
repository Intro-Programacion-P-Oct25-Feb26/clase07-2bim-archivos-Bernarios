/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;
import java.util.Scanner;
/**
 *
 * @author danielrios
 */
public class Principal {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        int x;
        boolean sal = true;
        while (sal) {
            String cadenaFinal = "";
            System.out.println("Ingrese nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la placa de vehiculo");
            String placa = entrada.nextLine();
            System.out.println("Ingrese la marca de carro");
            String marca = entrada.nextLine();
            System.out.println("ingrese ( 0 ) si terminó de añadir datos");
            x = entrada.nextInt();
            entrada.nextLine();
            if (x != 0) {
            } else {
                sal = false;
            }
            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    nombre,
                    placa, marca);
            Archivo.agregarRegistros(cadenaFinal, placa);
        }
    }  
}
