package l07;

public class Human {
	
	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "My name " + name + " my age is " + age+ " HELP ME";
	}
	
	
	

}
