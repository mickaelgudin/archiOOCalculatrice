package serveur;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Calculate;
import model.Operation;
import model.OperationModel;
import settings.ApplicationProperties;
import settings.CalculatriceException;
import settings.ExceptionEnum;

public class ServiceCalculatrice {
	private static final Logger LOGGER = Logger.getLogger( ServiceCalculatrice.class.getName() );
	
    private static ServerSocket server;
    private static int PORT = 33001;
    
    public static void lunch() throws IOException, ClassNotFoundException, CalculatriceException{
    	server = new ServerSocket(PORT);
	    LOGGER.log(Level.INFO, ApplicationProperties.readProperty("server_run",""));
    	
        while(true){
        	Socket socket = server.accept();
        	LOGGER.log(Level.INFO, ApplicationProperties.readProperty("connection_set",""));
	            
        	
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            OperationModel operation = (OperationModel) ois.readObject();
            
            if(operation.getY() == 0 && operation.getOperation().equals("/")) {
            	throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(), ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage());
            }
            
            LOGGER.log(Level.INFO, ApplicationProperties.readProperty("message","")+ operation);
            
            double result = Calculate.calculate(operation);
            oos.writeObject(result);
           
            LOGGER.log(Level.INFO, ApplicationProperties.readProperty("response","") + result);



        }
    }

}