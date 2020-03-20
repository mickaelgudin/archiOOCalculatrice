package model;

import java.io.Serializable;

public class Addition extends Operation implements Serializable{

	@Override
	public double calculer(double x, double y) {
		return x+y;
	}
	
}
