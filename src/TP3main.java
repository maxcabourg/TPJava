import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import fr.polymontp.cabourg.entreprise.Employe2;
import fr.polymontp.cabourg.entreprise.Entreprise2;
import fr.polymontp.cabourg.entreprise.SalaryComparator;


public class TP3main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entreprise2 e1 = new Entreprise2("MEGA ENTERPRISE OF THE WORLD");
		e1.addEmployee(new Employe2("Michel", 2000));
		e1.addEmployee(new Employe2("Marcel", 3000));
		e1.addEmployee(new Employe2("Albert", 2500));
		e1.addEmployee(new Employe2("Rrene", 2600));
		Entreprise2 e2 = new Entreprise2("irgopezrjtpoertjjort OF THE WORLD");
		e2.addEmployee(null);
		e2.addEmployee(new Employe2("Bob", 1500));
		
		
		System.out.println(e2);
		
		double totalSalaire = 0;
		Iterator it = e1.iterEmployes();
		while(it.hasNext()){
			totalSalaire += ((Employe2)it.next()).getSalaire();
		}
		System.out.println("Charges salariales = "+totalSalaire);
		
		e1.sort();
		Collections.sort(e1.getEmployes(), new SalaryComparator(true));
		System.out.println(e1);
		ArrayList fusion = new ArrayList();
		fusion.addAll(e1.getEmployes());
		fusion.addAll(e2.getEmployes());
		Collections.sort(e1.getEmployes(), new SalaryComparator(false));
		System.out.println("Reverse order "+e1);
		Collections.sort(fusion);
		System.out.println(fusion);
		
		//Question 4
		Map employes = new HashMap();
		employes.put("Fred", "Wilma");
		employes.put("Barney", "Betty");
		employes.put("Tristan", "Isolde");
		employes.put("Romeo", "Juliette");
		Set keys= employes.keySet();
	
		Iterator i=keys.iterator(); // on crée un Iterator pour parcourir notre HashSet
		Map employesReverse = new HashMap();
		while(i.hasNext()) // tant qu'on a un suivant
		{
			String current = i.next().toString();
			employesReverse.put((String)employes.get(current), current);
		}
		System.out.println(employesReverse);
	}

}
