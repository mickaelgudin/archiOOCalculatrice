package view;


import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

import client.RequeteCalculatrice;
import controller.ControlOperation;
import model.Operation;
import settings.CalculatriceException;
import settings.ExceptionEnum;
import settings.OperationFactory;

public class Interface {
	private Scanner sc = new Scanner(System.in);
	private ControlOperation controller;
	
	public void afficher() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException, CalculatriceException {
		
		String operation;
	
		controller = new ControlOperation();
		operation = sc.next();
		
		String elements[] = operation.split("\\+|\\-|\\/");
		
		controller.setInterf(this);
		
		controller.decomposeOperation(elements, operation);
		
	}
	
	public void afficherResultat(double result) {
		
		System.out.println("= "+result);
	}

	public ControlOperation getControl() {
		return controller;
	}

	public void setControl(ControlOperation control) {
		this.controller = control;
	}	
}
