 import java.io.IOException;

import java.util.concurrent.TimeUnit;

import client.RequeteCalculatrice;
import controller.ControlOperation;
import model.Addition;
import serveur.ServiceCalculatrice;
import settings.ApplicationProperties;
import settings.CalculatriceException;
import settings.ExceptionEnum;
import view.Interface;

public class Serveur {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {
		String lang = "fr";
		
		if(lang.equals("fr"))
			ApplicationProperties.getInstance("src/ressources/welcome_fr.properties");
		else
			ApplicationProperties.getInstance("src/ressources/welcome_en.properties");

		System.out.println(ApplicationProperties.readProperty("welcome_server", "erreur"));	
		
		try {
			ServiceCalculatrice.lunch();
		} catch (CalculatriceException e) {
			if(lang.equals("fr")) {
				System.out.println(ApplicationProperties.readProperty(ExceptionEnum.getNameFromCode(e.getCode()),""));
			}
			else {
				System.out.println(((CalculatriceException) e).getDefaultMessage());
			}
		}
		
		
	}

}
