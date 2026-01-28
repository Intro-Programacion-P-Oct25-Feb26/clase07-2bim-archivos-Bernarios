/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class DemoC2 {
    public static void leerRegistros01() {
        double sumaTotal = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                
                    String valorString = linea_partes.get(3); 
                    double valorNumerico = Double.parseDouble(valorString);

                    sumaTotal = sumaTotal + valorNumerico;
                    contador = contador + 1;
            } 
            entrada.close();
                double promedio = sumaTotal / contador;
                System.out.println("El promedio es: " + promedio);

        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
    }
}