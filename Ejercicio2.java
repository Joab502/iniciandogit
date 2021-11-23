import java.io.*;
import java.util.Scanner;

public class Ejercicio2{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Ingresar una frase: ");
		String a = sc.nextLine();
		char[] b = a.toCharArray();

		for (int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}

	}
}