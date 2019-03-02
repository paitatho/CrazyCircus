import java.util.LinkedList;

public enum Ordre 
{
	KI,
	LO,
	SO,
	NI,
	MA,
	UNKNOW;
	
	public static void afficherOrdre()
	{
		System.out.print("-------------------------------------\n");
		System.out.print("KI : BLEU --> ROUGE    NI : BLEU ^ \n");
		System.out.print("LO : BLEU <-- ROUGE    MA : ROUGE ^ \n");
		System.out.print("SO : BLEU <--> ROUGE \n\n");
	}
	
	private static Ordre toOrdre(String action) {
		if(action.equals("KI"))
			return KI;
		else if(action.equals("LO") )
			return LO;
		else if(action.equals("SO") )
			return SO;
		else if(action.equals("NI") )
			return NI;
		else if(action.equals("MA") )
			return MA;
		return UNKNOW;
	}
	
	//fonction pour convertir la chaine de caractère donné par l'utilisateur en une suite d'ordres
	public static LinkedList<Ordre> parse(String actions)
	{
		LinkedList<Ordre> ordres = new LinkedList<Ordre>();
		//pas le bon nombre d'actions
		
		if(actions.length()%2 !=0)
			return ordres;
		String tmp;
		for(int i = 0; i<actions.length();i =i+2) 
		{
			tmp = actions.substring(i, i +2);
			Ordre o = toOrdre(tmp);
			ordres.add(o);
		}
		
		return ordres;
	}
}
