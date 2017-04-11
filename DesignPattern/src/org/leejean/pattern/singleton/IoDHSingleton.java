package org.leejean.pattern.singleton;

/**
 * 简单单例模式-最优解决方案(Initalization on Demand Holder IoDH)
 * @author leejean
 */
public class IoDHSingleton {
	/**
	 * 构造函数私有化,外部类不能使用new来构造对象
	 */
	private IoDHSingleton() {
		System.out.println("我被初始化了...");
	}
	private static class HolderClass{
		private static final IoDHSingleton instance = new IoDHSingleton();
	}
	/**
	 * 定义获取实例方法<br>
	 */
	 public static IoDHSingleton getInstance(){
		return HolderClass.instance;
	}
	public static void main(String[] args) {
		IoDHSingleton.getInstance();
		IoDHSingleton.getInstance();
		IoDHSingleton.getInstance();
		IoDHSingleton.getInstance();
	}
}
