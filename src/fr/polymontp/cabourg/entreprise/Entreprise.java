package fr.polymontp.cabourg.entreprise;

public class Entreprise{

    private Directeur directeur;
    private Employe[] employes;
    private int nbCommerciaux;

    public Entreprise(Directeur directeur, int nbEmployes, int nbCommerciaux){
        this.directeur = directeur;
        this.employes = new Employe[nbEmployes];
        this.nbCommerciaux = nbCommerciaux;
    }

    public void ajouterEmploye(Employe e) throws EntrepriseSatureDeCommerciauxException{
        int compteur = 0;
        for(Employe em: employes){
            if(em instanceof Commercial)
                compteur++;
        }
        if(compteur >=nbCommerciaux)
            throw new EntrepriseSatureDeCommerciauxException(this);
        else{
                int nbEmployes = 0;
                while(employes[nbEmployes] != null)
                    nbEmployes++;
                if(nbEmployes < employes.length)
                    employes[nbEmployes] = e;
            }
    }

    public int getNbCommerciaux(){
        return nbCommerciaux;
    }
}
