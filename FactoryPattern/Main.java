package com.lava.FactoryPattern;
/*
 * ¿ØÖÆÌ¨
 */
public class Main {
	public static void main(String[] args) {
		Operation oa=new OperationFactory().getOper('+');
		oa.setNumberA(2);
		oa.setNumberB(3);
		System.out.println(oa.getResult());
	}
}
