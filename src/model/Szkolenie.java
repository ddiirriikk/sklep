package model;

import java.math.BigDecimal;

public class Szkolenie extends Produkt{ //mozna dziedziczyc tylko po jednej klasie bezposrednio (jeden rodzic)

	//tehnologia
	private String technologia;
	
	public Szkolenie(BigDecimal cena, String nazwa, String technologia ){
		super(cena, nazwa);
		this.technologia = technologia;
		
	}


	public String getTechnologia() {
		return technologia;
	}

	public void setTechnologia(String technologia) {
		this.technologia = technologia;
	}
	
	public String toString(){
		return nazwa + ", " + cena + "PLN,  " + technologia ; 
	}
	
	public String dajRabat(){
		return "-15%";
	}

}
