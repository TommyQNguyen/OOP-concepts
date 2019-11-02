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
	  return "M mesure " + taille + " m�tres et p�se " + poids + " kgs";
  }
  
  // On s'engage � impl�menter la m�thode "plusPetit" :
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
