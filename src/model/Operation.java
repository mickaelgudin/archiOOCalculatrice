package model;

import settings.CalculatriceException;

public abstract class Operation {
	private double x;
	private double y;

	public abstract double calculer(double x, double y) throws CalculatriceException;

	public Operation() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
