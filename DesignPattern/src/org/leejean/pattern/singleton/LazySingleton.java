package org.leejean.pattern.singleton;

/**
 * �򵥵���ģʽ-����ʽ����ģʽ(Lazy Singleton)
 * @author leejean
 *
 */
public class LazySingleton {
	/**
	 * ���캯��˽�л�,�ⲿ�಻��ʹ��new���������
	 */
	private LazySingleton() {
		System.out.println("�ұ���ʼ����...");
	}
	/**
	 * ���徲̬����
	 */
	private volatile static LazySingleton instance = null;
	/**
	 * �����ȡʵ������<br>
	 * ����ʼ��������ʱ�����������synchronizedͬ������instance���ǿ���ʵ��������<br>
	 * ���Ǽ����synchronized�����ܻ����ۿ�
	 */
	synchronized public static LazySingleton getInstance(){
		if(null == instance){
			instance = new LazySingleton();
		}
		return instance;
	}
	public static LazySingleton getInstance2(){
		if(null == instance){//�ȴ��̲߳���֪����������������п��ܶ���ʵ����
			synchronized(LazySingleton.class){				
				instance = new LazySingleton();
			}
		}
		return instance;
	}
	public static LazySingleton getInstance3(){
		if(null == instance){//�ȴ��̲߳���֪����������������п��ܶ���ʵ����
			synchronized(LazySingleton.class){				
				if(null == instance){//˫�ؼ������(Double-check Locking)
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
