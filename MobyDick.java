package SpaqiBrandon;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * MobyDick - a robot by (your name here)
 */
public class MobyDick extends JuniorRobot
{

	public void run() {

		setColors(red, black, white);


		while(true) {
			// Robot goes around uncontrolled
			ahead(130);
			turnGunLeft(180);
			turnAheadLeft(300, 80);
			turnAheadRight(220, 180);
            turnGunRight(360);			
				
		}
	}


	public void onScannedRobot() {
		// Robot fires if another is near his range
	turnGunTo(scannedAngle);
	if (scannedDistance > 800){
	if (gunReady)
	{
        fire(3);
		}}
	if (scannedDistance < 800)
	{
		if (gunReady){
     fire(1);
                     }
	}
	}


	public void onHitByBullet() {
		// Robot turns from hit back
		back(90);
		turnBackRight(140, 240);
		out.println("Ow, that stings!");
	}
	

	public void onHitWall() {
		// Robot turns from wall back
		back(60);
		turnLeft(140);
		out.println("Oh, a wall");
	}	
}
