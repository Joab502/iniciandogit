import java.io.*;
import java.util.Scanner;

public class Ejercicio1{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int[] r = rellenar();
		mostrar(r);
	}

	public static int[] rellenar(){
		int[] m1= new int [10];

		for (int i=0; i<m1.length; i++){
			System.out.println("Ingrese el numero "+(i+1));
			int a = sc.nextInt();
			m1[i]=a;
		}
		return m1;

	}

	public static void mostrar(int[] matriz){
		try{
			FileWriter fl= new FileWriter("./Ejercicio1Indice.text",true);
			PrintWriter pw = new PrintWriter(fl);
			for(int fila=0; fila<matriz.length; fila++){
				pw.print("Linea "+fila+" valor "+matriz[fila]+"\n");
			}
			pw.close();
		}catch(Exception ex){
			System.out.println("Error"+ ex.getMessage());
		}
	}
}


