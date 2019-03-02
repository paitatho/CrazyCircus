import java.util.ArrayDeque;
import java.util.LinkedList;


enum Animal
{
	OURS("OURS    "),
	LION("LION    "),
	ELEPHANT("ELEPHANT"),
	VIDE("");
	
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
		bleu.add(Animal.OURS);
		
		rouge.add(Animal.LION);
		rouge.add(Animal.OURS);
	}
	
	public Etat(LinkedList<Animal>b , LinkedList<Animal> r) 
	{
//		bleu = b;
//		rouge = r;
		
	}
	
//	static void afficher() 
//	{
//		//une carte (situation)
//		LinkedList<Animal> b1 = new LinkedList<>();
//		LinkedList<Animal> r1 = new LinkedList<>();
//		b1.add(Animal.ELEPHANT);
//		b1.add(Animal.LION);
//		r1.add(null);
//		//
//		
//		//Integration de la list b1 dans le tableau des situations
//		Animal[][] situations = new Animal[][] {{},{},{}};
//		situations[0] = b1.toArray(new Animal[b1.size()]);
//		
//		//Test d'affichage
//		System.out.println(situations[0][0]);
//		System.out.println(situations[0][1]);
//		System.out.println(situations[0][2]);
//		
//	}

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
		System.out.println(situations[0][0] + "             " + situations[0][1]);
		System.out.println(situations[1][0] + "      =>     " + situations[1][1]);
		System.out.println(situations[2][0] + "             " + situations[2][1]);
	}


}
