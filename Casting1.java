package ejercicios;
import java.util.Scanner;
public class Casting1 {

	public static void main(String[] args) {
		int x=144;
		int y=999;
		
		int suma = x + y;
		int resta = x - y;
		int multi = x * y;
		double division = y/x ;//(double )y / (double) x;
		
		
		
		System.out.println("la suma de la cuenta entre X e Y es: "+ suma);
		System.out.println("la resta de la cuenta entre X e Y es: "+ resta);
		System.out.println("la multiplicacion de la cuenta entre X e Y es: "+ multi);
		System.out.println("la division de la cuenta entre X e Y es: "+ division);
		
		System.out.println("\n \n");
		
		String nom="Maximiliano Nicolás Montero";
		System.out.println(nom);
		
		System.out.println("\n \n");
		String direccion="Emilio Francou 2440";
		int telefono=321321321;
		
		System.out.println("Nombre: " + nom);
		System.out.println("Direccion: " + direccion);
		System.out.println("Telefono: " + telefono);
		
		System.out.println("\n \n");
		System.out.println("\n \n");
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de dolares que desea comprar: ");
		double pesos=467.5;
		double dolares=teclado.nextDouble();
		double conv= pesos* dolares;
		teclado.close();
		
		System.out.println("Usted necesita $"+conv+ " pesos argentinos para comprar " + dolares+ " Dolares");
		
		
		
	}

}
