package poo;

public class Car {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int pero_total;
	
	boolean asientos_cuero, climatizador;
	
	//enum Talla { Grande, Mediano, Pequeno };
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getTalla() {
			return abreviatura;
		}
		
		private String abreviatura;
	}

	public Car() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		color="azul";
	} 
	
	
	public String getLargo() {
		return "El largo del coche es "+largo;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setAasientosCuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}
	
	public String getAasientosCuero() {
		return asientos_cuero ? "SI" : "NO";
	}

}
