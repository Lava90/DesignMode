package com.lava.FactoryPattern;
/*
 * 工厂模式
 */
public class OperationFactory {
	public Operation getOper(char c){
		Operation op=null;
		switch (c){
			case '+':
				 op=new OperationAdd();
				break;
			case '-':
				 op=new OperationSub();
				break;
			case '*':
				 op=new OperationMul();
				break;
			case '/':
				 op=new OperationDiv();
				break;
		}
		return op;
	}
}
