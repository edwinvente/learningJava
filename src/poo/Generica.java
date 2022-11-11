package poo;

public class Generica<T> {
	// construc method
	public Generica() {
		dato = null;
	}
	//seter method
	public void setDato(T info) {
		dato = info;
	}
	//getter method
	public T getDato() {
		return dato;
	}
	//encansule property
	private T dato;

}
