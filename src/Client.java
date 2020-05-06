import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import settings.ApplicationProperties;
import settings.CalculatriceException;
import settings.ExceptionEnum;
import view.Interface;

public class Client {

	public static void main(String[] args) throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		String lang = "fr";
		
		if(lang.equals("fr"))
			ApplicationProperties.getInstance("C:\\Users\\Mike\\eclipse-workspace\\archiOOCalculatrice\\src\\welcome_fr.properties");
		else
			ApplicationProperties.getInstance("C:\\Users\\Mike\\eclipse-workspace\\archiOOCalculatrice\\src\\welcome_en.properties");
		
		System.out.println(ApplicationProperties.readProperty("welcome_client", "erreur"));
		
		
		Interface i = new Interface();
		while(true) {
			try {
				i.afficher();
			} catch (CalculatriceException e) {
				if(lang.equals("fr")) {
					System.out.println(ApplicationProperties.readProperty(ExceptionEnum.getNameFromCode(e.getCode()),""));
				}
				else {
					System.out.println("lang : "+lang);
					System.out.println(((CalculatriceException) e).getDefaultMessage());
				}
			}
		}
	}

}
