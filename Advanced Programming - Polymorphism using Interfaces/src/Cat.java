import java.io.File;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name, new File("sounds/cat.wav"));
	}

	@Override
	public void speak() {
		System.out.println("      ,_     _,");
		System.out.println("      |\\\\___//|");
		System.out.println("      |=6   6=|");
		System.out.println("      \\=._Y_.=/");
		System.out.println("      )  `  (    ,");
		System.out.println("      /       \\  ((");
		System.out.println("      |       |   ))");
		System.out.println("     /| |   | |\\_//");
		System.out.println("     \\| |._.| |/-`");
		System.out.println("      '\"'   '\"'");
		System.out.println("My name is " + this.getName() + " and I am a cat.");
		this.playAudio();
		System.out.println("\n");
	}
}
