
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para definir el tamaño de la matriz cuadrada: ");
        int d = leer.nextInt(); // Se lee el tamaño de la matriz cuadrada ingresado por el usuario

        //Verifica si el tamaño ingresado es un valor positivo
        if (d > 0) {
            //Si el tamaño es válido, se define y se inicializa una matriz cuadrada de tamaño d x d
            int[][] matriz = new int[d][d];

            //Se llena la matriz con valores aleatorios
            llenarMatriz(d, matriz);

            imprimir(matriz);

            //Calcula la suma de los elementos de la diagonal principal
            int principal = 0;
            for (int i = 0; i < d; i++) {
                principal += matriz[i][i]; // Elementos donde fila == columna
            }

            //Calcula la suma de los elementos de la diagonal secundaria
            int secundaria = 0;
            for (int i = 0; i < d; i++) {
                secundaria += matriz[i][d - 1 - i]; // Elementos donde columna == tamaño - 1 - fila
            }

            // Se muestran las sumas calculadas de ambas diagonales
            System.out.println("La suma de la diagonal principal es " + principal);
            System.out.println("La suma de la diagonal secundaria es " + secundaria);
        } else {
            // Si el tamaño no es válido, se muestra el siguiente mensaje
            System.out.println("No existe tal dimensión.");
        }
    }
    public static void llenarMatriz(int d, int[][] matriz){
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matriz[i][j]=(int)(Math.random()*100);
            }
        }
    
    }
    public static void imprimir(int[][] matriz){
        int d=matriz.length;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
