package org.leejean.pattern.singleton;

/**
 * �򵥵���ģʽ-����ʽ����ģʽ(Eager Singleton)
 * @author leejean
 *
 */
public class EagerSingleton {
	/**
	 * ���徲̬����
	 */
	private static final EagerSingleton instance = new EagerSingleton();
	/**
	 * ���캯��˽�л�,�ⲿ�಻��ʹ��new���������
	 */
	private EagerSingleton() {
		System.out.println("�ұ���ʼ����...");
	}
	/**
	 * �����ȡʵ������<br>
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
