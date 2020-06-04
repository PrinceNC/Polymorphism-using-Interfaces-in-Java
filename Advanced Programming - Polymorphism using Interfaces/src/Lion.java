import java.io.File;

public class Lion extends Animal{

	public Lion(String name) {
		super(name, new File("sounds/lion.wav"));
	}

	@Override
	public void speak() {
		System.out.println("      /\";;:;;\"\\");
		System.out.println("    (:;/\\,-,/\\;;)");
		System.out.println("   (:;{  d b  }:;)");
		System.out.println("    (:;\\__Y__/;;)-----------,,_");
		System.out.println("     ,..\\  ,..\\      ___/___)__`\\");
		System.out.println("    (,,,)~(,,,)`-._##____________)");
		System.out.println("My name is " + this.getName() + " and I am a Lion");
		this.playAudio();
		System.out.println("\n");
	}

}
