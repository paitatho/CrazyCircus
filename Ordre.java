import java.util.LinkedList;

public enum Ordre 
{
	KI,
	LO,
	SO,
	NI,
	MA;
	
	public static void afficherOrdre()
	{
		System.out.print("-------------------------------------\n");
		System.out.print("KI : BLEU --> ROUGE    NI : BLEU ^ \n");
		System.out.print("LO : BLEU <-- ROUGE    MA : ROUGE ^ \n");
		System.out.print("SO : BLEU <--> ROUGE \n");
	}
	
	//fonction pour convertir la chaine de caractère donné par l'utilisateur en une suite d'ordres
	public static LinkedList<Ordre> parse(String actions)
	{
		LinkedList<Ordre> ordres = new LinkedList<Ordre>();
		
		
		return ordres;
	}
}
