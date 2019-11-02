package Probleme2;

//comment trier un tableau des objets COMPARABLES ?
public class Tri

//Utiliser la méthode plusPetit() de l'interface Comparable
{ public static void trier(Comparable[] tableau) {
	  Comparable tempo;
//Votre code
	  for (int i = 0; i < tableau.length; i++) {
		int indiceMinimum = i;
		
		for (int j = i + 1; j < tableau.length; j++) 
			if (tableau[j].plusPetit(tableau[indiceMinimum])) //La méthode plusPetit() fait déja la comparaison 
				indiceMinimum = j;
			
		if (indiceMinimum != i) {
			 tempo = tableau[i];
			 tableau[i] = tableau[indiceMinimum];
			 tableau[indiceMinimum] = tempo;
		}
	}
	  
	  
}
}
