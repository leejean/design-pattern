package org.leejean.pattern.singleton;

/**
 * 简单单例模式-饿汉式单例模式(Eager Singleton)
 * @author leejean
 *
 */
public class EagerSingleton {
	/**
	 * 定义静态对象
	 */
	private static final EagerSingleton instance = new EagerSingleton();
	/**
	 * 构造函数私有化,外部类不能使用new来构造对象
	 */
	private EagerSingleton() {
		System.out.println("我被初始化了...");
	}
	/**
	 * 定义获取实例方法<br>
	 */
	 public static EagerSingleton getInstance(){
		return instance;
	}
	public static void main(String[] args) {
		EagerSingleton.getInstance();
		EagerSingleton.getInstance();
		EagerSingleton.getInstance();
		EagerSingleton.getInstance();
	}
}
