
public class Joueur 
{
	private String nom;
	private int points;
	private boolean jouer;
	
	
	public Joueur() {
		jouer = true;
		points = 0;
		nom = "";
	}
	
	
	public Joueur(String name) {
		jouer = true;
		points = 0;
		nom = name;
	}
	
	public void gagne() 
	{
		points++;
	}
	
	public void setJouer(boolean bool)
	{
		jouer = bool;
	}
}
