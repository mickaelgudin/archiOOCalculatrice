package model;

import java.io.Serializable;

import settings.CalculatriceException;
import settings.ExceptionEnum;

public class Division extends Operation implements Serializable{

	@Override
	public double calculer(double x, double y) {//throws CalculatriceException {
		return x/y;
	}

}

