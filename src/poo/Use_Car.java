package poo;

public class Use_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Mazda = new Car(); //instancia de clase
		Mazda.setColor("Orange");
		Mazda.setAasientosCuero(false);
		System.out.println(Mazda.getLargo() +" "+ Mazda.getColor() +" tiene asientos de cuero: "+ Mazda.getAasientosCuero());

	}

}
