package fr.polymontp.cabourg.entreprise;

public class EmployeStandard extends Employe {

    private int percent;
    private int nbWeeklyHours;
    private double tarifHoraire;

    public EmployeStandard(String nom) {
        super(nom);
        percent = -1;
    }

    public EmployeStandard(String nom, int percent, int nbWeeklyHours, int tarifHoraire) {
        super(nom);
        this.percent = percent;
        this.nbWeeklyHours = nbWeeklyHours;
        this.tarifHoraire = tarifHoraire;
    }

    public double getSalaire() {
        if(nbWeeklyHours > 35)
            return tarifHoraire * 35 + (nbWeeklyHours - 35) * (1 + percent / 100);
        else
            return tarifHoraire * nbWeeklyHours;
    }

    public void setInfosSalaire(int percent, int nbWeeklyHours, double tarifHoraire) {
        this.percent = percent;
        this.nbWeeklyHours = nbWeeklyHours;
        this.tarifHoraire = tarifHoraire;
    }
}
