package com.ingeniousafrica.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	static InputStreamReader isr = new InputStreamReader(System.in);
	static BufferedReader in = new BufferedReader(isr); 
	
	public static void main(String[] args) throws IOException {
		
		String continuer;
		Metier metier = new Metier();
		System.out.println("Un programme vous permettant de faire un tree bulle d'une suite de nombre séparés par une virgule:(exp: 5,6,50,10,23,1,3)");
		do {
		
		System.out.println("Entrez des chiffres:");
		
		String entrer = in.readLine();
		
		System.out.println("Entrez l'ordre du tri (ASC | DESC):");
		
		String ordr = in.readLine();
		
		//affichage des données                
        System.out.println("Voici les chiffres ordonés:");
        System.out.println(metier.treebulle(entrer, ordr));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Voulez-vous reprendre? yes/no:");
        
        continuer = in.readLine();
        
		} while (continuer.equals("yes"));

	}

}
