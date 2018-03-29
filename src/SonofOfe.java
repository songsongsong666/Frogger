import javalib.worldimages.WorldImage;


public abstract class SonofOfe {
	 CartPt loc;
	 SonofOfe(CartPt loc) { 
		 this.loc = loc; 
	 }
public 	void moveLeft() { 
		 this.loc.moveBy(-5, 0);
	 }

public void moveRight() { 
	this.loc.moveBy(+5, 0);
}
//move leftside outbound object back 2 right
public void back2right() { 
	int y0 = this.loc.y;
	this.loc = new CartPt(825, y0);
}

public void back2left() { 
	int y0 = this.loc.y;
	this.loc = new CartPt(-25, y0);
}
//put the object image on the canvas
public abstract WorldImage getImage();
}
