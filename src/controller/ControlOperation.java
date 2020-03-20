package controller;

import java.io.IOException;
import java.net.UnknownHostException;

import client.RequeteCalculatrice;
import model.Addition;
import model.Operation;
import model.OperationModel;
import settings.OperationFactory;
import view.Interface;

public class ControlOperation {
	private Interface view;
	private Operation model;
	
	public ControlOperation() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		super();
	}

	public void checkOperation(double a, String ope, double b) {
		//model = OperationFactory.initOperation(ope);
		OperationModel model = new OperationModel();
		model.setX(a);
		model.setOperation(ope);
		model.setY(b);
		
		try {
			RequeteCalculatrice.call(model);
		} catch (ClassNotFoundException | IOException | InterruptedException e) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
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
