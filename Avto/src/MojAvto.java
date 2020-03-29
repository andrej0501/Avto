// Deklariramo javni razred z imenom Avto - vsi razredi so z velikimi zaèetnicami, spremenljivke so z malimi zaèetnicami
public class MojAvto {
	
	
	// Deklariramo lastnosti (spremenljivke)
	// (private - da se od zunaj ne da spreminjati, String - pomeni, da je niz, ki se imenjuje znamka)
	// int - cela števila, spremenljivke so z mali mi zaèetnicami
	private String znamka;
	private String model;
	private int steviloLjudi;
	private boolean vrataOdprta;

	
	// Deklariramo konstruktor s katerim ustvarimo nov objekt tipa MojAvto
	// Vhod: znamka, model in velkost gum
	// Vrne: nov objekt razreda MojAvto
	public MojAvto(int s, String z, String m){
		
		// Inicializiramo lastnosti
		znamka = z;
		model = m;
		steviloLjudi = s;
		vrataOdprta = false;
	}	// Konec konstruktorja

	
	// Metoda, ki vrne stevilo ljudi (imena metod so vedno z malimi èrkami)
	// Vhod: /
	// Izhod: Število ljudi v avtu
	public int getSteviloLjudi() {
		
		// Vrne vrednost lastnosti steviloLjudi
		return steviloLjudi;
	}	// konec metode stevilo ljudi
	
	// Metoda za praznanje avta  - spremenimo lastnost steviloLjudi
	// Vhod: Število ljudi, ki izstopijo iz avta (si - št izstopljenih)
	// Izhod: koliko je še ostalo
	public int izprazni(int si) throws Exception {
		
		// èe je avto odprt
		if(vrataOdprta){
			
			// ljudje izstopijo
			steviloLjudi -= si;	

			// Preverimo ali je kolièina negativna. Èe je negativna jo damo na 0
			if(steviloLjudi < 0){
				
				// postavimo kolièino vsebine na 0
				steviloLjudi = 0;
				
				// vržemo izjemo - èe so vrata odprta
				throw new Exception("V avtu ni toliko ljudi.");
			}	// konec if					
				
		}	// konec if
		
		//Èe so vrata avta zaprta
		else {
			
			// Vržemo izjemo - èe so vrata zaprta (s throw se izvajanje zakljuèi, tako da za njim ne sme biti nièesar veè)
			throw new Exception("Vrata so zaprta, ljudje ne moreje iz avta.");
		}	// konec else
		
		// Vrne število ljudi v avtu
		return steviloLjudi;
	
	}	// konec izprazni avto
	
	// Metoda, ki odpre vrata avta (metoda odpri() - mora imeti oklepaje, ker gre za metodo in ne spremenljivko)
	// Vhod: /
	// Izhod: uspešnost odpiranja
	public	boolean odpri () {
		
		//Spremenimo vrednost lastnosti
		vrataOdprta = true;
		
		// V vsakem primeru vrne true
		return true;
		
	}	//konec metode odpri
	
	// Deklariramo javno metodo, ki vrne znamko
	public String getZnamka() {
		//vrnemo znamko
		return znamka;
	}	
	
	// Deklariramo javno metodo, ki vrne model
	public String getModel() {
		//vrnemo znamko
		return model;
	}	
	
}