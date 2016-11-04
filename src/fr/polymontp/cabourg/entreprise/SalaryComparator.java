package fr.polymontp.cabourg.entreprise;

import java.util.Comparator;

public class SalaryComparator implements Comparator{

	public boolean ascending;
	
	public SalaryComparator(boolean ascending){
		this.ascending = ascending;
	}
	
	public SalaryComparator(){
		ascending = true;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Employe2 e1 = (Employe2) o1;
		Employe2 e2 = (Employe2) o2;
		if(ascending)
			return (int)(e1.getSalaire() - e2.getSalaire());
		else
			return -1*((int)(e1.getSalaire() - e2.getSalaire()));
	}

}
