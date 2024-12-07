
package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la dimension de la matriz: ");
        int d = leer.nextInt();
        if (d > 0) { 
            int[][] matriz = new int[d][d];
            llenarMatriz(d,matriz);
            imprimir(matriz);
           //Comprobar si la matriz es simetrica
        boolean simetrico = true; //Variable que almacena el estado de simetría, inicialmente asumida como verdadera

        for (int i = 0; i < d; i++) { //Recorre las filas de la matriz
            for (int j = 0; j < d; j++) { //Recorre las columnas de la matriz
                // Compara el elemento en la posición (i, j) con el elemento en la posición (j, i)
                if (matriz[i][j] != matriz[j][i]) {
                    simetrico = false; //Si los elementos no coinciden, la matriz no es simétrica
                    break; //Detiene el ciclo interno, ya que no es necesario seguir verificando
                }
            }
        }

        //Imprime el resultado de la verificación de simetría
        if (simetrico) {
            System.out.println("La matriz es simétrica."); //Mensaje si la matriz es simétrica
        } else {
            System.out.println("La matriz no es simétrica."); //Mensaje si la matriz no es simétrica
        }
                }else{
                    System.out.println("No existe tal dimension.");
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
