
/**
 * @author Fiona
 *
 */
public class StaticObjects extends Inventory {
	/*
	 * CLASS
	 * STATIC OBJECTS
	 * These are objects that only provide a description.
	 * They may be neutral objects or objects that provide clues.
	 * (Some of these objects are things that are taken from the room and placed into the inventory.)
	 */
	public StaticObjects() {
		
	}
	//METHODS

	//UNIQUE METHODS
	public void aBear() {
		System.out.println("This is a bear. It is holding an object.\nView object? 'y'/'n'");
		
	}
	
	public void aBracelet() {
		System.out.println("This is a bracelet with four yellow stars on it.");
	}
	
	public void aCard() {
		System.out.println("A black seven of spades playing card.");
	}
	
	public void aPaper() {
		System.out.println("You unfold the paper. It is torn and looks like it came from a nursery book.");
		System.out.println("On it, there writes: '--two, tie your shoe.'. There is a drawing of a green shoe right beneath it.");
	}
	
	public void aBirdR() {
		System.out.println("It is a red Bird. There is a circle stamped on it.");
	}
	
	public void aBirdY() {
		System.out.println("It is a yellow Bird. There is a asterisk stamped on it.");
	}
	
	public void aBirdG() {
		System.out.println("It is a green Bird. There is a diamond stamped on it.");
	}
	
	public void redBox() {
		System.out.println("It is a red box.\nOpen? 'y'/'n'");
	}
	public void aShelf() {
		System.out.println("There is a red Bird, a yellow Bird, and a green Bird.\nTo view type:\n'r'-red Bird\n'y'-yellow Bird\n'g'-greenbird");
		System.out.println("To stop viewing shelf, type 'stop'");
	}
	//Haine
	public void aMirror() {
		System.out.println("It's a mirror. All you see is a reflection of you. Your human self.");
	}
}
