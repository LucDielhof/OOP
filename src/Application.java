
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		// Maak product 1 aan
		Product product1 = new Product();
		product1.name = "TV";
		product1.price = 1099;
		product1.electric = true;
		
		// Maak product 2 aan
		Product product2 = new Product();
		product2.name = "Fiets";
		
		System.out.println(product1.name);
		product1.name = "Fiets";
		System.out.println(product1.name);
		
		Auto auto1 = new Auto();
		auto1.merk = "Ferrari";
		auto1.kleur = "Rood";
		auto1.aantalStoelen = 2;
		auto1.nummerbord = "56NK3";
		auto1.maxSnelheid = 300;
		
		Auto auto2 = new Auto();
		auto2.merk = "Audi";
		auto2.kleur = "Zwart";
		auto2.aantalStoelen = 4;
		auto2.nummerbord = "33PL5";
		auto2.maxSnelheid = 200;
		System.out.println(auto1.merk);
		System.out.println(auto2.maxSnelheid);
		
		
		// Method call voorbeeld
		product1.printName();
		
		product1.overridePrice(1234);
		
		int totalPrice = product1.calculateTotalPrice();
		System.out.println("Total price = " + totalPrice);
		
		Product product3 = new Product("Laptop");
		
		
		// Method call eigen opdracht
		auto1.printMerk();
		
		auto1.printAantalStoelen();
		
		auto1.overrideKleur("Geel");
		System.out.println(auto1.kleur);
		
		auto2.overrideMerk("BMW");
		System.out.println(auto2.merk);
		
		String samenvattingAuto = auto1.samenvattingAuto();
		System.out.println(samenvattingAuto);
		
		Auto auto3 = new Auto("Opel", "Grijs", 100, 4, "12AB3");
		String samenvatting2 = auto3.samenvattingAuto();
		System.out.println(samenvatting2);
		
		// superclasses en subclasses opdracht
		Fietsen fiets1 = new Fietsen();
		fiets1.setMerk("Gazelle");
		
		Fietsen fiets2 = new Fietsen();
		fiets2.setMerk("Sparta");
		
		Vrachtwagens vrachtwagen1 = new Vrachtwagens();
		vrachtwagen1.setAantalWielen(6);
		vrachtwagen1.setMerk("DAF");

				
	}
	
}