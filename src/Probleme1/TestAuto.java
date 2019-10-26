package Probleme1;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création du tableau Auto
		Auto[] tableau = new Auto[4];
		
		//Tableau avec différentes sous-classes
		tableau[0] = new Ford ("Fuschia", 400000, true, true, 2016, "Ford", "GT");
		tableau[1] = new Chrysler ("Rose", 25000, true, false, 2017, "Chrysler", "300");
		tableau[2] = new Mazda ("Turquoise", 30000, false, true, 2016, "Mazda", "CX-9");
		tableau[3] = new Mercedes ("Violet", 848824, false, false, 2017, "Mercedes-Benz", "SLR McLaren");
		
		//Affichage du tableau
		for (int i = 0; i < tableau.length; i++) {
			
			tableau[i].afficher();
			System.out.println();
		}
		
		//Modifier le prix initial en ajoutant 2000 $ si l’année est 2017 
		//et en diminuant le prix initial de 200 $ si l’année est 2016
		for (int j = 0; j < tableau.length; j++) {
			
			if (tableau[j].getAnFabr() == 2016 ) 
				tableau[j].setPrix(tableau[j].getPrix() - 200);
			
			else if (tableau[j].getAnFabr() == 2017)
				tableau[j].setPrix(tableau[j].getPrix() + 2000);
		}
		
		System.out.println("Affichage des voitures avec le nouveau prix: ");
		
		for (int i = 0; i < tableau.length; i++) {
			
			tableau[i].afficher();
			System.out.println();
		}
		
	}
}
