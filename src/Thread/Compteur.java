package Thread;

public class Compteur extends Thread{
	
	private String nom;
	private int limite;
	
	public Compteur(String nom, int limite){
		this.nom = nom;
		this.limite = limite;
	}
	
	public void run(){
		
		for(int i = 0; i<=limite; i++){
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i == limite)
				System.out.println(nom+" a fini de compter jusqu'a "+limite);
			else
				System.out.println(nom+" : "+i);
		}
	}
}
