package poo;

import java.util.Objects;

public class ClientCollection {
	//construct
	public ClientCollection(String nombre, String n_cuenta, double saldo) {
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}
	
	//setters and getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getN_cuenta() {
		return n_cuenta;
	}
	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(n_cuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientCollection other = (ClientCollection) obj;
		return Objects.equals(n_cuenta, other.n_cuenta);
	}

	//globals 
	private String nombre;
	private String n_cuenta;
	private double saldo;
	
}
