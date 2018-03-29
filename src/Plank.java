import javalib.worldimages.FromFileImage;
import javalib.worldimages.Posn;
import javalib.worldimages.WorldImage;


public class Plank extends SonofOfe {

	
	Plank(CartPt loc) {
		super(loc);
	}
	
	public WorldImage getImage() {
		if (this.loc.y == 85 || this.loc.y == 205)
			return new FromFileImage(new Posn(this.loc.x, this.loc.y), 
					"leftplank.png");
		else
			return new FromFileImage(new Posn(this.loc.x, this.loc.y), 
					"rightplank.png");
	}


}