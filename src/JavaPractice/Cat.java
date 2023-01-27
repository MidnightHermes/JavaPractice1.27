package JavaPractice;

public class Cat implements MainInterface {
	
	private String name;

	public Cat(String newName) {
		setName(newName);
	}
	
	@Override
	public String speak() {
		return "meow";
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
