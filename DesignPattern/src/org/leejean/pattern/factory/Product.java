package org.leejean.pattern.factory;

/**
 * ��Ʒ����
 * @author leejean
 */
public abstract class Product {
	/**
	 * ������󷽷����ü̳е�����ȥʵ��
	 */
	public abstract void methodDiff();
	
	public void sameMethod(){
		System.out.println("i am a Product...");
	}
}
