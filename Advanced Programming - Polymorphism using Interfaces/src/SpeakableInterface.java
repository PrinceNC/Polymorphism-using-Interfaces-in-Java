import java.io.File;

public interface SpeakableInterface {
	
	//	Methods that any class that implements this interface should have.  
	public String getName();
	public void setName(String name);
	public File getAudioFile();
	public void setAudioFile(File audioFile);
	public void speak();
	public void playAudio();
}
