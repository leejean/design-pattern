package org.leejean.pattern.factory;

public class ProductFactory {
	public static Product getProduct(String args){
		Product product = null;
		if(args.equals("A")){
			product = new ProductA();
		}
		if(args.equals("B")){
			product = new ProductB();
		}
		return product;
	}
	public static void main(String[] args) {
		ProductFactory.getProduct("A").methodDiff();
		ProductFactory.getProduct("B").methodDiff();
	}
}
