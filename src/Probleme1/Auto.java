package Probleme1;

class Auto {
private String couleur;
private int prix;
private boolean enStock, preparee;

//Constructeur vide
public Auto (){}
 
//Constructeur 2 permettant d'initialiser le prix et 
//la couleur d'un objet Auto

public Auto (String couleur, int prix, boolean enStock, boolean preparee) {
	
	this.couleur = couleur;
	this.prix = prix;
	this.enStock = enStock;
	this.preparee = preparee;
}

public void estDisponible() {
//Messages � afficher si la voiture est en stock et pr�par�e
	if (enStock == true && preparee == true)
		System.out.println("La voiture est en stock et prepar�e!");
	else
		System.out.println("Malheureusement, la voiture n'est pas en stock ou n'est pas prepar�e!");
}

public void afficher() { 
	System.out.println("La couleur est: " + couleur);
	System.out.println("Le prix est: " + prix + ".00$");
	}

//Autres m�thodes
protected boolean getEnStock() {
	
	return enStock;
	}

protected boolean getPreparee() {
	
	return preparee;
	}

//M�thode bidon
int getAnFabr() {
	return 0;
	}

void setPrix(int prix) {
	
	this.prix = prix;
	}

int getPrix() {
	
	return prix;
	}
}

