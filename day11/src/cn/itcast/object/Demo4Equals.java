package cn.itcast.object;

import cn.itcast.bean.Worker;

public class Demo4Equals {

	/**
	 * @param args
	 * alt + ctrl + 下键 向下复制一行
	 */
	public static void main(String[] args) {
		Worker w1 = new Worker("张三", 23);
		Worker w2 = new Worker("张三", 23);
		boolean b = w2.equals(w1);				//Object obj = w2;
		System.out.println(b);
		//Worker w3 = w2;
		//System.out.println(w2.equals(w3));
	}
	/*
	 *  public boolean equals(Object obj) {
        	return (this == obj);
    	}
	 */
}
