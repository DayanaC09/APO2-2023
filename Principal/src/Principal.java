import java.util.Scanner;

//nombre de la clase
public class Principal {

	// metodo de la clase
	public static void main(String[] args) {
		
	System.out.println(contarPalabras());

	}

	public static String contarPalabras() {

		System.out.println("Ingrese la palabra");

		// clase que permite capturar datos por consola
		Scanner sc = new Scanner(System.in);

		String prueba = sc.next();
		
		return "La cantidad de letras que tiene la palabra es :" + prueba.toUpperCase();
	}
}
