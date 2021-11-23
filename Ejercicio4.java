import java.util.*;
public class Ejercicio4{
	public static void main(String[] args) {
		int i;
		int j;
		int matriz1[][] = new int [4][4];

		Scanner dato = new Scanner (System.in);
		System.out.println("Escribir datos de la matriz");

		for (i=0; i<=3; i++) {
			for (j=0; j<=3; j++) {
				System.out.println("Escrbir valor " + i + "," + j + ":");
				matriz1[i][j] = dato.nextInt();
			}
		}
		System.out.println("La matriz 4*4 queda asi");
		for (i=0; i<=3; i++) {
			for (j=0; j<=3; j++) {
				System.out.println(matriz1[i][j] + "");
			}
			System.out.println("");
		}
	}



}