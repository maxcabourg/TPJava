import Thread.Compteur;


public class ThreadMain {

	public static void main(String[] args){
		
		Compteur c1 = new Compteur("Compteur 1", 10);
		Compteur c2 = new Compteur("Compteur 2", 10);
		c1.start();
		c2.start();
	}
}
