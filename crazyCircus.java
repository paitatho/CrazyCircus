import java.util.Collection;
import java.util.LinkedList;
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
//		System.out.println("Tr�s bien, entrez le nom des joueurs :");
//		
//		//Enregistrement des joueurs
//		for(int i=0; i<nb; ++i) {
//			String nom = sc.next();
//			joueurs[i]=new Joueur(nom);
//		}
//		
//		Joueur.afficherJoueur();
		Etat etat = new Etat();
		//etat.afficher();  //Test pour voir affichage du tableau contenant les cartes 
		
		Etat etat2 = new Etat(etat);
		etat2.afficher();
		
		etat2.appliquerOrdre(Ordre.NI);
		etat2.afficher();
		//fonction pour convertir une suite d'actions en une liste d'ordre
//		LinkedList<Ordre> o = Ordre.parse("KILOSONIMA");
//		for(Ordre order : o) 
//		{
//			System.out.println(order);
//		}
		
		
		// ######### FIN TEST DE FONCTION ############
		
		
		
		// ######### Vrai code final ############
		//Partie nouvellePartie = new Partie();
		//nouvellePartie.start();
	}

}
