import java.io.File;

public class Human implements SpeakableInterface {

	private String name;
	private String gender;
	private int age;
	private String hobby;
	private String talent;
	private File audioFile;
	
	public Human() {
		
	}

	public Human(String name, String gender, int age, String hobby, String talent) {
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setHobby(hobby);
		this.setTalent(talent);
		
		//	Set audio based on gender.
		switch(this.gender) {
			case "Male":
			case "male":
				this.setAudioFile(new File("sounds/male.wav"));;
				break;
				
			case "Female":
			case "female":
				this.setAudioFile(new File("sounds/female.wav"));;
				break;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getTalent() {
		return talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

	public File getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(File audioFile) {
		this.audioFile = audioFile;
	}
	
	private String male() {
		return
				"          .-\"\"-." 			+ "\n" +
				"         /-.{}  \\" 			+ "\n" +
				"         | _\\__.|" 			+ "\n" +
				"         \\/^)^ \\/" 			+ "\n" +
				"          \\ =  /" 			+ "\n" +
				"     .---./`--`\\.--._" 		+ "\n" +
				"    /     `;--'`     \\" 		+ "\n" +
				"   ;        /`       ;" 		+ "\n" +
				"   |       |*        |" 		+ "\n" +
				"   /   |   |     |    \\" 		+ "\n" +
				"   |    \\  |*    /    |" 		+ "\n" +
				"   \\_   |\\_|____/|  __/" 	+ "\n" +
				"     \\__//======\\\\__/" 		+ "\n" +
				"     / //_      _\\\\ \\" 		+ "\n" +
				"     -'  |`\"\"\"\"`|  `-" 	+ "\n" +
				"         |  L   |" 			+ "\n" +
				"         >_ || _<" 			+ "\n" +
				"         |  ||  |" 			+ "\n" +
				"         |  ||  |" 			+ "\n" +
				"        /   ||   \\" 			+ "\n" +
				"       /    /,    \\" 			+ "\n" +
				"        `|\"|`\"|\"|\"`" 		+ "\n" +
				"        /  )  /  )" 			+ "\n" +
				"       /__/  /__/"
				;
	}
	
	private String female() {
		return 
				"    /////////////\\\\\\\\" 	+ "\n" +
				"   (((((((((((((( \\\\\\\\" 	+ "\n" +
				"   ))) ~~      ~~  (((" 		+ "\n" +
				"   ((( (*)     (*) )))" 		+ "\n" +
				"   )))     <       (((" 		+ "\n" +
				"   ((( '\\______/`  )))" 		+ "\n" +
				"          _) (_" + "\n" 		+ "\n" +
				"         / \\_/ \\" 			+ "\n" +
				"        /(     )\\" 			+ "\n" +
				"       // )___( \\\\" 			+ "\n" +
				"       \\\\(     )//" 			+ "\n" +
				"        (       )" 			+ "\n" +
				"         |  |  |"				+ "\n" +
				"          | | |"				+ "\n" +
				"          | | |" 				+ "\n" +
				"         _|_|_|_"
				;
	}

	@Override
	public void speak() {
		//	Get
		switch(this.gender) {
			case "Male":
			case "male":
				System.out.println(this.male());
				break;
				
			case "Female":
			case "female":
				System.out.println(this.female());
				break;
		}
		
		this.playAudio();
		System.out.println("My name is " + this.name + ", I am " + this.age + " years old." + "\n" +
							"I love to " + this.hobby + " in my spare time and my special talent is " + this.talent + ".");
		System.out.println("\n");
	}

	@Override
	public void playAudio() {
		//	Call the static "play" method on AudioPlayer class.
		AudioPlayer.play(this.audioFile);
	}

}
