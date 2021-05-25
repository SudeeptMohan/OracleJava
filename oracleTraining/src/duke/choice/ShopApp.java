package duke.choice;

import java.util.Arrays;

public class ShopApp {

	public static void main(String[] args) {
		
		
		Customer c1 = new Customer ("Pinky", 4);
		System.out.println("Customer is "+c1.getName());
		System.out.println("Customer size is "+c1.getSize());
				
		
		//double total = 0;
		System.out.println("Minimum price value is "+Clothing.minPrice);
		Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
		Clothing item2 = new Clothing("Orange T-shirt",12.6,"S");
		Clothing item3 = new Clothing("Green scarf",5,"S");
		Clothing item4 = new Clothing("Blue T-shirt",10.5,"S");
				
		Clothing items[] = new Clothing [5];
		
		items[0] = item1;
		items[1] = item2;
		items [2] = item2;
		items [3] = item3;
		items [4] = item4;
		
		
		c1.addItems(items);
		
		Arrays.sort(c1.returnItems());
		for (Clothing item : c1.returnItems()) {
			System.out.println("Item Output " + item);
		}

		System.out.println("total is "+c1.getTotalClothingCost());
		c1.avgPrice();
		}

}
