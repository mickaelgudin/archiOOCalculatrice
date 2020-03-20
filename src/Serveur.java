 import java.io.IOException;
import java.util.concurrent.TimeUnit;

import client.RequeteCalculatrice;
import controller.ControlOperation;
import model.Addition;
import serveur.CalculatriceException;
import serveur.ServiceCalculatrice;
import view.Interface;

public class Serveur {

	public static void main(String[] args) throws ClassNotFoundException, IOException, CalculatriceException, InterruptedException {
		ServiceCalculatrice.lunch();
	}

}
