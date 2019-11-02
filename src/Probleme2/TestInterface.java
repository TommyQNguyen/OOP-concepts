package Probleme2;

public class TestInterface
{
	// afficher le tableau d'objets (PersInterfs, RectInterfs, ...) Utiliser l'appel automatique de la 
	//méthode toString() de chaque objet
	static void afficher(Object [] obj, String message) {
		
		System.out.println(message);
		for (int i = 0; i < obj.length; i++) 
			System.out.println(obj[i]);
	}
	
	public static void main (String[] args)
	{   
		PersInterf pers[] = new PersInterf[5];	//Créer un tableau de 5 objets PersInterf. Voir l'exécution
		pers[0] = new PersInterf(1.75, 65.3, 'M');
		pers[1] = new PersInterf(1.62, 69.1, 'F');
		pers[2] = new PersInterf(1.89, 76.5, 'F');
		pers[3] = new PersInterf(1.45, 50.3, 'M');
		pers[4] = new PersInterf(1.77, 90.1, 'M');
		
		//Afficher la liste des PersInterfs avant le tri. Méthode afficher() de cette classe
		afficher(pers, "Liste des PersInterfs avant le tri");
		//Effectuer le tri en utilisant la méthode statique trier()
		Tri.trier(pers);
		//Afficher la liste des PersInterfs après le tri. Méthode afficher()de cette classe
		System.out.println();
		afficher(pers, "Liste des PersInterfs après le tri");

		
		RectInterf rect[] = new RectInterf[4]; 	//Créer un tableau de 4 objets RectInterf. Voir l'exécution
		rect[0] = new RectInterf(12, 5);
		rect[1] = new RectInterf(9, 6);
		rect[2] = new RectInterf(60, 12);
		rect[3] = new RectInterf(5, 12);
		
		//Afficher la liste des RectInterfs avant le tri. Méthode afficher()de cette classe
		System.out.println();
		afficher(rect, "Liste des RectInterfs avant le tri selon la surface :");
		//Effectuer le tri en utilisant la méthode statique trier()
		Tri.trier(rect);
		//Afficher la liste des RectInterfs après le tri. Méthode afficher() de cette classe;
		System.out.println();
		afficher(rect, "Liste des RectInterfs après le tri selon la surface :");
	}		
}
/* Exécution :
Liste des PersInterfs avant le tri
M mesure 1.75 metre et pese 65.3 kgs
F mesure 1.62 metre et pese 69.1 kgs
F mesure 1.89 metre et pese 76.5 kgs
M mesure 1.45 metre et pese 50.3 kgs
M mesure 1.77 metre et pese 90.1 kgs

Liste des PersInterfs apres le tri
M mesure 1.45 metre et pese 50.3 kgs
F mesure 1.62 metre et pese 69.1 kgs
M mesure 1.75 metre et pese 65.3 kgs
M mesure 1.77 metre et pese 90.1 kgs
F mesure 1.89 metre et pese 76.5 kgs

Liste des RectInterfs avant le tri selon la surface : 
<longueur : 12, 5, surface : 60>
<longueur : 9, 6, surface : 54>
<longueur : 60, 12, surface : 720>
<longueur : 5, 12, surface : 60>

Liste des RectInterfs apres selon la surface : 
<longueur : 9, 6, surface : 54>
<longueur : 12, 5, surface : 60>
<longueur : 5, 12, surface : 60>
<longueur : 60, 12, surface : 720>
*/