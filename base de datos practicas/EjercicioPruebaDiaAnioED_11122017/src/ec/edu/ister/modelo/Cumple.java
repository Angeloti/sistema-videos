package ec.edu.ister.modelo;
import java.io.*;

/**
 *
 * @author Andres
 */
class DiaAnyo{ //INICIALIZAMOS LA CLASE DIANYO
    private int mes; //DECLARAMOS MES EN TIPO PRIVATE
    private int dia; //DECLARAMOS DIA EN TIPO PRIVATE
	 
    public DiaAnyo(int d, int m){ //INICIALIZAMOS EL CONSTRUCTOR
        dia=d; //AGREGAMOS SINONIMOS A LA VARIABLE DIA
        mes=m; //AGREGAMOS SINONIMOS A LA VARIABLE MES
    } 
    public boolean igual(DiaAnyo d){ //ESTE METODO BOOLEAN MUESTRA EN PANTALLA A MES Y ANYO
        if((dia == d.dia) && (mes == d.mes)) //COMPRUEBA QUE NO SEAN IGUALES LAS VARIABLES
            return true;//DEVUELVE VERDADERO SI LA CONDICION CUMPLE
        else
            return false;//DEVUELVE FALSO SI LA CONDICION NO CUMPLE
	} 
    public void visualizar(){ // ESTE METODO PERMITE VISUALIZAR EN CONSOLA
	System.out.println("mes= " + mes + " , dia= " + dia);
    } 

public class Cumple{ //INCIALIZA CLASE PRINCIPAL LLAMADA CUMPLE
	public static void main(String[] ar) throws IOException{ //PERMITE INICIALIZAR EL PROGRAMA CON MAIN
		DiaAnyo hoy; //DECLARAMOS UNA VARIABLE DIAANYO CON EL NOBRE DE HOY
		DiaAnyo cumpleanyos; //DECLARAMOS UNA VARIABLE DIAANYO CON EL NOBRE DE CUMPLEANYOS
		int d,m; //DECLARAMOS LAS VARIABLES PREVIAMENTE DECLARADAS COMO ENTERO
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); //CON LA CLASE BufferedReader PODEMOS INGRESAR DATOS POR TECLADO Y ALMACENARLOS EN UNA VARIABLE ENTRADA
		System.out.print("Introduzca fecha de hoy, dia: "); // SALIDA DE TEXTO PARA INTRODUCIR EL DIA
		d=Integer.parseInt(entrada.readLine()); //ALMACENAMOS EL VALOR Y REALIZAMOS UN CASTINF
		System.out.print("Introduzca el numero del mes: "); //SALIDA DE TEXTO PARA INTRODICIR MES
		m=Integer.parseInt(entrada.readLine()); //ALMACENAMOS EL VALOR Y VOLVEMOS A REALIZAR UN CASTING
		
		hoy = new DiaAnyo(d,m); // LLAMAMOS A LA VARIABLE HOY
		
		System.out.print("Introduzca la fecha de nacimiento, dia: "); // INTRODUCIMOS LA FECHA DE NACIMIENTO 
		d=Integer.parseInt(entrada.readLine());
		System.out.print("Introduzca el numero del mes: "); // INTRODUCIMOS EL MES
		m=Integer.parseInt(entrada.readLine());
		
                cumpleanyos = new DiaAnyo(d,m); // LLAMAMOS A LA VARIABLE CUMPLEANYOS
		
		System.out.print(" La fecha de hoy es: "); 
		hoy.visualizar(); // OBSERVAMOS LOSDATOS DE LA VARIABLE HOY
		System.out.print(" Su fecha de nacimiento es: ");
		cumpleanyos.visualizar(); // OBSERVAMOS LOS DATOS DE LA VARIABLE HOR POR EL METODO VISUALIZAR
		
		if(hoy.igual(cumpleanyos)) //COMPARAMOS LA FECHA INGRESADA CON LA FECHA DEL CUMPLEAÑOS
			System.out.println(" Feliz Cumpleaños ! "); //SI ES IGUAL DESPLEGA UN MENSAJE DE FELIZ CUMPLEAÑOS
		else
			System.out.print(" Feliz dia ! "); // SI ES FALSO DESPLIEGA UN MENSAJE DE FELIZ DIA
	} // 
} //
