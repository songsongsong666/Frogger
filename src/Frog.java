import javalib.worldimages.*;
import java.util.ArrayList;

//represent the frog controled by the player
public class Frog {
	
	CartPt loc;
	
	Frog(CartPt loc) {
		this.loc = loc;
	}
	
	public WorldImage frogImage() {
		return new FromFileImage(new Posn(this.loc.x, this.loc.y), "frog.png");
	}
	//produce a string which corespond to player's activity
	public void onKeyEvent(String ke) {
		if (ke.equals("left")) 
			this.moveLeft();
		if (ke.equals("right")) 
			this.moveRight();
		if (ke.equals("up"))
			this.moveUp();
		if (ke.equals("down"))
			this.moveDown();
		else {}
	}
	
	
	public void moveLeft() {
		if (this.loc.x >= 25)
			this.loc.moveBy(-10, 0);
		else {}
	}
	
	public void moveRight() {
		if (this.loc.x <= 775)
			this.loc.moveBy(+10, 0);
		else
			{}
	}
	
	public void moveUp() {
		if (this.loc.y > 25)
			this.loc.moveBy(0, -60);
		else
			{}
	}
	
	public void moveDown() {
		if (this.loc.y <625)
			this.loc.moveBy(0, +60);
		else 
			{}
	}
	
	

	
	public boolean onPlank(ArrayList<SonofOfe> ap) {
		for (int i = 0; i < ap.size(); i++) {
			if (this.loc.distTo(ap.get(i).loc) <= 50)
				return true;
		}
		return false;
	}
	
	public boolean onPlanks(Planks ps) {
		return this.onPlank(ps.list1) ||
				this.onPlank(ps.list2) ||
				this.onPlank(ps.list3) ||
				this.onPlank(ps.list4);
	}

	public void move(Planks ps) {
		if (this.onPlanks(ps)) {
			if (this.loc.y == 85 || this.loc.y == 205) 
				this.loc.moveBy(-5, 0);
			else 
				this.loc.moveBy(+5, 0);
		}
		else
			{}
	}
	
	public boolean crashCar(ArrayList<SonofOfe> ac) {
		for (int i=0; i<ac.size(); i++) {
			if (this.loc.distTo(ac.get(i).loc) <= 40)
				return true;
			}
		return false;
	}
	
	public boolean crashTurtle(ArrayList<SonofOfe> at) {
		for (int i=0; i<at.size(); i++) {
			if (this.loc.distTo(at.get(i).loc) <= 25)
				return true;
			}
		return false;
	}
	
	public boolean crash(Cars cs, Turtles ts) {
		return this.crashCar(cs.list1) ||
				this.crashCar(cs.list2) ||
				this.crashCar(cs.list3) ||
				this.crashCar(cs.list4) ||
				this.crashTurtle(ts.list1) ||
				this.crashTurtle(ts.list2) ||
				this.crashTurtle(ts.list3) ||
				this.crashTurtle(ts.list4);
	}
	

	public void reset() {
		this.loc.x = 400;
		this.loc.y = 625;
	}
	
}
