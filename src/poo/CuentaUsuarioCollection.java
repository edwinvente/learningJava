package poo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class CuentaUsuarioCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientCollection cli1 = new ClientCollection("Edwin", "0001", 200000);
		ClientCollection cli2 = new ClientCollection("Maria", "0002", 380000);
		ClientCollection cli3 = new ClientCollection("Sebas", "0003", 500000);
		ClientCollection cli4 = new ClientCollection("Martha", "0004", 1200000);
		ClientCollection cli5 = new ClientCollection("Martha", "0004", 1200000);
		
		
		Set<ClientCollection> clientes = new HashSet<ClientCollection>();
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		clientes.add(cli4);
		clientes.add(cli5);
		
		Iterator<ClientCollection> it = clientes.iterator();
		
		while (it.hasNext()) {
			if(it.next().getNombre().equals("Sebas")) it.remove(); 
		}
		
		
		for (ClientCollection cliente: clientes) {
			//System.out.println(cliente.getNombre() + " cuenta:"+cliente.getN_cuenta() + " saldo: "+ cliente.getSaldo());
		}

		/*
		 * 
		 * Linkedlist
		 * */
		
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("Edwin Caicedo");
		personas.add("Ana Maria");
		personas.add("Oscar Ximenes");
		personas.add("Jesus Alberto");
		
		
		ListIterator<String> it2 = personas.listIterator();
		
		it2.next();
		it2.add("Juan Martinez");
		
//		personas.add(0, "Nicolas Vargas");
		
		System.out.println(personas.size());
		
		for (String persona : personas) {
			System.out.println(persona);
		}
		
		

	}

}
