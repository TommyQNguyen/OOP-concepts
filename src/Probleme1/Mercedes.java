package Probleme1;

public class Mercedes extends Auto
{
 private int anFabrication;
 private String marque, modele;
 int NouvPrix;
 
 //Constructeur 1
public Mercedes (){}

//Constructeur 2. Faire appel au constructeur de la super classe
public Mercedes (String couleur, int prix, boolean enStock, boolean preparee, int anFabrication, String marque, String modele)
{
	super(couleur, prix, enStock, preparee); //Appelle le constructeur parent Auto();
	this.anFabrication = anFabrication;
	this.marque = marque;
	this.modele = modele;
}
//redéfinition de la méthode estDisponible() de la super classe
public void estDisponible()
{
	if (getEnStock() == false) 
		System.out.println(marque + " " + modele + " à commander !!");
		 
	else if (getPreparee() == false)
		System.out.println(marque + " " + modele + " en stock, mais pas prête !!");
		
		super.estDisponible();
}
 public void afficher()  //redéfinition de la méthode afficher() de la super classe
{
	 super.afficher();
	 System.out.println("La marque est: " + marque);
	 System.out.println("Le modèle est: " + modele);
	 System.out.println("L'année de fabrication est: " + anFabrication);
	 estDisponible();

}
 
int getAnFabr(){
	return anFabrication;
	}
}