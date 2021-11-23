import java.io.*;
import java.util.Scanner;

public class Ejercicio3{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Primera dimension de su matriz: ");
		int matriz1 = sc.nextInt();
		System.out.println("Segunda dimension de su matriz: ");
		int matriz2 = sc.nextInt();
		int[][] m = new int[matriz1][matriz2];
		int[][] m2= rellenaArray(m);
		try{
			FileWriter fl= new FileWriter("./Ejercicio3Arreglo.text",true);
			PrintWriter pw = new PrintWriter(fl);
			for(int fila=0; fila<m2.length; fila++){
				for (int col=0;col<m2[fila].length;col++){
					int re = m2[fila][col];
						pw.print(re+" ");
				}
				pw.print("\n");
			}
			pw.close();
		}catch(Exception ex){
			System.out.println("Error"+ ex.getMessage());
		}
	}

	public static int[][] rellenaArray(int[][] m1){
		for (int i=0; i<m1.length; i++){
			for (int j=0; j<m1[i].length; j++){
				int a = (int)(Math.random()*10+1);
				m1[i][j]=a;	
			}
		}
		return m1;
	}
}

