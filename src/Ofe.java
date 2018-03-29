import java.util.ArrayList;
import java.util.Random;

import javalib.worldimages.WorldImage;


public abstract class Ofe {
	ArrayList<SonofOfe> list1;
	ArrayList<SonofOfe> list2;
	ArrayList<SonofOfe> list3;
	ArrayList<SonofOfe> list4;
	Ofe(ArrayList<SonofOfe> list1,  ArrayList<SonofOfe> list2, ArrayList<SonofOfe> list3,
			ArrayList<SonofOfe> list4) { 
		this.list1 = list1;
		this.list2 = list2;
		this.list3 = list3;
		this.list4 = list4;
	}
	
	public void moveLeft(ArrayList<SonofOfe> a){
		for (int i = 0; i<a.size(); i++) {
			if(a.get(i).loc.x<= -25) {
				SonofOfe a1 = a.remove(i);
				a1.back2right();
				a.add(a1);
			}
			a.get(i).moveLeft();
		}
	}
	public void moveRight(ArrayList<SonofOfe> a){
		for (int i = 0; i<a.size(); i++) {
			if(a.get(i).loc.x>= 825) {
				SonofOfe a1 = a.remove(i);
				a1.back2left();
				a.add(a1);
			}
			a.get(i).moveRight();
		}
	}
	
	public void move() {
		this.moveLeft(list1); 
		this.moveRight(list2); 
		this.moveLeft(list3); 
		this.moveRight(list4);
	}

	
	public WorldImage ofeImageH(ArrayList<SonofOfe> a) {
		WorldImage image0 = a.get(0).getImage();
		for (int i = 1; i<a.size(); i++) {
			image0 = image0.overlayImages(a.get(i).getImage());
		}
		return image0;
	}
	
	public WorldImage ofeImage() {
		return this
				.ofeImageH(list1)
				.overlayImages(this.ofeImageH(list2))
				.overlayImages(
						this.ofeImageH(list3).overlayImages(
								this.ofeImageH(list4)));
	}
	

}
