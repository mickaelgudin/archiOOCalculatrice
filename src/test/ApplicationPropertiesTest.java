package test;
import static org.junit.Assert.*;


import org.junit.Test;
import settings.ApplicationProperties;

	
	public class ApplicationPropertiesTest {
	
//	@Test
//	public void ApplicationPropertiesTest1() {

	
//	String lang = "fr";
//	
//	if(lang.equals("fr")) {
//		ApplicationProperties.getInstance("src/ressources/welcome_fr.properties");
//	}
//	else {
//		ApplicationProperties.getInstance("src/ressources/welcome_en.properties");
//
//		
//	}
//	
//	assertEquals("Bienvenue sur la partie serveur du programme de calculatrice",ApplicationProperties.readProperty("welcome_server", "erreur"));
//	
//	
//}
	@Test
	public void ApplicationPropertiesTest2() {
		String lang="en";
		
		if(lang.equals("fr")) {
			ApplicationProperties.getInstance("src/ressources/welcome_fr.properties");
		}
		else {
			ApplicationProperties.getInstance("src/ressources/welcome_en.properties");

			
		}
		
		assertEquals("Welcome to the server of calculator program",ApplicationProperties.readProperty("welcome_server", "erreur"));
		}	
	
}

