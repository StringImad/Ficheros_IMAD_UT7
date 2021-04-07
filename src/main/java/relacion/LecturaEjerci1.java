/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class LecturaEjerci1 {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "matriz.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int suma = 0;
        int aux = 0;
        String cad = "";
        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String

                linea = datosFichero.nextLine();
//                                        suma += Integer.parseInt(linea);

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
                for (String string : tokens) {
                    aux = 0;
                    System.out.print(string + "\t");
                    //si en vez de un numero es un espacio suma un 0 sino suma el numero que aparece
                    if (String.valueOf(string.charAt(aux)).equals(" ")) {
                        suma += Integer.parseInt(cad);
                        cad = "0";
//                        aux++;
                    } else {
                        cad += string.substring(aux, 3);
//                        suma += Integer.parseInt(cad);
                    }

                }
                System.out.println();
//                aux++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        suma += Integer.parseInt(cad);

        System.out.println("La suma de todos los numeros es : " + suma);

    }
}
