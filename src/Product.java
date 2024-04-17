
public class Product {

	// Properties
		public String name;
		
		public int price;
		
		public boolean electric;
		
		
	// Constructors
	public Product () {
		System.out.println("In constructor");
	}
	
	public Product(String name) {
		// Property = Argument
		this.name = name;
	}
		
	
		// Method declaration
		public void printName() { 
			System.out.println("Naam is " + name);
		}	

		public void overridePrice(int newPrice) {
			price = newPrice;
		}
	
		public int calculateTotalPrice() {
			int totalPrice = price * 2;
			
			return totalPrice;
			
			
		}

		
}		
