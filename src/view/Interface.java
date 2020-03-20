package view;


import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

import client.RequeteCalculatrice;
import controller.ControlOperation;
import model.Operation;
import settings.OperationFactory;

public class Interface {
	private Scanner sc = new Scanner(System.in);
	private ControlOperation controller;
	
	public void afficher() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		double a, b;
		String operation;
	
		controller = new ControlOperation();
		operation = sc.next();
		
		String elements[] = operation.split("\\+|\\-");
		
		a = Double.valueOf(elements[0]);
		
		for(char c: operation.toCharArray()) {
			if(!Character.isDigit(c)) {
				operation = String.valueOf(c);
			}
		}
		
		b = Double.valueOf(elements[1]);
		
		controller.setInterf(this);
		controller.checkOperation(a, operation, b);
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
