package view;


import java.util.Scanner;

import controller.ControlOperation;

public class Interface {
	private Scanner sc = new Scanner(System.in);
	private ControlOperation controller;
	
	public void afficher() {
		double a, b;
		String operation;
	
		operation = sc.next();
		
		String elements[] = operation.split("\\+|\\-");
		
		a = Double.valueOf(elements[0]);
		
		for(char c: operation.toCharArray()) {
			if(!Character.isDigit(c)) {
				operation = String.valueOf(c);
			}
		}
		
		b = Double.valueOf(elements[1]);
		
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
