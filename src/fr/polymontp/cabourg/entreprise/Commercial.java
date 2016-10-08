package fr.polymontp.cabourg.entreprise;

import java.io.*;
import java.util.StringTokenizer;

public class Commercial extends Employe {

    private double chiffreAffaires;
    private double salaire;

    public Commercial(String nom) {
        super(nom);
        chiffreAffaires = -1;
    }

    public Commercial(String nom, double ca, double salaire) {
        super(nom);
        chiffreAffaires = ca;
        this.salaire = salaire;
    }

    public double getCa(){
        return chiffreAffaires;
    }

    public double getSalaire(){
        return salaire + 0.01 * chiffreAffaires;
    }

    public void setInfosSalaire(double chiffreAffaires, double salaire) {
        this.chiffreAffaires = chiffreAffaires;
        this.salaire = salaire;
    }

    public void enregistreToi(FileWriter fw) throws IOException {
        fw.write(nom+" | "+chiffreAffaires+" | "+salaire);
        fw.flush();
        fw.close();
    }
    
    public void enregistreToiBinaire(DataOutputStream dos) throws IOException {
    	
    	dos.writeUTF(nom);
    	dos.writeDouble(chiffreAffaires);
    	dos.writeDouble(salaire);
    	dos.flush();
    	dos.close();
    }

    public static Commercial lire(FileReader fr) throws IOException{
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, "|");
        br.close();
        fr.close();
        return new Commercial(st.nextToken(), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
    }
    
    public static Commercial lireBinaire(DataInputStream dis) throws IOException{
    	
    	String name = dis.readUTF();
    	double ca = dis.readDouble();
    	double salaire = dis.readDouble();
    	return new Commercial(name, ca, salaire);
    }
}
