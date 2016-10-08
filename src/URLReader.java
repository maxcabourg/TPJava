import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


public class URLReader {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader(new File("adresses.txt"));
			BufferedReader br = new BufferedReader(fr);
			String lien;
			int compteur = 0;
			while((lien = br.readLine()) != null){
				URL url = new URL(lien);			
				String[] trucs = lien.split("\\.");
				String extension = trucs[trucs.length-1];
				File f = new File(extension);
				if(!f.isDirectory()){
					f.mkdir();
				}
				if(extension.equals("jpg") || extension.equals("png") || extension.equals("gif")){
					BufferedImage image = ImageIO.read(url);
					ImageIO.write(image, extension, new File(extension+"/image"+compteur+"."+extension));
					image.flush();
					compteur++;
				}			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
