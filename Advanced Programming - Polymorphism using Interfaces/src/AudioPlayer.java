import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {

	// Size of the byte buffer used to read/write the audio stream
	private static final int BUFFER_SIZE = 4096;
	
	// Static method play -  play any audio file passed to it. 
	static void play(File audioFile) {
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			
			AudioFormat format = audioStream.getFormat();
			
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
			
			SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
			
			audioLine.open(format);
			
			audioLine.start();
			
			System.out.println("Playback started");
			
			byte[] bytesBuffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			
			while ((bytesRead = audioStream.read(bytesBuffer)) != -1) {
				audioLine.write(bytesBuffer, 0, bytesRead);
			}
			
			audioLine.drain();
			audioLine.close();
			audioStream.close();
			
			System.out.println("Playback Completed");
			
		} catch(UnsupportedAudioFileException e) {
			System.out.println("The specified audio file is not supported.");
			e.printStackTrace();
		} catch(LineUnavailableException e) {
			System.out.println("Audio line for playing back is unavailable.");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Error playing the audio file.");
			e.printStackTrace();
		}
	}

}
