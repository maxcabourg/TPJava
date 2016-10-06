package fr.polymontp.cabourg.entreprise;

public abstract class Employe {

    protected String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    public abstract double getSalaire();
}
