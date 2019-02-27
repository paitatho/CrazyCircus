import java.util.ArrayList;
import java.util.Scanner;

public class Joueur 
{
	private String nom;
	private int points;
	private boolean jouer;
	private static ArrayList<String> joueurs = new ArrayList<>();
	
	
	public Joueur() {
		jouer = true;
		points = 0;
		nom = "";
		joueurs = new ArrayList<>();
	}
	
	
	public Joueur(String name) {
		jouer = true;
		points = 0;
		nom = name;
		joueurs.add(nom);
	}
	
	public static void afficherJoueur() {
		System.out.println(joueurs);
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
