import java.io.IOException;
import java.net.UnknownHostException;

import client.RequeteCalculatrice;
import model.Addition;
import view.Interface;

public class Client {

	public static void main(String[] args) throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		Interface i = new Interface();
		while(true) {
			
			i.afficher();
		}
	}

}
