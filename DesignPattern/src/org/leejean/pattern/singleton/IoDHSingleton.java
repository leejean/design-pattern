package org.leejean.pattern.singleton;

/**
 * �򵥵���ģʽ-���Ž������(Initalization on Demand Holder IoDH)
 * @author leejean
 */
public class IoDHSingleton {
	/**
	 * ���캯��˽�л�,�ⲿ�಻��ʹ��new���������
	 */
	private IoDHSingleton() {
		System.out.println("�ұ���ʼ����...");
	}
	private static class HolderClass{
		private static final IoDHSingleton instance = new IoDHSingleton();
	}
	/**
	 * �����ȡʵ������<br>
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
