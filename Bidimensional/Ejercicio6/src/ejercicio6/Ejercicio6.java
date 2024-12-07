
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Leer dimensiones de la matriz
        System.out.println("Ingrese número de filas de la matriz: ");
        int f = leer.nextInt();
        System.out.println("Ingrese número de columnas de la matriz: ");
        int c = leer.nextInt();

        if (f > 0 && c > 0) {

            int[][] matriz = new int[f][c];
            llenarMatriz(matriz);

            imprimir(matriz);

            System.out.println("Elementos recorridos en espiral:");
            recorrerEspiral(matriz);
        } else {
            System.out.println("No existe tal dimensión.");
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        int f = matriz.length;
        int c = matriz[0].length;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        int f = matriz.length;
        int c = matriz[0].length;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void recorrerEspiral(int[][] matriz) {

        int fInicio = 0, fFin = matriz.length - 1; //Inicializa límite superior e inferior de las filas.
        int cInicio = 0, cFin = matriz[0].length - 1; //Inicializa límite izquierdo y derecho de las columnas.

        
        while (fInicio <= fFin && cInicio <= cFin) { //Recorre la matriz mientras los límites no se crucen.
   
            for (int i = cInicio; i <= cFin; i++) { //Recorre la fila superior de izquierda a derecha.
                System.out.print(matriz[fInicio][i] + " "); //Imprime cada elemento de la fila superior.
            }
            fInicio++; //Actualiza el límite superior de las filas, excluyendo la fila ya recorrida.
     
            for (int i = fInicio; i <= fFin; i++) {//Recorre la columna derecha de arriba hacia abajo
                System.out.print(matriz[i][cFin] + " "); //Imprime cada elemento de la columna derecha.
            }
            cFin--; //Actualiza el límite derecho de las columnas, excluyendo la columna ya recorrida.

            
            if (fInicio <= fFin) {//Verifica si quedan filas por recorrer
                // Recorre la fila inferior de derecha a izquierda.
                for (int i = cFin; i >= cInicio; i--) {
                    System.out.print(matriz[fFin][i] + " "); //Imprime cada elemento de la fila inferior.
                }
                fFin--; //Actualiza el límite inferior de las filas, excluyendo la fila ya recorrida...
            }
  
            if (cInicio <= cFin) {//Verifica si quedan columnas por recorrer
                //Recorre la columna izquierda de abajo hacia arriba
                for (int i = fFin; i >= fInicio; i--) {
                    System.out.print(matriz[i][cInicio] + " "); //Imprime cada elemento de la columna izquierda
                }
                cInicio++; //Actualiza el límite izquierdo de las columnas, excluyendo la columna ya recorrida
            }
        }
    
    System.out.println();
}


    
    
}
