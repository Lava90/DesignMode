package com.lava.FactoryPattern;
/*
 * 作为加减乘除的基类。
 */
public abstract class Operation {
	public  double numberA;
	public  double numberB;
	
	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public abstract double getResult();
}
