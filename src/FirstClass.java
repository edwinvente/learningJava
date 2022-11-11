import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FirstClass {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Number age = 30;
		Float temperature = 10.2f;
	
		//Double pi = 3.1416;
		Double pi = Math.PI;
		
		char firstLetterName = 'E';
		//constantes
		final int constant_value = 31;		
		Locale objetoLocale;
		
		/*System.out.println("What is you name?");
		Scanner entrada = new Scanner(System.in);
		String name = entrada.nextLine();
		
		System.out.println("Your name is "+name);
		
		System.out.println("What is you surname?");
		String surname = JOptionPane.showInputDialog("Enter surname here please");
		
		System.out.println("Thank you very much "+ name + " "+ surname);
		
		if (name != surname) {
			String response = JOptionPane.showInputDialog("what is you family");
		}
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Juan");
			
		}*/
		
		String names[] = { "Edwin", "Alberto", "Martha", "Ana", "Miguel", "Chava" };
		
		for(String name: names) System.out.println(name);
		
	
	
	}
	
}
