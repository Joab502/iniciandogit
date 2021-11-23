import java.io.File;
import java.util.Scanner;
public class Ejercicio5{

	public static void main(String[] args) {
		try{

			Scanner input = new Scanner(new File("prueba.txt"));

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}