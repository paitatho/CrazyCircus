import java.util.ArrayDeque;
import java.util.LinkedList;


enum Animal
{
	OURS("OURS    "),
	LION("LION    "),
	ELEPHANT("ELEPHANT"),
	VIDE("        ");
	
  private String name = "";

  Animal(String name){
    this.name = name;
  }

  public String toString(){
    return name;
  }
}


public class Etat {
	
	private LinkedList<Animal> bleu;
	private LinkedList<Animal> rouge;
	
	public Etat() 
	{
		// initialisation au pif pour tester
		bleu = new LinkedList<>();
		rouge = new LinkedList<>();
		
		bleu.add(Animal.ELEPHANT);
		bleu.add(Animal.LION);
		
		rouge.add(Animal.OURS);
	}
	
	//constructeur de copie
	public Etat(Etat e) 
	{
		bleu = e.bleu;
		rouge = e.rouge;
	}
	
	public Etat(LinkedList<Animal>b , LinkedList<Animal> r) 
	{
//		bleu = b;
//		rouge = r;
	}

	// affichage de l'état sur une même ligne !
	void afficher() 
	{	
		//Integration de la list b1 dans le tableau des situations
		Animal[][] situations = new Animal[][] {{Animal.VIDE,Animal.VIDE},{Animal.VIDE,Animal.VIDE},{Animal.VIDE,Animal.VIDE}};
		int sizeB = bleu.size();
		int sizeR = rouge.size();
		int k = 2;
		for(int i = sizeB-1; i >=0;i--) 
		{
			situations[k][0] = bleu.get(i);
			k--;
		}
		k = 2;
		for(int i = sizeR-1; i >=0;i--) 
		{
			situations[k][1] = rouge.get(i);
			k--;
		}
		String espace = "     ";
		System.out.println(situations[0][0] + espace + situations[0][1]);
		System.out.println(situations[1][0] + espace + situations[1][1]);
		System.out.println(situations[2][0] + espace + situations[2][1]);
		System.out.println(" ------ " + espace + " ------ ");
		System.out.println("  BLEU  " + espace + "  ROUGE  \n\n");
		
	}
	// retourne true si tout s'est bien passé, false sinon
	boolean appliquerOrdre(Ordre o) 
	{
		Animal tmp1,tmp2;
		switch (o)
		{
			case KI:
				tmp1 = bleu.pollFirst();
				if(tmp1 != null)
					rouge.addFirst(tmp1);
				break;
			case LO:
				tmp1 = rouge.pollFirst();
				if(tmp1 != null)
					bleu.addFirst(tmp1);
				break;
			case SO:
				tmp1 = bleu.pollFirst();
				tmp2 = rouge.pollFirst();
				if(tmp1 != null && tmp2 != null) {
					bleu.addFirst(tmp2);
					rouge.addFirst(tmp1);
				}
				break;
			case NI:
				tmp1 = bleu.pollLast();
				if(tmp1 != null)
					bleu.addFirst(tmp1);
				break;
			case MA:
				tmp1 = rouge.pollLast();
				if(tmp1 != null)
					rouge.addFirst(tmp1);
				break;
			default:
				return false;	
		}
		return true;
	}


}
