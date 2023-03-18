package javakara_level_02;


import kara.gamegrid.Kara;
import kara.gamegrid.KaraWorld;


/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara: <p>
 *  * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara {
	
    /**
     * In the 'act()' method you can write your program for Kara <br>
     */
	public void act() {
		for(int i = 0; i < 5; i++) {
			move();
		}
		turnRight();
		for(int i = 0; i < 3; i++) {
			move();
		}
		stop();
	}
	
	/**
	 * The main-method is the start of the program where the Kara world is loaded <br>
	 */
	public static void main(String[] args) {
		KaraWorld world = new KaraWorld("WorldSetup.txt", MyKara.class);
		world.show();
	}
}
