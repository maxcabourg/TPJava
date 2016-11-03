package fr.polymontp.cabourg.entreprise;

import java.util.ArrayList;
import java.util.Iterator;

public class Entreprise2 {

	private String name;
	private ArrayList employes;
	
	public Entreprise2(String name){
		this.name = name;
		employes = new ArrayList();
	}
	
	public void addEmployee(Employe2 e){
		if(e != null)
			employes.add(e);
	}
	
	public boolean deleteEmployee(Employe2 e){
		return employes.remove(e);
	}
	
	@Override
	public String toString(){
		String description = new String(name+"\n");
		for(int i = 0; i<employes.size(); i++){ 
			description += employes.get(i).toString()+"\n";
		}
		return description;
	}
	
	public Iterator iterEmployes(){
		return employes.iterator();
	}
}
