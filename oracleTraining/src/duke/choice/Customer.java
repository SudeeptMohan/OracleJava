package duke.choice;

public class Customer {

	private String name;	
	private String size="M";
	double total = 0.0;
	int count = 0;
	double sum;
	private Clothing [] items;
	
	public Customer(){
		
	}
	
	public Customer(String name,int measurement) {
		this.name = name;
		setSize(measurement);
	}
	
	
	public void setName (String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addItems(Clothing[] items) {
	
		this.items = items; 
		
	}
	
	public Clothing[] returnItems() {
	
		return items;
	}
	
	public double getTotalClothingCost	() {
		
		for (Clothing i : items )
		{	
			if (i.getSize() == getSize() & total <= 25)
					{
						System.out.println("Cost of "+ i.getDescription() + " is "+ i.getPrice());
						total = total + i.getPrice();
						
					}
		}
		return total;
	
	}
	
	public void avgPrice() {
		int count = 0;
		for (Clothing j : items) {
			if (j.getSize() == "L")
				count++;
			sum = sum + j.getPrice();
			
	}
		
		
		System.out.println("Average price for all Clothing items is: "+ sum/count);
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(int measurement) {
		
		switch(measurement) {
		case 1,2,3:size="S";break;
		case 4,5,6:size="M";break;
		case 7,8,9:size="L";break;
		default:size="XL";
		}
		
	}
}
