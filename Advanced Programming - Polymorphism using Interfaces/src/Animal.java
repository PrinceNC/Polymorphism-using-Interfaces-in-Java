import java.io.File;

//	Abstract class that implements the "Speakable" interface. All child class will 
//	also implement the interface.
public abstract class Animal implements SpeakableInterface {
	private String name;
	private File audioFile;
	
	public Animal() {
		
	}
	
	public Animal(String name, File audioFile) {
		this.setName(name);
		this.setAudioFile(audioFile);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(File audioFile) {
		this.audioFile = audioFile;
	}
	
	// Animal parent class implementation of the "playAudio" method
	public void playAudio() {
		//	Call the static "play" method on AudioPlayer class.
		AudioPlayer.play(this.audioFile);
	}
}
