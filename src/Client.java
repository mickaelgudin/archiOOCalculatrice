import java.io.IOException;
import java.net.UnknownHostException;

import client.RequeteCalculatrice;
import model.Addition;
import settings.ApplicationProperties;
import view.Interface;

public class Client {

	public static void main(String[] args) throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		String lang = "fr";
		
		if(lang.equals("fr"))
			ApplicationProperties.getInstance("C:\\Users\\Mike\\eclipse-workspace\\archiOOCalculatrice\\src\\welcome_fr.properties");
		else
			ApplicationProperties.getInstance("C:\\Users\\Mike\\eclipse-workspace\\archiOOCalculatrice\\src\\welcome_en.properties");
		
		System.out.println(ApplicationProperties.readProperty("welcome", "erreur"));
		
		
		Interface i = new Interface();
		while(true) {
			
			i.afficher();
		}
	}

}
