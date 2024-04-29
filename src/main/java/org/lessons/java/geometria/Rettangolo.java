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
			return this.base * this.altezza;
		}
		
		//metodo per calcolare il perimetro
		public int calcolaPerimetro() {
			return 2 * (this.base + this.altezza);
		}
	
		
		public void disegnaRettangolo () {
	        for (int i = 0; i < this.altezza; i++) {
	            for (int j = 0; j < this.base; j++) {
	                if (i == 0 || i == this.altezza - 1 || j == 0 || j == this.base - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	            
	        }
		}  
		

};
