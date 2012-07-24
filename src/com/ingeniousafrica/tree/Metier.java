package com.ingeniousafrica.tree;

import java.util.Arrays;

public class Metier {
	
	public void triBulleDecroissant(int tableau[]) {
		int longueur = tableau.length;
		int tampon = 0;
		boolean permut;
 
		do {
			// hypothèse : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (tableau[i] < tableau[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					tampon = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	}
	
	public String treebulle(String entrer, String ordr){
		String[] tableauEnter = entrer.split(",");
		
		//Arrays.sort(tableauEnter);
		
		int[] tableauEntier = new int[tableauEnter.length];

        for(int i = 0; i < tableauEnter.length; i++){
        	tableauEntier[i] = Integer.parseInt(tableauEnter[i]);
        }
        if(ordr.equals("ASC") ){
        	Arrays.sort(tableauEntier);
        }else if(ordr.equals("DESC")){
        	
        	triBulleDecroissant(tableauEntier);
        	
        }else{
        	
        	return "Mauvaise reponse";
        }
        
        String chaine = ""+tableauEntier[0];
              
        for(int i = 1; i < tableauEntier.length; i++){
        	chaine +=  ","+tableauEntier[i];
        }
        return chaine;

	}
	
	
}
