package org.leejean.pattern.singleton;

/**
 * 简单单例模式-懒汉式单例模式(Lazy Singleton)
 * @author leejean
 *
 */
public class LazySingleton {
	/**
	 * 构造函数私有化,外部类不能使用new来构造对象
	 */
	private LazySingleton() {
		System.out.println("我被初始化了...");
	}
	/**
	 * 定义静态对象
	 */
	private volatile static LazySingleton instance = null;
	/**
	 * 定义获取实例方法<br>
	 * 若初始化方法耗时，如果不加入synchronized同步锁，instance还是可能实例化两次<br>
	 * 但是加入后synchronized，性能会大打折扣
	 */
	synchronized public static LazySingleton getInstance(){
		if(null == instance){
			instance = new LazySingleton();
		}
		return instance;
	}
	public static LazySingleton getInstance2(){
		if(null == instance){//等待线程并不知道创建结果，还是有可能二次实例化
			synchronized(LazySingleton.class){				
				instance = new LazySingleton();
			}
		}
		return instance;
	}
	public static LazySingleton getInstance3(){
		if(null == instance){//等待线程并不知道创建结果，还是有可能二次实例化
			synchronized(LazySingleton.class){				
				if(null == instance){//双重检查锁定(Double-check Locking)
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {
//		LazySingleton.getInstance();
//		LazySingleton.getInstance();
//		LazySingleton.getInstance();
//		LazySingleton.getInstance();
		
		LazySingleton.getInstance2();
		LazySingleton.getInstance2();
		LazySingleton.getInstance2();
		LazySingleton.getInstance2();
		
//		LazySingleton.getInstance3();
//		LazySingleton.getInstance3();
//		LazySingleton.getInstance3();
//		LazySingleton.getInstance3();
	}
}
