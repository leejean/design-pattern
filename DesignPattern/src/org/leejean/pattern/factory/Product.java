package org.leejean.pattern.factory;

/**
 * 产品基类
 * @author leejean
 */
public abstract class Product {
	/**
	 * 定义抽象方法，让继承的子类去实现
	 */
	public abstract void methodDiff();
	
	public void sameMethod(){
		System.out.println("i am a Product...");
	}
}
