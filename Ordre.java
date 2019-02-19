
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
		System.out.print("KI : BLEU <--> ROUGE \n");
	}
}
