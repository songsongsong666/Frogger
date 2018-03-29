import javalib.worldimages.FromFileImage;
import javalib.worldimages.Posn;
import javalib.worldimages.WorldImage;


//represent a kind of car 
public class Car extends SonofOfe {
	
	int type;
	
	Car(CartPt loc, int type) {
		super(loc);
		this.type = type;
	}
	//put the car image on the canvas
	public WorldImage getImage() {

		if (this.loc.y == 385 || this.loc.y == 505)
			return new FromFileImage(new Posn(this.loc.x, this.loc.y), 
					this.leftImage(this.type));
		else
			return new FromFileImage(new Posn(this.loc.x, this.loc.y),
					this.rightImage(this.type));
	}
	//return name of the file of cars move to the left with the given int as
	//order
	public String leftImage(int i) {
		if(i==0) 
			return "leftcar1.png";
		if(i==1)
			return "leftcar2.png";
		if(i==2)
			return "leftcar3.png";
		if(i==3)
			return "leftcar4.png";
		else
			return "";
	}
	//return name of the file of cars move to the right with the given int as
	//order
	public String rightImage(int i) {
		if(i==0) 
			return "rightcar1.png";
		if(i==1)
			return "rightcar2.png";
		if(i==2)
			return "rightcar3.png";
		if(i==3)
			return "rightcar4.png";
		else
			return "";
	}

}