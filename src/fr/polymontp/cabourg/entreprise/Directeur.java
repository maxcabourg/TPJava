package fr.polymontp.cabourg.entreprise;

public class Directeur extends Employe {

    private double salaire;
    private Commercial[] commerciaux;
    private static Directeur directeur;

    private Directeur(String nom, double salaire, Commercial[] commerciaux){
        super(nom);
        this.salaire = salaire;
        this.commerciaux = commerciaux;
    }

    public static Directeur creerDirecteur(String nom, double salaire, Commercial[] commerciaux){

        if(directeur != null)
            return directeur;
        else{
            directeur = new Directeur(nom, salaire, commerciaux);
            return directeur;
        }
    }

    public void setInfosSalaire(double salaire, Commercial[] commerciaux){
        this.salaire = salaire;
        this.commerciaux = commerciaux;
    }

    public double getSalaire(){
        double salaireTotal = salaire;
        for(Commercial c: commerciaux)
            salaireTotal += 0.004 * c.getCa();

        return salaireTotal;
    }
}
