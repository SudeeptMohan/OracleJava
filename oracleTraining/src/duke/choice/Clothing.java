package duke.choice;

public class Clothing implements Comparable<Clothing>{
private String description;
private double price;
private String size="M";
public static final double minPrice = 10;
private final double taxRate = 0.2;

public Clothing() {
	}
public Clothing(String description, double price, String size) {
	this.description=description;
	this.price=price;
	this.size = size;
}



public String toString() {			//overrides toString of Object class
	return getDescription()+", "+getPrice()+", "+getSize(); 
}

public void setDescription (String description) {
		this.description=description;
}
public void setPrice (double price) {
	this.price=price;
	if (this.price < minPrice) {
		this.price = 10;
		}
	this.price=this.price*(1+taxRate);
	
}
public void setSize (String size) {
	this.size=size;
}

public String getDescription() {
	return description;
}
public double getPrice() {
	
	return price;
}
public String getSize() {
	return size;
}

@Override
public int compareTo(Clothing o) {
	return 	this.description.compareToIgnoreCase(o.description);
	
}

}
