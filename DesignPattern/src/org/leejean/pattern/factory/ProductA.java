package org.leejean.pattern.factory;

/**
 * ��ƷA
 * @author leejean
 */
public class ProductA extends Product{

	@Override
	public void methodDiff() {
		this.sameMethod();
		System.out.println("my name is A");
	}
	
}
