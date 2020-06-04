import java.io.File;

public class Elephant extends Animal{

	public Elephant(String name) {
		super(name, new File("sounds/elephant.wav"));
	}

	@Override
	public void speak() {
		System.out.println("                           ____");
		System.out.println("                      .---'-    \\");
		System.out.println("         .-----------/           \\");
		System.out.println("        /           (         ^  |   __");
		System.out.println("   &   (             \\        O  /  / .'");
		System.out.println("   '._/(              '-'  (.   (_.' /");
		System.out.println("        \\                    \\     ./");
		System.out.println("         |    |       |    |/ '._.'");
		System.out.println("          )   @).____\\|  @ |");
		System.out.println("      .  /    /       (    | ");
		System.out.println("     \\|, '_:::\\  . ..  '_:::\\ ..\\).");
		System.out.println("My name is " + this.getName() + " and I am a Elephant.");
		this.playAudio();
		System.out.println("\n");
	}

}
