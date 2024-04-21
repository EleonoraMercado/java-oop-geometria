//chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un 
		//nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
		//BONUS Aggiungere alla classe Rettangolo un metodo disegna che disegna in console il rettangolo 
		//con le sue dimensioni
		

package org.lessons.java.geometria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Verrà mostrata a video l'area e il perimetro" 
				+ " e un disegno del rettangolo con le sue dimensioni");
		
		//Chiedo all'utente di inserire la base
		System.out.print("Inserisci un valore per la base del rettangolo");
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		//devo convertire il numero inserito in una sringa in un intero
		int base = Integer.parseInt(scan.nextLine());
		
		//Chiedo all'utente di inserire l'altezza
		System.out.print("Inserisci un valore per l'altezza del rettangolo");
		System.out.println();
		
		//devo convertire il numero inserito in una sringa in un intero
		int altezza = Integer.parseInt(scan.nextLine());
		
		System.out.println("Base: " + base);
		System.out.println("Altezza: " + altezza);
		
		//Creo un nuovo oggetto rettangolo
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		//Stampo area retangolo
		System.out.println("Area: " 
				+ rettangolo.calcolaArea());
		
		//Stampo perimetro rettangolo
		System.out.println("Perimetro: " 
				+ rettangolo.calcolaPerimetro());
		
			scan.close();
		
	}

};
