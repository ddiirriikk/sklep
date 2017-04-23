package model;

import java.math.BigDecimal;

public class Komputer extends Produkt implements UrzadzenieElektroniczne{
	
	//private BigDecimal cena; // ta zmienna stosowana jest tam gdzie chcemy miec dok³adnosc
	//private String nazwa;
	
	private String cpu;
	private String ram;
	
	public Komputer(BigDecimal cena, String nazwa, String cpu, String ram) {
		//super();//odnosi sie do konstruktora klasy bazowe, po której dziedziczymy; jest automatycznie przypisywany 
		super(cena, nazwa);
		this.cpu = cpu;
		this.ram = ram;
	}

	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String toString(){
		return nazwa + ", " + cena + "PLN,  " + cpu + ", " + ram ; 
	}

	public void zaktualizuj(BigDecimal cena, String nazwa, String ram, String cpu) {
		this.cena = cena;
		this.nazwa = nazwa;
		this.ram = ram;
		this.cpu = cpu;
		
		
	}
	
	public String dajRabat(){
		return "-10%";
	}


	@Override
	public void wyswietlCertyfikatCE() {
		System.out.println("Certyfikat CE dla komputera ");
		
	}
	
}
