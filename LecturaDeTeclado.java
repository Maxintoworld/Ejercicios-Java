package ejercicios;


import java.util.Scanner;



public class LecturaDeTeclado {

//------------------------------------------------Main---------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		//CalcSimple();
		//Conversor();
		//Multip();
		//CalcAreas();
		//CalcFact();
		//Salario();
		//volumenCono();
		//ConversorMbAKb();
		NotaExamen();
		
	}

//---------------------------------------------------END-------------------------------------------------------------------------------	

//--------------------------------------------Multiplication---------------------------------------------------------------------------
	public static void Multip() {
Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Ingrese los dos numeros que desea multiplicar separados con un espacio: ");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int resultado= n1*n2;
		
		System.out.printf("Su resultado es: %d X %d = %d" ,n1,n2,resultado);
		teclado.close();
		
	}
//------------------------------------------------END---------------------------------------------------------------------------------	

	
//-----------------------------------------------------ConversorA----------------------------------------------------------------------	
	public static void Conversor() {
		double dolares;
		double pesoArg;
		double resul;
		int opcion;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("que desea convertir? \n 1.Dolares \n 2.Pesos Argentinos");
		opcion=entrada.nextInt();
		
		switch(opcion){
		
		case 1:
			System.out.println("Ingrese la cantidad de Dolares que desea convertir: ");
			pesoArg=354;
			dolares=entrada.nextDouble();
			resul = dolares * pesoArg;
			
			System.out.print(dolares + " Dolares equivalen a " + resul +" pesos Argentinos" );
			
		break;
		
		case 2:
			System.out.print("Ingrese la cantidad de Pesos que desea convertir");
			dolares=354;
			pesoArg=entrada.nextDouble();
			resul =  dolares / pesoArg ;
			
			System.out.print(pesoArg +" Pesos Argentinos equivalen a " + resul + " Dolares" );
			break;
		}
		entrada.close();
		
	}
	
//----------------------------------------------------------END------------------------------------------------------------------------	


//----------------------------------------------------------CalcuSimple----------------------------------------------------------------	
	public static void CalcSimple() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese los dos numeros que desea utilizar en las operaciones");
		int n1= teclado.nextInt();
		int n2= teclado.nextInt() ;
		
		int suma = n1+n2;
		int resta = n1-n2;
		int multi = n1*n2;
		double divi = (double)n1 / (double)n2;
		
		
		
		System.out.printf("la suma  es : "+ n1 +" + " + n2+"= "+ suma + "\n");
		System.out.printf("la resta es : " +n1+" - "+n2+"= "+ resta + "\n");
		System.out.printf("la multipicacion es: "+n1+" X "+n2 +"= "+ multi +"\n");
		System.out.printf("la division es: "+n1+" / "+n2+"= "+divi+"\n");
		
		teclado.close();
		
	}
	
//-------------------------------------------------------END--------------------------------------------------------------------------	
	
	
//------------------------------------------------CalcAreas---------------------------------------------------------------------------
	
	public static void CalcAreas() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("que desea calcular:");
		System.out.println("1. el area de un rectangulo");
		System.out.println("2. el area de un triangulo");
		int num=teclado.nextInt();
		double base;
		double altura;
		
		switch(num) {
		case 1: System.out.println("ingrese la base del rectangulo:");
				base=teclado.nextDouble();
				System.out.println("ingrese la altura de rectangulo:");
				altura=teclado.nextDouble();
				double res = base * altura;
				
				System.out.println("El area de su rectangulo es de: " + res);
			break;
			
		case 2: System.out.println("Ingrese la base del Triangulo");
				base=teclado.nextDouble();
				System.out.println("Ingrese la altura del Triangulo");
				altura=teclado.nextDouble();
				double res2 = (base* altura) /2 ;
				
				System.out.println("El area de su triangulo es de: " + res2);
				break;
				
		default: System.out.print("Su seleccion no es valida"+ "\n"+ "Intentelo nuevamente");
				break;
		
		}
		teclado.close();
		
		
	}

//---------------------------------------------------END------------------------------------------------------------------------------

	
//---------------------------------------------------CalcFact-------------------------------------------------------------------------	
	public static void CalcFact() {
	
		double precio;
		double iva=21;
		double totalIva;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("ingrese el valor de lo que desea comprar para calcular su precio con los impuestos ");
		precio=teclado.nextDouble();
		totalIva=(precio*iva)/100;
		
		System.out.println("el precio que intodujo es: $" + precio);
		System.out.println("El impuesto al valor agregado es: $" + totalIva);
		System.out.println("El total de compra con el IVA es de: $" + (precio+totalIva));
		
		teclado.close();
	}
//-----------------------------------------------------------END-----------------------------------------------------------------------
	
	
//-------------------------------------------------------CalcularSalario---------------------------------------------------------------	
public static void Salario() {
		double hrs;
		double precioHrs = 12;
		double diasTrab;
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa las horas que has trabajado");
		hrs = teclado.nextDouble();
		System.out.println("ingresa la cantidad de dias trabajados");
		diasTrab = teclado.nextInt();
		
		double monto = (hrs*diasTrab) * precioHrs;
		
		System.out.println("El monto que usted debe cobrar es de $"+ monto);
		
		teclado.close();
	}
	
//-----------------------------------------------------END-----------------------------------------------------------------------------	
	
public static void volumenCono () {
	
	double volumen;
	double radio;
	double altura;
	double pi=3.14159265;
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Ingresa el radio de la circunferencia base del cono: ");
	radio=teclado.nextDouble();
	System.out.println("Ingresa la altura del cono");
	altura=teclado.nextDouble();
	volumen= radio*radio*altura*pi/3 ;
	
	System.out.println("El volumen de su cono es de " + volumen);
	
	teclado.close();
	
}
//--------------------------------------------------------END--------------------------------------------------------------------------

//-------------------------------------------------------ConversorMbAKb----------------------------------------------------------------

public static void ConversorMbAKb() {
	
	Scanner teclado=new Scanner(System.in);
	int num;
	int mb;
	int kb;
	int res;
	
	System.out.println("Que desea convertir");
	System.out.println("1. Mb a Kb");
	System.out.println("2. Kb a Mb");
	num=teclado.nextInt();
	
	if (num==1) {
		System.out.println("ingrese la cantidad de Mbs que desee convertir a Kbs");
		mb=teclado.nextInt();
		kb= 1024;
		res= mb*kb ;
		
		System.out.println(mb +"Mbs equivalen a "+ res +"Kbs");
	}
	
	if(num==2) {
		System.out.println("Ingrese la cantidad de Kbs que desee convertir a Mbs");
		kb =teclado.nextInt();
		mb = 1024;
		res= mb/kb ;
		
		System.out.println(kb + "Kbs equivalen a " + res +"Mbs");
	}
	teclado.close();	
}
//-------------------------------------------------END---------------------------------------------------------------------------------


//--------------------------------------------------Examen-------------------------------------------------------------------------------

public static void NotaExamen() {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese la nota del primer examen");
	double nota1 = teclado.nextDouble();
	System.out.println("Que nota quieres sacar en el trimestre");
	double nota2 = teclado.nextDouble();
	
	
	double prom = ((nota2-(nota1*0.4))/0.6);
	
	
	
	System.out.println("Usted deberia sacar " +  prom +" en el proximo examen para conseguir " + nota2 + " en el trimeste");

	teclado.close();
}

}
