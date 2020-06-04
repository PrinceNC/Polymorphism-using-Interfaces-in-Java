
public class Driver {

	public static void main(String[] args) {

		SpeakableInterface contestants[] = new SpeakableInterface[8]; 

		// Populate the array with objects that implements the Speakable interface.
		contestants[0] = new Dog("Jenny");
		contestants[1] = new Cat("Coco");
		contestants[2] = new Elephant("Lucy"); 
		contestants[3] = new Lion("Charlie");
		contestants[4] = new Dog("Java");
		contestants[5] = new Horse("Buttercup");
		contestants[6] = new Human("Max", "Male", 15, "play Video Game", "Limbo Skating");
		contestants[7] = new Human("Jill", "Female", 10, "Sew", "Eyebrow dancing");
		
		//	Loop through the array and call the "speak" method on each element.
		for(SpeakableInterface instance : contestants) {
			
			try {					
				instance.speak();
				
				if(instance.getClass().getName().equalsIgnoreCase("Human"))
					Thread.sleep(1800);
				else
					Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}
	}

}
