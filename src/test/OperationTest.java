package test;

import static org.junit.Assert.assertEquals;
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
		assertEquals((double)4.0,(double)model.getX(),0.0001);
		model.setOperation("+");
		assertEquals("+", model.getOperation());
		model.setY(2);
		assertEquals((double)2.0,(double)model.getY(),0.0001);
		assertEquals("OperationModel [x=4.0, y=2.0]",model.toString());
	}
	
	@Test
	void testSoustraction() throws CalculatriceException {
		OperationModel model = new OperationModel();
		model.setX(4);
		model.setOperation("-");
		model.setY(2);
		assertEquals((double)2.0, Calculate.calculate(model),0.0001);
	}

	@Test
	void testDivision() throws CalculatriceException {
		OperationModel model = new OperationModel();
		model.setX(6);
		model.setOperation("/");
		model.setY(2);
		assertEquals((double)3.0, Calculate.calculate(model),0.0001);
	}
	


}
