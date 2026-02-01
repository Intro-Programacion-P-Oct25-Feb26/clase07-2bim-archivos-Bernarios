/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            String cadenaFinal = "";
            System.out.println("Ingrese nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese correo electronico");
            String correo = entrada.nextLine();
            System.out.println("Ingrese cedula");
            String cedula = entrada.nextLine();

            cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                    nombre,
                    correo, cedula);
            Archivo.agregarRegistros(cadenaFinal, cedula);
        }
    }
}
