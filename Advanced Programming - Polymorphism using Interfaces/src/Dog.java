import java.io.File;

public class Dog extends Animal{

	public Dog(String name) {
		super(name, new File("sounds/dog.wav"));
	}

	@Override
	public void speak() {
		System.out.println("   /^-----^\\");
		System.out.println("   V  o o  V");
		System.out.println("    |  Y  |");
		System.out.println("     \\ Q /");
		System.out.println("     / - \\");
		System.out.println("     |    \\");
		System.out.println("     |     \\     )");
		System.out.println("     || (___\\====");
		System.out.println("My name is " + this.getName() + " and I am a Dog.");
		this.playAudio();
		System.out.println("\n");
	}

}
