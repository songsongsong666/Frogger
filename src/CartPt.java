import javalib.worldimages.*;

//represent a position
public class CartPt extends Posn{
	CartPt(int x, int y){
	    super(x, y);
	  }
	  
	  // move by the given distance from this point	
	  void moveBy(int dx, int dy){
	    this.x = this.x + dx;
	    this.y = this.y + dy;
	  }
	  
	  // Compute the distance from this point to the given one
	  double distTo(CartPt that){
	    return Math.sqrt((this.x - that.x) * (this.x - that.x) + 
	             (this.y - that.y) * (this.y - that.y));
	  }
}
