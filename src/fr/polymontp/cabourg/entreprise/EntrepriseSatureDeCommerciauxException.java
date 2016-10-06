package fr.polymontp.cabourg.entreprise;

public class EntrepriseSatureDeCommerciauxException extends Exception{

    private Entreprise entreprise;

    public EntrepriseSatureDeCommerciauxException(Entreprise e){
        super();
        entreprise = e;
    }

    public Entreprise getEntreprise(){
        return entreprise;
    }
}
