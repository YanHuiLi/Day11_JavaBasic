package cn.itcast.bean;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("学生吃饭");
	}
	
	public void sleep(){
		System.out.println("学生睡觉");
	}
	
	/*
	 *  public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
	 */
	
	public String toString() {
		return "我的姓名是:" +  name  + ",我的年龄是:" +  age;
	}
}