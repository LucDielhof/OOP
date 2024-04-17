
public class Auto {
	
	public String merk;
	
	public String kleur;
	
	public int aantalStoelen;
	
	public String nummerbord;
	
	public int maxSnelheid;
	
	public void printMerk() {
		System.out.println("merk is " + merk);
	
	}
	public void printAantalStoelen() {
		System.out.println("aantalStoelen is " + aantalStoelen);
	}

	public void overrideKleur(String nieuweKleur) {
		kleur = nieuweKleur;
	}
	
	public void overrideMerk(String nieuwMerk) {
		merk = nieuwMerk;
	}
	
	public String samenvattingAuto() {
		String samenvattingAuto = "merk: " + merk + ", kleur: " + kleur + ", aantalStoelen: " + aantalStoelen + ", nummerbord: " + nummerbord + ", maxSnelheid: " + maxSnelheid;
		return samenvattingAuto;
	}
	
	public Auto () {
		
	}
	
	public Auto (String merk, String kleur, int maxSnelheid, int aantalStoelen, String nummerbord) {
		this.merk = merk;
		this.kleur = kleur;
		this.maxSnelheid = maxSnelheid;
		this.aantalStoelen = aantalStoelen;
		this.nummerbord = nummerbord;
		
	}
	
}
