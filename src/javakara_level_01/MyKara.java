package javakara_level_01;

import kara.gamegrid.Kara;
import kara.gamegrid.KaraWorld;

/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara: *
 * Actions: move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() Sensors:
 * onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara {

	/**
	 * In the 'act()' method you can write your program for Kara
	 */
	public void act() {
		for (int i = 0; i < 4; i++) {
			move();
		}
		stop();
	}

	/**
	 * The main-method is the start of the program where the Kara world is loaded
	 * 
	 */
	public static void main(String[] args) {
		KaraWorld world = new KaraWorld("WorldSetup.txt", MyKara.class);
		world.show();

		int limit = 100, num1 = 15, num2 = 40;

		if (limit <= limit)

		{

			if (num1 == num2)

				System.out.println("lemon");

			System.out.println("lime");

		}

		System.out.println("grape");

	}

}
