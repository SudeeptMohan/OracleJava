package Encapsulation;

public class Store {

	public static void main(String[] args) {
		
		Customer cst = new Customer();
		
		System.out.println( cst.getItem().getPrice());
		
	}

}
