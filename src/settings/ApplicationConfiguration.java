package settings;

import java.util.HashMap;
import java.util.Map;

import model.Addition;
import model.Division;
import model.Operation;
import model.Soustraction;

public class ApplicationConfiguration {
	public static Map<String, Operation> operationByChar = new HashMap<String, Operation>();
	
	public static void configuration() {
		operationByChar.put("+", new Addition());
		operationByChar.put("-", new Soustraction());
		operationByChar.put("/", new Division());
	}
}
