import java.util.ArrayDeque;
import java.util.LinkedList;


enum Animal
{
	OURS,
	LION,
	ELEPHANT;
}


public class Etat {
	
	private LinkedList<Animal> bleu;
	private LinkedList<Animal> rouge;
	
	public Etat() 
	{
//		LinkedList<Animal> b1 = new LinkedList<>();
//		LinkedList<Animal> r1 = new LinkedList<>();
//		b1.add(Animal.ELEPHANT);
//		b1.add(Animal.LION);
//		b1.add(Animal.OURS);
//		r1.add(null);
//		
//		
//		Animal[][] situations = new Animal[][] {{},{},{}};
//		situations[0] = b1.toArray(new Animal[b1.size()]);
		
		
	}
	
	public Etat(ArrayDeque<Animal>b , ArrayDeque<Animal> r) 
	{
//		bleu = b;
//		rouge = r;
		
	}
	
	static void afficher() 
	{
		//une carte (situation)
		LinkedList<Animal> b1 = new LinkedList<>();
		LinkedList<Animal> r1 = new LinkedList<>();
		b1.add(Animal.ELEPHANT);
		b1.add(Animal.LION);
		b1.add(Animal.OURS);
		r1.add(null);
		//
		
		//Integration de la list b1 dans le tableau des situations
		Animal[][] situations = new Animal[][] {{},{},{}};
		situations[0] = b1.toArray(new Animal[b1.size()]);
		
		//Test d'affichage
		System.out.println(situations[0][0]);
		System.out.println(situations[0][1]);
		System.out.println(situations[0][2]);
		
	}



}
