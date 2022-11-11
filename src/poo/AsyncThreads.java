package poo;

public class AsyncThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process hilo1 = new Process();
		HilosDinamicos hilo2 = new HilosDinamicos(hilo1);
		
		hilo2.start();
		hilo1.start();
		
		System.out.println("end ");

	}

}

class Process extends Thread {
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Star thread with name "+ getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("termino el hilo "+getName());
	}
	
}

class HilosDinamicos extends Thread {
	
	public HilosDinamicos(Thread hilo) {
		this.hilo = hilo;
	}
	
	public void run() {
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Star thread with name "+ getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("termino el hilo "+getName());
		
	}
	
	private Thread hilo; 
}
