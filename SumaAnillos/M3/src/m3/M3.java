
package m3;

import java.util.Random;
import java.util.Scanner;

public class M3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz cuadrada: ");
        int d = leer.nextInt();
        int[][] matriz= new int[d][d];
        
        llenarMatriz(matriz,d);
        
        System.out.println("Ingrese el numero del anillo k que quiere sumar(de afuera a dentro, desde 1):");
        int k = leer.nextInt();
        if (k < 1 || k > (d +1 / 2)) { 
            System.out.println("No existe el anillo en la dimensión de la matriz.");
        } else {
            int suma = sumarAnillo(matriz, d, k);
            System.out.println("La suma del anillo " + k  +" es: " + suma);
        }
    }

    public static int sumarAnillo(int[][] matriz, int d, int k) {
        int suma = 0;
        int ki = k-1;
        for (int j = ki; j < d - ki; j++){//fila superior e inferior
            suma+=matriz[ki][j];
            if (ki != d - ki - 1) { 
                suma+= matriz[d- ki- 1][j]; //fila inferior del anillo
            }
        }
        
        for (int i = ki + 1; i <d -ki - 1; i++){//columna izquierda y derecha del anillo elegido
            suma+=matriz[i][ki];// columna permanece constante
            suma+=matriz[i][d-ki -1];
        }
        
        return suma;
    }

    public static void llenarMatriz(int[][] matriz, int dimension) {
        Random random = new Random();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }
}
