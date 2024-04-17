
public abstract class Voertuigen {

	protected int aantalWielen;
	
	protected String merk;

	public int getAantalWielen() {
		return aantalWielen;
	}

	public void setAantalWielen(int aantalWielen) {
		this.aantalWielen = aantalWielen;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	public abstract void makeSound();
	
}
