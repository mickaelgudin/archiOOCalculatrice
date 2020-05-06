package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Addition;
import model.Calculate;
import model.Operation;
import model.OperationModel;
import settings.CalculatriceException;

class OperationTest {
	
	@Test
	void testAddition() throws CalculatriceException {
		OperationModel model = new OperationModel();
		model.setX(4);
		model.setOperation("+");
		model.setY(2);
		assertEquals(6, Calculate.calculate(model));
	}
	
	@Test
	void testSoustraction() throws CalculatriceException {
		OperationModel model = new OperationModel();
		model.setX(4);
		model.setOperation("-");
		model.setY(2);
		assertEquals(2, Calculate.calculate(model));
	}

	@Test
	void testDivision() throws CalculatriceException {
		OperationModel model = new OperationModel();
		model.setX(6);
		model.setOperation("/");
		model.setY(2);
		assertEquals(3, Calculate.calculate(model));
	}

}
