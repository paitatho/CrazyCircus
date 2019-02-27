import java.util.Scanner;

public class crazyCircus {

	public static void main(String[] args) {
		// ######### TEST DE FONCTION ############
		
		
//		System.out.println("Bienvenu dans le jeu Crazy Circus !");
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Combien de joueurs etes vous ?");
//		int nb = sc.nextInt();
//		
//		Joueur[] joueurs = new Joueur[nb]; //Creation d'un nouveau type Joueur
//		System.out.println("Très bien, entrez le nom des joueurs :");
//		
//		//Enregistrement des joueurs
//		for(int i=0; i<nb; ++i) {
//			String nom = sc.next();
//			joueurs[i]=new Joueur(nom);
//		}
//		
//		Joueur.afficherJoueur();
		
		Etat.afficher();  //Test pour voir affichage du tableau contenant les cartes 
		
		Ordre.afficherOrdre();
		
		// ######### FIN TEST DE FONCTION ############
		
		
		
		// ######### Vrai code final ############
		//Partie nouvellePartie = new Partie();
		//nouvellePartie.start();
	}

}
