package model;

import settings.CalculatriceException;
import settings.ExceptionEnum;
import settings.OperationFactory;

public class Calculate {

	public static double calculate(OperationModel operation) throws CalculatriceException {
		Operation ope = OperationFactory.initOperation(operation.getOperation());
		
			return ope.calculer(operation.getX(), operation.getY());
	}


}
