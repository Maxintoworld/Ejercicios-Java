package ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Condicionales {

	
	
	public static void main(String[] args) {
		//DiaMateria();
		//QueDiaEs();
		//Saludos();
		//Salario();
		//Ecuacion();
		//Caida();
		//Promedio();
		//EcuacionB();
		//Horoscopo();
		//HoraDia();
		//Questions();
		//OrdenDeTres();
		//EsPar();
		//Triangulos();
		TriangulosDos();
		
		
		
	}
//---------------------------------------------------1DiasYMaterias---------------------------------------------------------------------	
public static void DiaMateria() {
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Escribe el dia de la semana que desea consultar");
		
		String dia= teclado.next();
		
		switch(dia) {
		
		case "lunes": System.out.print("el dia lunes tienes matematicas a primera hora");
		break;
		
		case "martes": System.out.print("el dia martes tienes economia a primera hora");
		break;
		
		case "miercoles": System.out.print("el dia miercoles tienes ingles a primera hora");
		break;
		
		case "jueves": System.out.print("el dia jeves tienes tecnologia a primera hora");
		break;
		
		case "viernes": System.out.print("el dia viernes tienes lengua a primera hora");
		break;
		
		case "sabado": System.out.print("el dia sabado es fin de semana");
		break;
		
		case "domingo": System.out.print("el dia domingo es fin de semana");
		break;
		
		default: 
			System.out.println("debe ingresar el dia correctamente sin mayusculas ni espacios");
		
		}
		teclado.close();
	}
	
//------------------------------------------------------END----------------------------------------------------------------------------	

//-----------------------------------------------------2QueDiaEs------------------------------------------------------------------------	

public static void QueDiaEs() {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 7 para saber a que dia corresponde");
		int dia=teclado.nextInt();
		
		switch(dia) {
		
		case 1: System.out.println("El dia 1 corresponde a Domingo");
		break;
		
		case 2: System.out.println("El dia 2 corresponde a Lunes");
		break;
		
		case 3: System.out.println("El dia 3 corresponde a Martes");
		break;
		
		case 4: System.out.println("El dia 4 corresponde a Miercoles");
		break;
		
		case 5: System.out.println("El dia 5 corresponde a Jueves");
		break;
		
		case 6: System.out.println("El dia 6 corresponde a Viernes");
		break;
		
		case 7: System.out.println("El dia 7 corresponde a Sabado");
		break;
		
		default: System.out.println("El numero o caracter que ingreso no es el correcto");
		}
		teclado.close();
	}
	
//-------------------------------------------------------END---------------------------------------------------------------------------	
	
//---------------------------------------------------3SaludosHsDia----------------------------------------------------------------------	
	
public static void Saludos() {
		
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("Ingrese la hora en formato numeral de 24 hs");
		int hora=teclado.nextInt();
		
		
		
		if(hora>=6 && hora<=12) {
			System.out.println(" Buenos Dias");
		}
		if(hora>=12 && hora<=20) {
			System.out.println(" Buenas Tardes");
		}
		else {
			System.out.println(" Buenas Noches");
		}
		teclado.close();
	}
	
//-------------------------------------------------------END---------------------------------------------------------------------------	

//-----------------------------------------------------4SalarioS------------------------------------------------------------------------

public static void Salario() {
	Scanner teclado=new Scanner(System.in);
	
	
	System.out.println("Por favor ingrese las horas trabajadas en la semana:");
	int hs=teclado.nextInt();
	
	if (hs<=40) {
		int salario1=hs*12;
		System.out.println("Su salario es de $" +salario1);
	}
	if(hs>40) {
		int salario1= 40 * 12;
		int salario2 = hs - 40;
		int salario3 = salario2 * 16;
		int total = salario1 + salario3 ;
		System.out.println("Su salario es de $"+total);

	}
teclado.close();
}

//-------------------------------------------------------END---------------------------------------------------------------------------


//----------------------------------------------------5EcuacionS-----------------------------------------------------------------------

public static void Ecuacion(){
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
	
	System.out.println("\n");
	
	System.out.println("Por favor introduzca el valor de a:");
	int a =teclado.nextInt();
	
	System.out.println("Introduzca el valor de b:");
	int b=teclado.nextInt();
	
	double x= 0- (double)b / (double)a;
	
	
	if (a>b) {
	System.out.println("El resultado es: x = " + x );
	System.out.println("Comprobacion: " + a+" * "+ x + " + " + b +" = 0");
	}
	
	if (a<b) {
		System.out.println("La ecuacion no tiene solucion real");
	}
	teclado.close();
}

//-------------------------------------------------------END---------------------------------------------------------------------------

//------------------------------------------------------CalculoDecaida-----------------------------------------------------------------

public static void Caida() {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Este programa calcula el tiempo que tardará en caer un objeto desde una altura h. \n");
	
	System.out.println("Introduce la altura en metros desde la que desea calcular");
	double h = teclado.nextInt();
	double g = 9.81;
	double tiempo =Math.sqrt((2*h)/g);
	
	System.out.printf("El tiempo de caida es %.2f segundos", tiempo);
		
	teclado.close();
	
	
}

//-------------------------------------------------------END---------------------------------------------------------------------------


//-------------------------------------------------------PromedioNotas----------------------------------------------------------------------
public static void Promedio() {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese la nota del primer trimestre");
	float priTri =teclado.nextFloat();
	
	System.out.println("Ingrese la nota del segundo trimestre");
	float segTri =teclado.nextFloat();
	
	System.out.println("Ingrese la nota del tercer trimestre");
	float terTri =teclado.nextFloat();
	
	float promedio = (priTri + segTri + terTri) / 3;
	
	
	System.out.printf("El promedio de año es de: %.2f ", promedio);
	
	if(promedio<6) {
		System.out.println("Insuficiente");
	}
	if (promedio>6 && promedio<=7) {
		System.out.println("Suficiente");
	}
	if(promedio >7 && promedio <=8) {
		System.out.println("Bien");
	}
	
	if(promedio > 8 && promedio <= 9) {
		System.out.println("Notable");
		
	}
	if (promedio > 9 && promedio<=10) {
		System.out.println("Sobresaliente");
	}
	teclado.close();
	
}

//-------------------------------------------------------END---------------------------------------------------------------------------


//-------------------------------------------------------Ecuacion2doGrado--------------------------------------------------------------

//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +bx +c = 0).
 
public static void EcuacionB() {
	Scanner teclado = new Scanner (System.in);
	 
	double a;
	double b;
	double c;
	double x;
	
	System.out.println("Ingrese el valor de a");
	a = teclado.nextDouble();
	
	System.out.println("Ingrese el valor de b");
	b = teclado.nextDouble();
	
	System.out.println("Ingrese el valor de c");
	c = teclado.nextDouble(); 
	
	 double discriminante = b*b - 4*a*c;
     
     if (discriminante < 0) {
         System.out.println("La ecuación no tiene soluciones reales.");
     } else if (discriminante == 0) {
          x = -b / (2*a);
         System.out.println("La ecuación tiene una solución real: x = " + x);
     } else {
         double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
         double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
         System.out.println("La ecuación tiene dos soluciones reales:");
         System.out.println("x1 = " + x1);
         System.out.println("x2 = " + x2);
     }

teclado.close();
}

//------------------------------------------------------------END----------------------------------------------------------------------

//----------------------------------------------------------Horoscopo------------------------------------------------------------------
public static void Horoscopo() {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese el dia de su nacimiento");
	int dia = teclado.nextInt();
	
	System.out.println("Ingrese el mes de su nacimiento:");
	System.out.println("1.Enero");
	System.out.println("2.Febrero");
	System.out.println("3.Marzo");
	System.out.println("4.Abril");
	System.out.println("5.Mayo");
	System.out.println("6.Junio");
	System.out.println("7.Julio");
	System.out.println("8.Agosto");
	System.out.println("9.Septiembre");
	System.out.println("10.Octubre");
	System.out.println("11.Noviembre");
	System.out.println("12.Dicioembre");
	int mes= teclado.nextInt();
	
	
	
	switch (mes) {
//ENERO-----------------------------------------------------------	
	case 1: if(dia<=20) {
		System.out.println("Ustede es de Capricornio");
			}
			if (dia >20) {
		System.out.println("Usted es de Acuario");
			}
	break;
//FEBRERO-----------------------------------------------------------	
	
	case 2: if(dia<=19) {
		System.out.println("Ustede es de Acuario");
	}
			if (dia >=20) {
		System.out.println("Usted es de Piscis ");
	}
	break;
//MARZO----------------------------------------------------------	
	
	case 3: if(dia<=20) {
		System.out.println("Ustede es de Piscis");
	}
			if (dia >20) {
		System.out.println("Usted es de Aries");
	}
	break;
//ABRIL-----------------------------------------------------------	
	case 4: if(dia<=20) {
		System.out.println("Ustede es de Aries");
	}
			if (dia >20) {
		System.out.println("Usted es de Tauro");
	}
	break;
//MAYO-----------------------------------------------------------	
	case 5: if(dia<=20) {
		System.out.println("Ustede es de Tauro");
	}
			if (dia >20) {
		System.out.println("Usted es de Geminis");
	}
	break;
//JUNIO-----------------------------------------------------------	
	case 6: if(dia<=20) {
		System.out.println("Ustede es de Geminis");
	}
			if (dia >20) {
		System.out.println("Usted es de Cancer");
	}
	break;
//JULIO-----------------------------------------------------------	
	case 7: if(dia<=22) {
		System.out.println("Ustede es de Cancer");
	}
			if (dia >= 23) {
		System.out.println("Usted es de Leo");
	}
	break;
//AGOSTO-----------------------------------------------------------	
	case 8: if(dia <= 23) {
		System.out.println("Ustede es de Leo");
	}
			if (dia > 23) {
		System.out.println("Usted es de Virgo");
	}
	break;
//SEPTIEMBRE-------------------------------------------------------	
	case 9: if(dia<=22) {
		System.out.println("Ustede es de Virgo");
	}
			if (dia >22) {
		System.out.println("Usted es de Libra");
	}
	break;
//OCTUBRE----------------------------------------------------------	
	case 10:if(dia<=23) {
		System.out.println("Ustede es de Libra");
	}
			if (dia > 23) {
		System.out.println("Usted es de Escorpio");
	}
	break;
//NOVIEMBRE--------------------------------------------------------	
	case 11:if(dia<=22) {
		System.out.println("Ustede es de Escorpio");
	}
			if (dia > 22) {
		System.out.println("Usted es de Sagitario");
	}
	break;
//DICIEMBRE--------------------------------------------------------	
	case 12:if(dia<=21) {
		System.out.println("Ustede es de Sagitario");
	}
			if (dia >21) {
		System.out.println("Usted es de Capricornio");
	}
	break;
	
	}
teclado.close();
	
}

//-----------------------------------------------------------END-----------------------------------------------------------------------

//------------------------------------------------------------Horario del dia----------------------------------------------------------

public static void HoraDia() {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese la hora");
	int hora= teclado.nextInt();
	
	System.out.println("Ingrese los minutos");
	int min= teclado.nextInt();
	
	int horasFaltantes = 24 % hora;
	int minutosRestanter= (horasFaltantes*60) - min;
	int segundosRestantes= minutosRestanter*60;
	
	//System.out.println(horasFaltantes);
	//System.out.println(minutosRestanter);
	
	System.out.println("Faltan " + segundosRestantes + " Segundos para las 00:00");
	
	teclado.close();
	
}

//--------------------------------------------------------END--------------------------------------------------------------------------

//---------------------------------------------------------10QUESTIONS-----------------------------------------------------------------

public static void Questions() {
	Scanner teclado = new Scanner(System.in);
	
	int contador=0;
	
	System.out.println("1- ¿Qué es Java?");
	System.out.println("a) Un sistema operativo");
	System.out.println("b) Un lenguaje de programación");
	System.out.println("c) Un navegador web");
	char respuesta1 = teclado.next().charAt(0);
	if (respuesta1== 'b') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	
	System.out.println("2- ¿Qué es una excepción en Java?");
	System.out.println("a) Un evento inesperado que ocurre durante la ejecución de un programa y que interrumpe el flujo normal del programa.");
	System.out.println("b) Un error de sintaxis en el código de un programa.");
	System.out.println("c) Una función que se utiliza para imprimir mensajes de depuración en la consola.");
	char respuesta2 =teclado.next().charAt(0);
	if(respuesta2== 'a') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	System.out.println("3- ¿Qué es la colección en Java?");
	System.out.println("a) Un marco de trabajo que proporciona una estructura de datos de alto nivel y una interfaz para manipular datos almacenados en colecciones, como listas, conjuntos y mapas.");
	System.out.println("b) Un conjunto de herramientas para desarrollar aplicaciones web.");
	System.out.println("c) Un tipo de datos que se utiliza para almacenar información en tablas.");
	char respuesta3=teclado.next().charAt(0);
	if(respuesta3 =='a') {
		contador++;
		System.out.println("Respuesta correcta \n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
	
//--------------------------------------------------------------------------	
	System.out.println("4- ¿Qué es la JVM?");
	System.out.println("a) Un componente clave de la plataforma Java que se encarga de ejecutar el código Java en cualquier plataforma compatible.");
	System.out.println("b) Un editor de texto para programadores.");
	System.out.println("c) Un sistema operativo de código abierto.");
	char respuesta4=teclado.next().charAt(0);
	if (respuesta4 == 'a') {
		contador ++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	System.out.println("5- ¿Qué es un objeto en Java?");
	System.out.println("a) Una variable que contiene una referencia a un valor de un tipo de datos específico.");
	System.out.println("b) Un tipo de datos que contiene una colección de valores.");
	System.out.println("c) Una instancia de una clase que tiene atributos y métodos.");
	char respuesta5=teclado.next().charAt(0);
	if (respuesta5 == 'c') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	System.out.println("6- ¿Qué es la herencia en Java?");
	System.out.println("a) Un mecanismo mediante el cual una clase puede heredar propiedades y comportamientos de otra clase.");
	System.out.println("b) Una técnica para escribir código de manera más rápida.");
	System.out.println("c) Un conjunto de herramientas de análisis de datos.");
	char respuesta6=teclado.next().charAt(0);
	if (respuesta6 == 'a') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	System.out.println("7- ¿Qué es una interfaz en Java?");
	System.out.println("a) Una clase que se utiliza para definir un contrato que una clase debe cumplir.");
	System.out.println("b) Una estructura de datos para almacenar información.");
	System.out.println("c) Una herramienta para analizar el rendimiento de una aplicación.");
	char respuesta7=teclado.next().charAt(0);
	if(respuesta7 == 'a') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	System.out.println("8- ¿Cuál es la diferencia entre Java y JavaScript?");
	System.out.println("a) Java es un lenguaje de programación y JavaScript es un sistema operativo");
	System.out.println("b) Java es un lenguaje de programación de propósito general y JavaScript es un lenguaje de scripting");
	System.out.println("c) Java se utiliza para desarrollar aplicaciones de escritorio y JavaScript para aplicaciones web");
	char respuesta8 = teclado.next().charAt(0);
	if(respuesta8=='b') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	System.out.println("9- ¿Qué es un archivo JAR en Java?");
	System.out.println("a) Un archivo que contiene un conjunto de archivos comprimidos, incluyendo archivos de clases, imágenes y recursos, que se utilizan para distribuir y ejecutar aplicaciones Java.");
	System.out.println("b) Un archivo de configuración para un servidor web.");
	System.out.println("c) Una herramienta para analizar el código de un programa.");
	char respuesta9=teclado.next().charAt(0);
	if (respuesta9== 'a') {
		contador++;
		System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
	
//-------------------------------------------------------------------------	
	
	System.out.println("a) El código fuente de un programa Java.");
	System.out.println("10- ¿Qué es el código bytecode en Java?");
	System.out.println("b) El código máquina generado por el compilador de Java.");
	System.out.println("c) El resultado de la ejecución de un programa Java.");
	char respuesta10=teclado.next().charAt(0);
	if (respuesta10 == 'b') {
			contador++;
			System.out.println("Respuesta correcta\n");
	}
	else {
		System.out.println("Respuesta Incorrecta\n");
	}
//---------------------------------------------------------------------------	
	
	teclado.close();
	
	
	System.out.println("Total de respuestas correctas = " + contador);
}

//-----------------------------------------------------------END-----------------------------------------------------------------------

//--------------------------------------------------------Ordenar3Numeros--------------------------------------------------------------
public static void OrdenDeTres() {
	Scanner teclado =new Scanner(System.in);
	
	System.out.println("Ingresa los 3 numero que desees ordenar");
	int n1=teclado.nextInt();
	int n2=teclado.nextInt();
	int n3=teclado.nextInt();
	int [] orden = {n1, n2, n3};
	
	Arrays.sort(orden);

	for(int i = 0 ; i<orden.length ; i++) {
	
	System.out.println(orden[i]);
	}
	teclado.close();
}

//------------------------------------------------------------END----------------------------------------------------------------------

//------------------------------------------------------------------EsPar--------------------------------------------------------------
public static void EsPar() {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("introduce un numero que quieras clasificar");
	int num= teclado.nextInt();
	
	
	if(num % 5 == 0) {
		System.out.println("El numero introducido es divisible por 5");
	}
	
	if(num % 2 == 0) {
		System.out.println("El numero introducido es par");
	}
	
	if(num % 2 != 0 && num % 5 != 0) {
		
			System.out.println("El numero introducido no es par ni divisible por 5");		
	}
	teclado.close();
	
}

//--------------------------------------------------------------END--------------------------------------------------------------------


//------------------------------------------------------------Triangulos---------------------------------------------------------------
public static void Triangulos() {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Ingrese el caracter a imprimir");
	char cara=teclado.next().charAt(0);



	 for (int altura = 0; altura < 5; altura++) {         
		 for (int largo = 0; largo < 9; largo++) {
             if (largo >= 4 - altura && largo <= 4 + altura) {
                 System.out.print(cara);
             }else {
                 System.out.print(" ");
             }
         }
        System.out.println();
     }

	 
	  for (int altura = 4; altura >= 0; altura--) {
          for (int largo = 0; largo < 9; largo++) {
              if (largo >= 4 - altura && largo <= 4 + altura) {
                  System.out.print(cara);
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();	 
}	 
	 

	  for (int altura = 0; altura < 5; altura++) {
          for (int largo = 0; largo < 5; largo++) {
              if (largo >= 4 - altura) {
                  System.out.print(cara);
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
	 
	  for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++) {
              if (j <= i) {
                  System.out.print(cara);
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
	 
	 
	 
	 
	 teclado.close();
}



public static void TriangulosDos() {

	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Seleccione el caracter con el que quiere pintar el triangulo");
	char car=sc.next().charAt(0);
	
	System.out.println("\n");
	
	System.out.println("Seleccione de que lado quiere que apunte el triangulo");

	System.out.println("\n");
	
	System.out.print(" 1.Arriba. \n 2.Abajo. \n 3.Izquierda \n 4.Derecha");
	int selector= sc.nextInt();

	System.out.println("\n");
	
	switch(selector) {
	
	case 1 : System.out.println("    " +     car  + "    ");
			 System.out.println("   "+ car + car + car +"   ");
			 System.out.println("  "+ car + car + car + car +car+ "  ");
			 System.out.println(" "+ car + car + car + car + car + car +car+" ");
			 System.out.println(""+car + car +car +car + car+car+car+car +car);
	
			 break;
	
	case 2:System.out.println(""+ car + car + car + car + car + car + car + car + car);
		   System.out.println(" "+ car + car + car + car + car + car +car+" ");
		   System.out.println("  "+ car + car + car + car +car+ "  ");
		   System.out.println("   "+ car + car + car +"   ");
		   System.out.println("    " +     car  + "    ");
	
		   break;
		   
	case 3:System.out.println("    " + car);
		   System.out.println("   " + car+car);
		   System.out.println("  " + car+car+car);
		   System.out.println(" " + car +car+car+car);
		   System.out.println("  " + car+car+car);
		   System.out.println("   " + car+car);
		   System.out.println("    " + car);
		   
		   break;
		   
	case 4 :System.out.println("" + car);
			System.out.println("" + car+car);
			System.out.println("" + car+car+car);
			System.out.println("" + car+car+car+car);
			System.out.println("" + car+car+car);
			System.out.println("" + car+car);
			System.out.println("" + car);
		   
		   
	}
	sc.close();
	
}

//-----------------------------------------END--------------------------------------------------------------------------------------------










}




