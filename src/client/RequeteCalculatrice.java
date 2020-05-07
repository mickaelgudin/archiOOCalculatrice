package client;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Operation;
import model.OperationModel;
import settings.ApplicationProperties;
import settings.CalculatriceException;
import settings.ExceptionEnum;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class RequeteCalculatrice {
    private static final Logger LOGGER = Logger.getLogger( RequeteCalculatrice.class.getName() );
    
    private static int PORT = 33001;
    
    public static double call(OperationModel model) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        InetAddress host = InetAddress.getLocalHost();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        Socket socket = new Socket(host.getHostName(), PORT);
        
        oos = new ObjectOutputStream(socket.getOutputStream());
        LOGGER.log(Level.INFO, ApplicationProperties.readProperty("connection",""));
        
        
        LOGGER.log(Level.INFO, ApplicationProperties.readProperty("send_request",""));
        oos.writeObject(model);
        
        ois = new ObjectInputStream(socket.getInputStream());
        
        double result = 0;
        try {
        	result = (double) ois.readObject();
        	LOGGER.log(Level.INFO, ApplicationProperties.readProperty("request_received","")+ result);
        } catch(SocketException e) {
        	e.getMessage();
        	LOGGER.log(Level.INFO, ApplicationProperties.readProperty("erreur_serveur",""));
        	System.exit(1);
        }       
      
        socket.close();

        return result;
    }
}

