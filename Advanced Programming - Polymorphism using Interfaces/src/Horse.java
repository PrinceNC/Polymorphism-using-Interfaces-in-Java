import java.io.File;

public class Horse extends Animal {

	public Horse(String name) {
		super(name, new File("sounds/horse.wav"));
	}

	@Override
	public void speak() {
		System.out.println("                      ;;");
		System.out.println("                    ,;;'\\");
		System.out.println("         __       ,;;' ' \\");
		System.out.println("       /'  '\\'~~'~' \\ /'\\.)");
		System.out.println("    ,;(      )    /  |");
		System.out.println("   ,;' \\    /-.,,(   )");
		System.out.println("        ) /       ) /");
		System.out.println("        ||        ||");
		System.out.println("        (_\\       (_\\");
		System.out.println("My name is " + this.getName() + " and I am a Horse.");
		this.playAudio();
		System.out.println("\n");
	}

}
