package model;

import java.io.Serializable;

public class OperationModel implements Serializable {
	private double x;
	private String operation;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "OperationModel [x=" + x + ", y=" + y + "]";
	}

}
