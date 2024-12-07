
package ejercicio3;
//PERIMETRO DE LA MATRIZ
import java.util.Scanner;
public class Ejercicio3 {

   
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

            int suma = 0;

            // Sumar elementos de la primera y última fila
            for (int j = 0; j < c; j++) {
                suma += matriz[0][j]; //primera fila
                if (f > 1) { //Si hay más de una fila
                    suma += matriz[f - 1][j];
                }
            }

            //suma elementos de la primera y última columna sin repetir esquinas
            for (int i = 1; i < f - 1; i++) {
                suma += matriz[i][0]; //primera
                suma += matriz[i][c - 1]; //última
            }
      
            System.out.println("La suma de elementos en el borde de la matriz es " + suma);
        }else{
            System.out.println("No existe tal dimension.");
        }
        /*
        System.out.println("Ingrese la dimension de la matriz: ");
        int d = leer.nextInt();
        if (d > 0) { 
            int[][] matriz = new int[d][d];
            llenarMatriz(matriz);
            imprimir(matriz);

            int suma = 0;

            // Sumar elementos de la primera y última fila
            for (int j = 0; i < d; j++) {
                suma += matriz[0][i]; //primera fila
                if (d > 1) { //Si hay más de una fila
                    suma += matriz[d - 1][i];
                }
            }

            //suma elementos de la primera y última columna sin repetir esquinas
            for (int i = 1; i < d - 1; i++) {
                suma += matriz[i][0]; //primera
                suma += matriz[i][d - 1]; //última
            }
      
            System.out.println("La suma de elementos en el borde de la matriz es " + suma);
            
        }else{
            System.out.println("No existe tal dimension.");
        }
*/
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
