package ejercicios;
import java.util.Scanner;

public class Casting2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double iva=21;
		double precio;
		
		System.out.println("Ingrese lo que quiera comprar para calcular el precio final con IVA");
		precio = teclado.nextDouble();
		
		double totalIva = (precio * iva) /100;
		
		System.out.println("El total de impuesto IVA es: $" + totalIva);
		System.out.println("El precio total es: $" + (precio + totalIva));
		
		teclado.close();
	}

}
