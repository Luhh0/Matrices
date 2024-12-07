
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    //Matriz transpuesta
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero de filas de la matriz: ");
        int f = leer.nextInt();
        System.out.println("Ingrese numero de columnas");
        int c = leer.nextInt();
        if (f > 0 && c > 0) { 
            int[][] matriz = new int[f][c];
            llenarMatriz(matriz);
            imprimir(matriz);
            
            int[][] transpuesta = new int[c][f];
            
            //Recorre la matriz original para calcular la transpuesta
        for (int i = 0; i < f; i++) { //Recorre las filas de la matriz original
            for (int j = 0; j < c; j++) { //Recorre las columnas de la matriz original
            transpuesta[j][i] = matriz[i][j]; //Intercambia las filas y columnas para la transpuesta
            }
        }
            
            System.out.println("Su matriz transpuesta es: ");
            imprimir(transpuesta);
        }else{
            System.out.println("No existe tal dimension.");
        }
    }
   public static void llenarMatriz(int[][] matriz){
        int f = matriz.length;
        int c = matriz[0].length;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j]=(int)(Math.random()*100);
            }
        }
    
    }
    public static void imprimir(int[][] matriz){
        int f = matriz.length;
        int c = matriz[0].length;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    } 
}
