package settings;

import model.Operation;

public class OperationFactory {

	public static Operation initOperation(String ope) {
		ApplicationConfiguration.configuration();
		
		return ApplicationConfiguration.operationByChar.get(ope);
	}
}
