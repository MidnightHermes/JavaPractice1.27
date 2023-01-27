package JavaPractice;

public class Dog implements MainInterface {
	
	private String name;

	public Dog(String newName) {
		setName(newName);
	}
	
	@Override
	public String speak() {
		return "woof";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String newName) {
		name = newName;
	}

}
