import fr.polymontp.cabourg.entreprise.*;
import java.io.*;

public class Paie {

    public static void main(String[] args){

        Employe c1 = new Commercial("Marcel", 20000, 2000);
        Employe c2 = new Commercial("C2");
        ((Commercial)c2).setInfosSalaire(15000.0, 400.0);
        Employe c3 = new Commercial("c3", 12500, 2250);
        Employe e1 = new EmployeStandard("Bibi", 30, 40, 15);
        Employe e2 = new EmployeStandard("e2", 50, 30, 10);

        Commercial[] commerciaux = {(Commercial) c1, (Commercial) c2, (Commercial) c3};
        Directeur d = Directeur.creerDirecteur("Boss", 500, commerciaux);

        Entreprise ent = new Entreprise(d, 10, 2);
        try{
            ent.ajouterEmploye(c1);
            ent.ajouterEmploye(c2);
            File f = new File("Commercial.txt");
            File f2 = new File("CommercialBinaire.txt");
            f.createNewFile();
            f2.createNewFile();
            FileWriter fw = new FileWriter(f);
            ((Commercial)c1).enregistreToi(fw);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2));
            ((Commercial)c1).enregistreToiBinaire(dos);
            
            System.out.println("Fini");
        }
        catch(EntrepriseSatureDeCommerciauxException e){
            e.printStackTrace();
            System.out.println("Impossible d'ajouter un commercial a cette entreprise car elle ne peut contenir que "+e.getEntreprise().getNbCommerciaux()+" commerciaux");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
