import javalib.worldimages.*;
import java.util.ArrayList;
import java.util.Random;

//represent all the cars on the canvas
public class Cars extends Ofe {

	
	Cars(ArrayList<SonofOfe> cars1, ArrayList<SonofOfe> cars2, ArrayList<SonofOfe> cars3, 
			ArrayList<SonofOfe> cars4) {
		super (cars1, cars2, cars3, cars4);
	}

	//remove cars that out of the left bound of the canvas
	public void moveLeft(ArrayList<SonofOfe> a){
		Random rand = new Random();
		for (int i = 0; i<a.size(); i++) {
			if(a.get(i).loc.x <= -25) {
				int y0 = a.get(i).loc.y;
				a.remove(i);
				a.add(new Car(new CartPt(825, y0), rand.nextInt(4)));
			}
			a.get(i).moveLeft();
		}
	}
	
	//remove cars that out of the right bound of the canvas
	public void moveRight(ArrayList<SonofOfe> a){
		Random rand = new Random();
		for (int i = 0; i<a.size(); i++) {
			if(a.get(i).loc.x >= 825) {
				int y0 = a.get(i).loc.y;
				a.remove(i);
				a.add(new Car(new CartPt(-25, y0), rand.nextInt(4)));
			}
			a.get(i).moveRight();
		}
	}

}
