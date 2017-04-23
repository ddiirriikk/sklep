package ui;

import java.math.BigDecimal;
import java.util.Scanner;

import model.Komputer;
import model.Produkt;
import model.Sklep;
import model.Szkolenie;

public class Menu {

	public void wyswietlMenu() {
		
		
		
		
		Sklep sklep = new Sklep("www.sklep.com");
		Scanner skaner = new Scanner(System.in);
		String wybor;
		System.out.println("1 - dodaj komputer");
		System.out.println("2 - usun produkt");
		System.out.println("3 - edytuj komputer");
		System.out.println("4 - wyswietl produkty");
		System.out.println("5 - dodaj szkolenie");
		System.out.println("6 - wyœwietl rabaty");
		System.out.println("q - wyjœcie");

		do {
			System.out.print("Podaj opcje: ");
			wybor = skaner.nextLine();
			switch (wybor) {
			case "1": {
				System.out.print("Podaj cene: ");
				BigDecimal cena = skaner.nextBigDecimal();
				skaner.nextLine();

				System.out.println("Podaj nazwe ");
				String nazwa = skaner.nextLine();

				System.out.println("podaj cpu: ");
				String cpu = skaner.nextLine();

				System.out.println("podaj ram: ");
				String ram = skaner.nextLine();

				Komputer komputer = new Komputer(cena, nazwa, cpu, ram); // polimorfizm
				sklep.dodajProdukt(komputer);
			}
				break;
			case "2": { // wprowadzamy sztuczny blok kodu by mozna zadeklarowac
						// ta sama zmienna 2 razy w jednym bloku(tutaj blok to ca³y switch)
						

				if (sklep.czyPusty()) {
					System.out.println("Brak towaru");
				} else {
					sklep.wyswietlListe();
					System.out.println("Podaj indeks do usuniecia ");
					int index = skaner.nextInt();
					skaner.nextLine();

					if (sklep.sprawdzIndex(index)) {
						sklep.usunProdukt(index);
						System.out.println("Komputer zosta³ poprawnie usuniêty");
					} else {
						System.out.println("Poda³eœ niepoprawny indeks");
					}
				}
			}
				break;
			case "3": {
				sklep.wyswietlListe();
				System.out.println("Który element edytujemy: ");
				int index = skaner.nextInt();
				skaner.nextLine();
				Produkt produkt = sklep.znajdzProdukt(index);

				if (produkt instanceof Komputer) {

					Komputer komputer = (Komputer) sklep.znajdzProdukt(index); // rzutujemy jeden typ na inny
					// Komputer komputer = sklep.komputery.get(index); mozna tak napisaæ ale lista w klasie
					// sklep musi byæ public

					System.out.println("Podaj nowa cene (aktualana cena : " + komputer.getCena() + ")");
					BigDecimal cena = skaner.nextBigDecimal();
					skaner.nextLine();
					System.out.println("Podaj nowa nazwe (aktualna:" + komputer.getNazwa());
					String nazwa = skaner.nextLine();
					System.out.println("podaj nowe cpu (aktualne: " + komputer.getCpu());
					String cpu = skaner.nextLine();
					System.out.println("podaj nowy ram (aktualny: " + komputer.getRam());
					String ram = skaner.nextLine();

					// komputer.setCena(cena);
					// komputer.setNazwa(nazwa);
					// komputer.setCpu(cpu);
					// komputer.setRam(ram);

					komputer.zaktualizuj(cena, nazwa, ram, cpu);

					sklep.zmodyfikujProdukt(index, komputer);
				}else {
					System.out.println("To nie jest komputer.");
				}
				
			}
				break;
			case "4":
				if (sklep.czyPusty()) {
					System.out.println("Brak towaru");
				} else {
					sklep.wyswietlListe();
				}
				break;
			case "5": {
				System.out.print("Podaj cene: ");
				BigDecimal cena = skaner.nextBigDecimal();
				skaner.nextLine();

				System.out.println("Podaj nazwe ");
				String nazwa = skaner.nextLine();

				System.out.println("podaj technologie: ");
				String technologia = skaner.nextLine();

				Szkolenie szkolenie = new Szkolenie(cena, nazwa, technologia);// rzutowanie w góre-rzutowanie bezpieczne
									// np rzutowanie komputera na produkt, dó³- rzutowanie niebezpieczne rzutowanie
									// produktu na komputer/szkolenie
				sklep.dodajProdukt(szkolenie);

			}
				break;
				
			case "6":{
				sklep.wyswietlRabat();
			}
				break;
			case "q":
			case "Q":
				System.out.println("ByeBye");
				break;
			default:
				System.out.println("B³êdny wybór");
				break;
			}
		} while (!"q".equalsIgnoreCase(wybor));
	}
}
