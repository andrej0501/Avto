//Vkljuèimo paket za delo z vhodno izhodnimi napravami (paket vedno vkljuèimo na zaèetku)
import java.io.*;
//Vkljuèimo paket za delo s pripomoèki
import java.util.*;

//Deklariramo javni razred (ime mora biti enako kot je ime datoteke) Paziti moramo, da je vsak objekt z veliko zaèetnico - Avto
public class Avto {
	
	// Ustvarimo statièno lastnost, za vnos iz konzole (vse lastnosti so naèeloma zasebne - private)
	private static BufferedReader input;	

	//Deklariramo statièen seznam avtomobilov
	private static ArrayList<MojAvto> avtomobili;
	
	//Definiramo glavno metodo - javna statièna metoda main (public - javna, static - statièna kar pomeni, da je v celem programu samo ena, void pomeni, da ne vrne nobene vrednosti)
	//Z metodo lahko spremenimo lastnosti objekta (primer: Avto -  lastnost je da pelje ljudi. Z metodo izprazni in nato napolni z drugo osebo zamenjamo lastnost)
	//Paziti moramo, da je vsak objekt z veliko zaèetnico - String
	public static void main(String[] args) {
	
		//Izpiše pozdrav na zaslon
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
				// Poizkusimo vprašati, kakšne znamke je avto (readLine - preberi iz tipkovnice dokler ne pritisnemo enter)
				// znamka živi samo znotray try zato je inicializirana že prej z vrednostjo Znamka vozila
				//Integer.parseInt je vkljuèen zato da vrne številsko vrednost ker BufferedReader bere samo string iz tipkovnice
				try {
					System.out.print("Vnesi znamko, model in št oseb, ki se lahko vozijo v avtu: ");
					znamka = input.readLine();	
					model = input.readLine();
					ljudje = Integer.parseInt(input.readLine());					
				}
			
				//èe bi bila sporoèena izjema (izpiše napako e)
				catch(Exception e) {
					System.err.println("Napaka: " + e);
				}
				// Dodamo nov avto v seznam avtomobilov
				avtomobili.add(new MojAvto(ljudje, znamka, model));
				}
			}	// for
			
			
			//Izpišemo vsebino seznama avtomobili
			for(int c=0; c<10; c++) {
				System.out.println("Znamka " + c + ". avtomobila je: " + avtomobili.get(c).getZnamka() + " . Model je: " + avtomobili.get(c).getModel() + " . Registriran je za " + avtomobili.get(c).getSteviloLjudi() + " oseb.");
			}	
			
	}	
}