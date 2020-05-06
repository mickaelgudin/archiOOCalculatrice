package controller;

import java.io.IOException;
import java.net.UnknownHostException;

import client.RequeteCalculatrice;
import model.Addition;
import model.Operation;
import model.OperationModel;
import settings.CalculatriceException;
import settings.ExceptionEnum;
import settings.OperationFactory;
import view.Interface;

public class ControlOperation {
	private Interface view;
	private Operation model;
	
	public ControlOperation() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		super();
	}
	
	public void decomposeOperation(String elements[], String operation) throws CalculatriceException {
		if(elements.length != 2) {
			throw new CalculatriceException(ExceptionEnum.UNKNOWN_OPERATION.getCode(), ExceptionEnum.UNKNOWN_OPERATION.getDefaultMessage());
		}
		
		double a, b;
		
		a = Double.valueOf(elements[0]);
		
		for(char c: operation.toCharArray()) {
			if(!Character.isDigit(c)) {
				operation = String.valueOf(c);
			}
		}
		
		b = Double.valueOf(elements[1]);
		
		this.checkOperation(a, operation, b);
	}
	

	public void checkOperation(double a, String ope, double b) {
		OperationModel model = new OperationModel();
		model.setX(a);
		model.setOperation(ope);
		model.setY(b);
		
		try {
			RequeteCalculatrice.call(model);
		} catch (ClassNotFoundException | IOException | InterruptedException e) {
			e.printStackTrace();
		} 
		
	}
	
	public Interface getInterf() {
		return view;
	}
	
	public void setInterf(Interface interf) {
		this.view = interf;
	}
}
