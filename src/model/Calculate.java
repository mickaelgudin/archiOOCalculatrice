package model;

import settings.OperationFactory;

public class Calculate {

	public static double calculate(OperationModel operation) {
		Operation ope = OperationFactory.initOperation(operation.getOperation());
		
		return ope.calculer(operation.getX(), operation.getY());
	}

}
