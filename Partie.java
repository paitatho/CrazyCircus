import java.util.ArrayDeque;

public class Partie 
{
	ArrayDeque<Joueur> joueurs;
	ArrayDeque<Situation> situations;
	Situation situationCourante;
	
	public Partie() {
		
	}
	
	
	private void init() {
		// récupérer tous les joueurs
		initSituation();
	}
	
	private void initSituation() {
		// initialiser toutes les situations possibles
	}
	
	private void changeSituation() {
		// prend une situation au hasard dans la liste et la met dans situationCourante
	}
	
	public void start() 
	{
		init();
		while(situations.size() > 0)
		{
			changeSituation();
			//ici que ce déroule la prise des réponses des joueurs et toutes la partie en générale... 
		}
		
	}
	
}
