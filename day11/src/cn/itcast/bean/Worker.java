package cn.itcast.bean;

public class Worker {
	private String name;
	private int age;
	public Worker() {
		super();
		
	}
	public Worker(String name, int age) {
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

	public String toString() {
		return name + "," + age;
	}
	
	/*
	 *  public boolean equals(Object obj) {
        	return (this == obj);
    	}
	*/
	public boolean equals(Object obj) {	//Object obj = new Worker();
		Worker w = (Worker)obj;
		return this.name.equals(w.name) && this.age == w.age;
	} 
}
