package javakara_level_10;

import kara.gamegrid.Kara;
import kara.gamegrid.KaraWorld;

/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara:
 * <p>
 * * Actions: move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors: onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara {

	/**
	 * In the 'act()' method you can write your program for Kara <br>
	 */
	int row = 0;
	int cloverleaves = 0;
	int counter = 0;

	public void act() {
		for (int j = 1; j < 10; j++) {
			for (int i = 1; i < 9; i++) {
				if (onLeaf()) {
					counter++;
				}
				move();
			}

			if (counter > cloverleaves) {
				cloverleaves = counter;
				row = j;
			}
			counter = 0;
			if (j % 2 == 0) {
				turnLeft();
				move();
				turnLeft();
			} else {
				turnRight();
				move();
				turnRight();
			}
		}
		stop();
		System.out.println("The row with the most cloverleaves is " + row);
		System.out.println("The row contains " + cloverleaves + " cloverleaves");
	}

	/**
	 * The main-method is the start of the program where the Kara world is loaded
	 * <br>
	 */
	public static void main(String[] args) {
		KaraWorld world = new KaraWorld("WorldSetup.txt", MyKara.class);
		// KaraWorld world = new KaraWorld("WorldSetup2.txt", MyKara.class);
		world.show();
	}
}
