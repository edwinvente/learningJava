package poo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco b = new Banco();
		
		for(int i = 0; i < 100; i++) {
			EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);
			
			Thread t = new Thread(r);
			t.start();
		}

	}

}


class Banco {
	public Banco() { //Constructor
		cuentas = new double[100]; //creamos 100 cuentas
		for(int i = 0; i < cuentas.length; i++) cuentas[i] = 2000;// a cada cuenta le asignamos 2000 dolares
//		saldoSuficiente = cierreBanco.newCondition();
	}
	
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
//		cierreBanco.lock();
//		try {
			
			while(cuentas[cuentaOrigen] < cantidad) {//validamos que el saldo sea inferiror a la cantidad
				
				wait();
//				saldoSuficiente.await();
				
				System.out.println("--------- SALDO INSUFICIENTE DE LA CUENTA: "+ cuentaOrigen +" SALDO ACTUAL: "+cuentas[cuentaOrigen]+" PARA LA CUENTA: "+ cuentaDestino+" CANTIDAD: "+cantidad); 
			}
			
			System.out.println(Thread.currentThread()); //mostramos el hilo en consola
			
			cuentas[cuentaOrigen] -= cantidad; //dinero que sale de la cuenta
			
			System.out.printf("%10.2f de %d para %d ", cantidad, cuentaOrigen, cuentaDestino);
			
			cuentas[cuentaDestino] += cantidad; //sumar a la cuenta destino el nuevo valor
			
			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
			
			notifyAll();
//			saldoSuficiente.signalAll();
			
//		} finally {
//			// TODO: handle finally clause
//			cierreBanco.unlock();
//		}
		
		
	}
	
	public double getSaldoTotal() {
		double suma_cuentas = 0;
		
		for(double saldo: cuentas) suma_cuentas += saldo; //captura el valor de cada cuenta y lo suma
		
		return suma_cuentas;
	}
	
	private final double[] cuentas;
	
	//private ReentrantLock cierreBanco = new ReentrantLock();
	
	private Condition saldoSuficiente;
}


class EjecucionTransferencias implements Runnable{
	
	public EjecucionTransferencias(Banco b, int de, double max) {
		banco = b;
		deLaCuenta = de;
		cantidadMax = max;
	}
	
	public void run() {
		try {
			while(true) {
				int paraLaCuenta = (int)(100 * Math.random());
				
				double cantidad = cantidadMax * Math.random();
				
				banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
				
				Thread.sleep((int)(Math.random()*10));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
	
}