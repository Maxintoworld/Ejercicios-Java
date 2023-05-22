package ejercicios;

public class HorarioDeClases {

	public static void main(String[] args) {

		String mate= "\033[31m Matemáticas ";
		String lengua= "\033[32m Lengua ";
		String geo= "\033[33m Geografía ";
		String tecno= "\033[34m Tecnología ";
		String ing= "\033[35m Inglés ";
		
		
		System.out.printf("                        %20s \n","Horario de Clases semanal");
		System.out.println("__________________________________________________________________________");
		System.out.printf("%7s %10s   |%10s| %10s  | %10s   | %10s | \n","|","Lunes","Martes","Miercoles","Jueves","Viernes");
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-10s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m8:00", mate,lengua,geo,tecno ,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-10s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m9:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-9s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m10:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-9s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m11:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-9s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m12:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-9s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m13:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-9s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m14:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("|%-9s| %10s| %10s | %10s |%10s  | %10s   | \n","\033[30m13:00", mate,lengua,geo,tecno,ing);
		System.out.println("---------------------------------------------------------------------------");
		
	}

}
