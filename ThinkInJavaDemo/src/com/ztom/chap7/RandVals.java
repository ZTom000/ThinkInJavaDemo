package com.ztom.chap7;

//Initializing interface fields with 
//non-constant initializers
public interface RandVals {
	int rint = (int) (Math.random() * 10);
	long rlong = (long) (Math.random() * 10);
	float rfloat = (float) (Math.random() * 10);
	double rdouble = (double) (Math.random() * 10);
}
