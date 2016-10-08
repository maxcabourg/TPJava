import fr.polymontp.cabourg.entreprise.*;
import java.io.*;

public class CommercialReader{

    public static void main(String[] args){

        try
        {
            FileReader fr = new FileReader("Commercial.txt");
            Commercial commercial = Commercial.lire(fr);
            //System.out.println(commercial.getNom()+" gagne "+commercial.getSalaire());
            DataInputStream dis = new DataInputStream(new FileInputStream("CommercialBinaire.txt"));
            Commercial c2 = Commercial.lireBinaire(dis);
            System.out.println(c2.getNom()+" "+c2.getCa()+" "+c2.getSalaire());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
