package org.leejean.pattern.factory;

/**
 * ��ƷB
 * @author leejean
 */
public class ProductB extends Product{

	@Override
	public void methodDiff() {
		this.sameMethod();
		System.out.println("my name is B");
	}
	
}
