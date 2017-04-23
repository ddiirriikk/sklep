package model;

import java.math.BigDecimal;

public abstract class Produkt { //klasa jest abstrakcyjna, nie mo¿emy utworzyæ obiektu typu produkt
	
	protected int id;
	protected BigDecimal cena; //prodected czyli obiekt jest widoczny dla klas dziedzicz¹cych ale prywatna (nie widoczna) dla innych(niedziedzicz¹cych)
	protected String nazwa;
	
	private static int generator = 1; //static oznacza ze dany obiekt wystepuje w pamieci raz, wszystkie obiekty maja wspólny
	//skladowa statyczna od sta³ej statycznej ró¿ni sie tym ze moze sie zmieniæ
	
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
	
	// mozemy utworzyæ metody abstrakcyjne
	public abstract String dajRabat();
	
	public static void wyswietlIloscObiektow(){ //metoda statyczna daje nam dostep do metody bez tworzenie obiektu
		System.out.println(generator);
	}

}
