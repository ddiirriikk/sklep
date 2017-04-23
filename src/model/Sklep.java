package model;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
	
	private String www;
		
	private List<Produkt> produkty;
	
	public Sklep(String www) {
		this.www = www;
		this.produkty = new ArrayList<>();
	}
	
	
	//dodajKomputer
	public void dodajProdukt(Produkt produkt){
		produkty.add(produkt);
	}
	
	//usunKomputer
	public void usunProdukt(int index){
		produkty.remove(index - 1);
	}
	
	//wyswietlListe
	public void wyswietlListe(){
		for(int i =0 ; i < produkty.size(); i++){
			System.out.println((i+1) + ". " + produkty.get(i));
		}
		
	}
	//zmodyfikujKomputer
	public void zmodyfikujProdukt(int index, Produkt produkt){
		produkty.set(index - 1, produkt);
				
	}
	//znajdzKomputer
	public Produkt znajdzProdukt(int index){		
		return produkty.get(index -1);
	}


	public boolean czyPusty() {
		
		return produkty.isEmpty(); //sprawdza czy lista jest pusta
	}


	public boolean sprawdzIndex(int index) {
		 /* if (index >0 && index <= komputery.size()){
		  * return true;
		  * }else {
		  * return true;
		  * }
		  */
		return index >0 && index <= produkty.size();
		
		
	}


	public void wyswietlRabat() {
		for(Produkt produkt : produkty){
			System.out.println(produkt.dajRabat());
		}
		
	}
	
	public void wyswietlCE(){
		for(Produkt produkt : produkty){
			if (produkt instanceof UrzadzenieElektroniczne)	{
				UrzadzenieElektroniczne ue = (UrzadzenieElektroniczne) produkt;
				ue.wyswietlCertyfikatCE();
			}
		}
	}

}
