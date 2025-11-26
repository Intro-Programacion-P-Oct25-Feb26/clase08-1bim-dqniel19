/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo011MAIN {

    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        String cad = "";
        do {
            suma = suma + contador;
            cad = String.format("%s%d\n", cad, contador);
            contador = contador + 1;
            
        } while (contador <= 10);
        cad = String.format("%s\nLa suma es %d\n", cad, suma);
        System.out.printf("%s\n", cad);
    }

}
