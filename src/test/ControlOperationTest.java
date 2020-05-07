package test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.Test;

import controller.ControlOperation;
import model.Calculate;
import settings.CalculatriceException;


	public class ControlOperationTest{
	

		@Test
		public void testDecomposeOperation() throws IOException, InterruptedException, CalculatriceException, ClassNotFoundException {
			ControlOperation ctrlOp = new ControlOperation();
			String[] elements = {"2","5"};
			String operation = "+";
			ctrlOp.decomposeOperation(elements,operation);
			assertEquals((double)7.0,(double)Calculate.calculate(ctrlOp.getModel()),0.0001);
			
		}
		
		@Test(expected=CalculatriceException.class)
		public void testDecomposeOperation2() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException, CalculatriceException {
			ControlOperation ctrlOp = new ControlOperation();
			String[] elements = {"2AE","5"};
			String operation = "+";
			ctrlOp.decomposeOperation(elements,operation);

			
		}
		@Test(expected=CalculatriceException.class)
		public void testDecomposeOperation3() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException, CalculatriceException {
			ControlOperation ctrlOp = new ControlOperation();
			String[] elements = {"2","5","3"};
			String operation = "+";
			ctrlOp.decomposeOperation(elements,operation);

			
		}
		
	}

