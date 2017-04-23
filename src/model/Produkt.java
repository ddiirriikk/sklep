package model;

import java.math.BigDecimal;

public abstract class Produkt { //klasa jest abstrakcyjna, nie mo�emy utworzy� obiektu typu produkt
	
	protected int id;
	protected BigDecimal cena; //prodected czyli obiekt jest widoczny dla klas dziedzicz�cych ale prywatna (nie widoczna) dla innych(niedziedzicz�cych)
	protected String nazwa;
	
	private static int generator = 1; //static oznacza ze dany obiekt wystepuje w pamieci raz, wszystkie obiekty maja wsp�lny
	//skladowa statyczna od sta�ej statycznej r�ni sie tym ze moze sie zmieni�
	
	public Produkt(BigDecimal cena, String nazwa) {
		this.cena = cena;
		this.nazwa = nazwa;
		this.id = generator;
		generator++;
	}
	
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	// mozemy utworzy� metody abstrakcyjne
	public abstract String dajRabat();
	
	public static void wyswietlIloscObiektow(){ //metoda statyczna daje nam dostep do metody bez tworzenie obiektu
		System.out.println(generator);
	}

}
