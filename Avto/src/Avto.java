//Vklju�imo paket za delo z vhodno izhodnimi napravami (paket vedno vklju�imo na za�etku)
import java.io.*;
//Vklju�imo paket za delo s pripomo�ki
import java.util.*;

//Deklariramo javni razred (ime mora biti enako kot je ime datoteke) Paziti moramo, da je vsak objekt z veliko za�etnico - Avto
public class Avto {
	
	// Ustvarimo stati�no lastnost, za vnos iz konzole (vse lastnosti so na�eloma zasebne - private)
	private static BufferedReader input;	

	//Deklariramo stati�en seznam avtomobilov
	private static ArrayList<MojAvto> avtomobili;
	
	//Definiramo glavno metodo - javna stati�na metoda main (public - javna, static - stati�na kar pomeni, da je v celem programu samo ena, void pomeni, da ne vrne nobene vrednosti)
	//Z metodo lahko spremenimo lastnosti objekta (primer: Avto -  lastnost je da pelje ljudi. Z metodo izprazni in nato napolni z drugo osebo zamenjamo lastnost)
	//Paziti moramo, da je vsak objekt z veliko za�etnico - String
	public static void main(String[] args) {
	
		//Izpi�e pozdrav na zaslon
		System.out.println("Pozdravljeni voznik.");
	
		// Inicializiramo lastnost za vnos iz konzole in za tabelo
		input = new BufferedReader(new InputStreamReader(System.in));
		avtomobili = new ArrayList<MojAvto>();
		
		//Deklariramo in inicializiramo lokalno spremenljivko znamka
		int ljudje = 0;
		String znamka = "Znamka vozila";
		String model = "Model vozila";
		
			for(int c=0; c<10; c++) {
				while (!znamka.isEmpty() || !model.isEmpty()) {
				// Poizkusimo vpra�ati, kak�ne znamke je avto (readLine - preberi iz tipkovnice dokler ne pritisnemo enter)
				// znamka �ivi samo znotray try zato je inicializirana �e prej z vrednostjo Znamka vozila
				//Integer.parseInt je vklju�en zato da vrne �tevilsko vrednost ker BufferedReader bere samo string iz tipkovnice
				try {
					System.out.print("Vnesi znamko, model in �t oseb, ki se lahko vozijo v avtu: ");
					znamka = input.readLine();	
					model = input.readLine();
					ljudje = Integer.parseInt(input.readLine());					
				}
			
				//�e bi bila sporo�ena izjema (izpi�e napako e)
				catch(Exception e) {
					System.err.println("Napaka: " + e);
				}
				// Dodamo nov avto v seznam avtomobilov
				avtomobili.add(new MojAvto(ljudje, znamka, model));
				}
			}	// for
			
			
			//Izpi�emo vsebino seznama avtomobili
			for(int c=0; c<10; c++) {
				System.out.println("Znamka " + c + ". avtomobila je: " + avtomobili.get(c).getZnamka() + " . Model je: " + avtomobili.get(c).getModel() + " . Registriran je za " + avtomobili.get(c).getSteviloLjudi() + " oseb.");
			}	
			
	}	
}