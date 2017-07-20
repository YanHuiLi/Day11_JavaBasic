package cn.itcast.object;

public class Demo1Hashcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object obj = new Object();
		int x = obj.hashCode();
		System.out.println(x);
	}

}
