// Definiramo razred, ki razširi razred MojAvto
public class OsebniAvto extends MojAvto {
	
	// Vse lastnosti, deklarirane v nadrazredu se prenesejo
	// Deklariramo samo nove lastnosti
	private boolean jeServisiran;
	private String barva;
	private String gorivo;
	private int velikostGum;
	
	//Deklariramo konstruktor - enak kot pri nadrazredu (b kot barva v velikost gum k - količina, ki je definirana že v Stekelnica)
	public OsebniAvto(int v, String b, String g) {
		
		// Pred super ne sme biti nič drugega v konstruktorju
		// Pokličemo konstruktor nadrazreda MojAvto z rezervirano besedo super
		// Vhodi: št. ljudi, barva, gorivo
		super(5, "Znamka", "Model");
		
		// Določimo ostale lastnosti
		jeServisiran = true;
		barva = b;
		gorivo = g;
		velikostGum = v;
	}
	
	// Deklariramo nov konstruktor
	public OsebniAvto(int v, String b, String g, int s, boolean ser){
		
		// Pokličemo konstruktor nadrazreda
		// Vhodi: stopnja alkohola, barva piva, kapaciteta, ali je povratna
		super(s, "Znamka", "Model");
		
		// Določimo ostale lastnosti
		jeServisiran = ser;
		barva = b;
		gorivo = g;
		velikostGum = v;
	}	
	
	
	// Deklariramo metodo, ki vrne velikost gum
	public int getVelikostGum() {
		//vrnemo velikost gum
		return velikostGum;
	}	
	
	// Deklariramo metodo, ki vrne barvo
	public String getBarva() {
		//vrnemo barvo
		return barva;
	}
		
	// Deklariramo metodo, ki vrne gorivo
	public String getGorivo() {
		//vrnemo gorivo
		return gorivo;
	}	
}