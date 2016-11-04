package fr.polymontp.cabourg.entreprise;

public class Employe2 implements Comparable{

	private String nom;
	private double salaire;
	
	public Employe2(String nom, double salaire){
		this.nom = nom;
		this.salaire = salaire;
	}
	
	public String toString(){
		return nom+" gagne "+salaire+" euros";
	}
	
	public double getSalaire(){
		return salaire;
	}
	
	public String getNom(){
		return nom;
	}

	@Override
	public int compareTo(Object o) {
		return nom.compareTo(((Employe2) o).getNom());
	}
	
}
