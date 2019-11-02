package Probleme2;

public class RectInterf implements Comparable
{   // attributs (champs de donn�es, membres de donn�es)
	private int longueur, largeur;
	
	public RectInterf() { }
	public RectInterf(int lo, int largeur) 
	{ 
		longueur = lo;
		this.largeur = largeur;
	}
	
	public RectInterf(int c) {
		this(c, c);
	}
	
	// On s'engage � IMPL�MENTER la m�thode "plusPetit" (par ex. via surface)
	public boolean plusPetit(Object r) {
		
		RectInterf rectangle = (RectInterf)r; //Type casting
		return this.Aire() < rectangle.Aire();
		
	}
	public String toString() {
		
		return "<longueur : " + longueur + ", " + largeur + ", surface : " + Aire() + ">";
	}
	
	
	public int Aire () {
		
		return (longueur * largeur);
	}
}
