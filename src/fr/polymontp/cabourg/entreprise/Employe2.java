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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
