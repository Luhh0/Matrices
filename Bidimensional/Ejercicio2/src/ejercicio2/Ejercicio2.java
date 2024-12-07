
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz cuadrada: ");
        int d = leer.nextInt(); // Lee la dimensión ingresada por el usuario

        //Verifica si la dimensión ingresada es positiva
        if (d > 0) {
            // Inicializa una matriz cuadrada de tamaño d x d
            int[][] matriz = new int[d][d];

            //Llama al método que llena la matriz con valores aleatorios
            llenarMatriz(d, matriz);

            //Llama al método que imprime la matriz original
            imprimir(matriz);

            int[][] matriz90 = new int[d][d];

            //Realiza la rotación 90° de la matriz original
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < d; j++) {
                    matriz90[j][d - 1 - i] = matriz[i][j]; //Ajusta los índices para la rotación
                }
            }


            System.out.println("Matriz rotada 90°:");
            imprimir(matriz90); // Llama al método que imprime la matriz rotada 90°

        } else {
            
            System.out.println("No existe tal dimensión"); // Muestra un mensaje si la dimensión ingresada no es válida
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
