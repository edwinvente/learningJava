package poo;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import poo.Car.Talla;

public class Use_Empleado {
	
	boolean validator = true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado Edwin = new Empleado("Edwin Caicedo", 6000000, 2020, 03,16);
		Empleado Sebastian = new Empleado();
		Car mazda = new Car();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("la persona sin nombre gana: "+Sebastian.getSueldo() +" su nombre es " +Sebastian.getNombre());
//		System.out.println("Enter your size: SMALL, MEDIUN, LARGE, EXTRA_LARGE");
//		
//		String enter_data = entrada.next().toUpperCase();
//		
//		Talla la_talla = Enum.valueOf(Talla.class, enter_data);
		
//		Toolkit.getDefaultToolkit().beep();
		
//		System.out.println(Edwin.getNombre() + " " + la_talla); 
//		System.out.println(la_talla.getTalla());
		
		//arrayList
		ArrayList<Empleado> lista_empleados = new ArrayList<Empleado>();
		lista_empleados.add(new Empleado("Edwin Caicedo", 6000000, 2020, 03,16));
//		lista_empleados.add(new Empleado("Jorge Garcia", 6000000, 2020, 03,16));
//		lista_empleados.add(new Empleado("Maria Martinez", 6000000, 2020, 03,16));
//		lista_empleados.add(new Empleado("Andres Borja", 6000000, 2020, 03,16));
//		lista_empleados.add(new Empleado("Carlos Marin", 6000000, 2020, 03,16));
		
		//lista_empleados.trimToSize();
		lista_empleados.ensureCapacity(lista_empleados.size());
		
//		System.out.println(lista_empleados.size());
//		for (Empleado e: lista_empleados) {
//			System.out.println(e.getNombre());
//		}
		
		//Handle generics class --- manejo de clases genericas ( cualquier tipo de dato )
		Generica<String> generica_uno = new Generica<String>();
		generica_uno.setDato("Edwin Caicedo");
		System.out.println(generica_uno.getDato());
		
		Generica<Empleado> generica_dos = new Generica<Empleado>();
		generica_dos.setDato(new Empleado("Jesus alberto", 6000000, 2020, 03,16));
		System.out.println(generica_dos.getDato());
		
		String items[] = { "item 1", "item 2", "item 3", "item 4" };
		
		String elements = Empleado.genericMethodGetLength(items);
		
		System.out.println(elements);
		

	}

}


class Empleado {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		Inner_class Inner = new Inner_class();
		
	}
	//sobre carga de constructires
	public Empleado() {
		nombre ="Persona Indeterminada";
		sueldo = 60000;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	public void setSueldo(double porcentage) {
		double aumento = sueldo * porcentage / 100;
		sueldo += aumento;
	}
	
	public static <T> String genericMethodGetLength(T[] a) {
		return "This list have "+a.length+" elements inside";
	}
	
	private class Inner_class {
		public Inner_class() {
			// TODO Auto-generated method stub
			System.out.println("Example of call to inner class");
		}
	}
	
}
