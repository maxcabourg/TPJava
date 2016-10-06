import fr.polymontp.cabourg.entreprise.*;
import java.io.*;

public class CommercialReader{

    public static void main(String[] args){

        try
        {
            FileReader fr = new FileReader("../src/Commercial.txt");
            Commercial commercial = Commercial.lire(fr);
            System.out.println(commercial.getNom()+" gagne "+commercial.getSalaire());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
