//attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri. Aggiungere due metodi: 
	//calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del 
	//rettangolo.

package org.lessons.java.geometria;

public class Rettangolo {
	
	
		//Attributi della classe rettangolo
		public int base;
		public int altezza;
	
		//Costruttore
		public Rettangolo(int base, int altezza) {
			this.base = base;
			this.altezza = altezza;
		}
		
		//metodo per calcolare area
		public int calcolaArea() {
			return base * altezza;
		}
		
		//metodo per calcolare il perimetro
		public int calcolaPerimetro() {
			return 2 * (base + altezza);
		}
	

};
