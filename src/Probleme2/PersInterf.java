package Probleme2;

public class PersInterf implements Comparable 
{ 
	private double taille, poids;
	private char sexe;
  
  public PersInterf(double t, double p, char s) 
  {
	  taille = t;
	  poids = p;
	  sexe = s;
  }
  
  public String toString() 
  {
	  return "M mesure " + taille + " mètres et pèse " + poids + " kgs";
  }
  
  // On s'engage à implémenter la méthode "plusPetit" :
  public boolean plusPetit(Object p) {
	  
	 PersInterf param = (PersInterf) p; //Type casting 
	 return (this.getTaille() < param.getTaille());
  }
  
  
  /*
   * main
   * hana, jihyeon
   * hana.plusPetit(jihyeon);
   */
  
  public double getTaille() 
  {
	  return taille;
  }
}
