package ejercicios;
import java.util.*;


public class Bucles {

	public static void main(String[] args) {

		// NumerosHastaElcien();
		// NumerosHastaCienWhile();
		//Numero();
		//CRegresiva();
		//CRegresiva2();
		//CRegresiva3();
		//CajaFuerte();
		//Tablas();
		//CuantosDigitos();
		//Primo();
		//MediaDeNumeros();
		//Potencia();
		//Fibonacci();
		//Prueba();
		//NumerosPoN();
		//PotenciasYExponentes();
		EsPositivoONegativo();
		
		
		
		
	}
	


public static void NumerosHastaElcien() {

		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

//----------------------------------------------------------------------END---------------------------------------------------------------

public static void NumerosHastaCienWhile() {
		int i = 0;
		while (i <= 100) {
			i++;

			if (i % 5 == 0) {
				System.out.println(i);

			}
		}

	}
	

//----------------------------------------------------------------------END----------------------------------------------------------------

public static void Numero() {
	int i = 1;
	
	do {
		i++;
		
		if(i % 5 ==0) {
			System.out.println(i);
		}
		
	}while(i<=100);
	
	
	
}


//--------------------------------------------------------------------END------------------------------------------------------------------


public static void CRegresiva() {
	
	for(int i = 360; i >= 160; i-=20) {
		
		System.out.println(i);
	}
	
}


public static void CRegresiva2() {
	int i =360;
	
	while(i>=160) {
		
		System.out.println(i);
		i-=20;
	}
	
	
}


public static void CRegresiva3() {
	int i = 380;
	
	do {
		i-=20;
		System.out.println(i);
	}while(i>=160);
}


//---------------------------------------------------------------------END-----------------------------------------------------------------


public static void CajaFuerte() {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	boolean cierre=false;
	int contador=0;
	int intentos=4;
	int passter=3265;
	
	while(!cierre) {
		
		
	System.out.println("Ingrese la combinación de la caja fuerte en numeros\n");
	int pass=sc.nextInt();
		
		
	if(pass == passter) {
		System.out.println("Lo siento, esa no es la combinación");
		cierre=true;
		break;
		}
	
	if(pass != passter ) {
		contador++;
		if(contador < intentos) {
		System.out.println("La contraseña es incorrecta, le quedan "+ (intentos-contador) +" intentos\n");
		cierre=false;
		}else {System.out.println("Ya no le quedan intentos");}
	}
	
	if(contador==intentos) {
		cierre=true;
	}
	
	
	}
	sc.close();
	
}

//--------------------------------------------------------------------END------------------------------------------------------------------

public static void Tablas() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el numero que quiere que se multiplique");
	double n = sc.nextDouble();
	
	for(double i = 1 ; i <= 10 ; i++ ) {
		double res= n * i;
		System.out.printf("%.0f * "+"%.0f = " +"%.0f \n", n, i, res);
	}
	
	sc.close();
}

//--------------------------------------------------------------------END------------------------------------------------------------------

public static void CuantosDigitos() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("ingrese un numero al que quiera contarle sus digitos");
	long l = sc.nextLong();
	String aLetras =""+l;
	long res=0;
	
	for(int contador=1; contador <= aLetras.length(); contador++) {
		res++;
	}
	
	System.out.println("El numero tiene " + res + " digitos");
	sc.close();
}

//--------------------------------------------------------------------END------------------------------------------------------------------

public static void Primo() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el numero a analizar");
	int n1 = sc.nextInt();
	
	
	for(int i = 2; i <= 10; i++) {
		
		if (n1 % i == 0) {
			System.out.println(i);
		}
	}
	sc.close();
}
	
//------------------------------------------------------------------END--------------------------------------------------------------------	
	
public static void MediaDeNumeros() {
	Scanner sc = new Scanner (System.in);
	boolean cierre=false;
	
	
	while(!cierre) {
	
	
	
	int cantidadDeNumeros = 0;
	int sumaDeNumeros = 0;
	int num;
	
	System.out.println("Ingrese los numeros a sacar la media");
	do {
			
	num = sc.nextInt();
	if (num>=0) {
		sumaDeNumeros +=num;
		cantidadDeNumeros++;
	}
		
	}while(num>=0);
	
	if(cantidadDeNumeros>0) {
		double media = (double)sumaDeNumeros /cantidadDeNumeros ;
		System.out.print("La media de todos los numeros es: " + media + "\n");
		break;
	}
}
	sc.close();

}

//------------------------------------------------------------------END--------------------------------------------------------------------

public static void Potencia() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Este programa  muestra en tres columnas,"
	 		+ " el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.\n");
	 
	 System.out.println("Ingrese el numero");
	 int num=sc.nextInt();
	 
	 System.out.printf("|%5s|"+" %5s |" + "%5s|\n ", "numero","Cuadrado", "Cubo" );
	 System.out.println("-----------------------");
	 
	 for(int i = 0 ; i < 5 ; i++) {
		 
		 System.out.printf("|%5d |" + "%5d     |" + "%5d| \n" , num, num*num, num*num*num);
		 
		 num+=5;
		
		
		
	 }
	 
	 sc.close();
}

//------------------------------------------------------------------END---------------------------------------------------------------------


public static void Fibonacci() {
	
	int cero=0;
	int uno=1;
	int contador=0;

do {
	if (uno>cero) {
		System.out.printf("%3d "+"%3d ", cero,uno);
		cero = uno + cero;
		uno = uno + cero;	
		
	}
	
	contador++;
	
	
}while(contador<7);
}


//-----------------------------------------------------------------END----------------------------------------------------------------------

public static void Prueba() {
	int a = 10;
			if(a>10 & a++ <10) {
				a++;
			}
			System.out.println(a);
}

//----------------------------------------------------------------END-----------------------------------------------------------------------


public static void NumerosPoN() {
	
	int nArray[]= {10,-20,15,-8,-18,13,-13};
	int positivos = 0;
	int negativos = 0;
	
	
	
	for(int i =0 ; i<nArray.length;i++){
		
		
		if(nArray[i] < 0) {
			negativos++;
		}
		
		if(nArray[i]>0) {
			positivos++;
		
		}
			
	}
	
	System.out.println("Los numeros positivos son: " + positivos);
	System.out.println("Los numeros negativos son: " + negativos);

}

//-------------------------------------------------------------END--------------------------------------------------------------------------

public static void  PotenciasYExponentes() {
	Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Ingresa la base: ");
	int base=sc.nextInt();
	int base1=base;
	
	System.out.println("Ingresa el Exponente: ");
	int exponente = sc.nextInt();
	int resultado=0;
	int i=0;
	
	
	while(exponente!=i) {
		
		resultado=base1;
		i++;
		System.out.println(base +" con exponente  "+ i +" = "+ resultado);
		
		base1 = base1 * base;
		resultado = base1;
		//resultado=base1*=base;
		
		
	}
	
	sc.close();
}

//--------------------------------------------------------------END-------------------------------------------------------------------------

public static void EsPositivoONegativo() {

	Scanner sc=new Scanner(System.in);



	boolean cerrar=false;
	int i =0;


	while(!cerrar) {



		if(i==0) {
			System.out.println("ingresa el número");

			int numero=sc.nextInt();
			if(numero<0) {
				System.out.print("El número es negativo, ");
				cerrar=false;
			}
			if(numero>0 ) {

				numero+=100;
				System.out.println("el numero es: " + numero);
				cerrar=true;
				break;
			}


		}




		if(i>0) {
			System.out.println("ingresa el número nuevamente:");
			int numero = sc.nextInt();
			if(numero<0) {
				System.out.print("El número es negativo, ");
				cerrar=false;
			}
			if(numero>0 ) {

				numero+=100;
				System.out.println("el numero es: " + numero);
				cerrar=true;
				break;
			}

		}
		i++;

	}

	sc.close();

}










































































































}