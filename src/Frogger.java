import javalib.worldimages.*;
import java.awt.Color;
import javalib.soundworld.*;
import javalib.tunes.*;

public class Frogger extends World {

	Frog afrog;
	Cars cars;
	Planks planks;
	Turtles turtles;
	int lives;

	Frogger(Frog afrog, Cars cars, Planks planks, Turtles turtles, int lives) {
		super();
		this.afrog = afrog;
		this.cars = cars;
		this.planks = planks;
		this.turtles = turtles;
		this.lives = lives;
	}


	Note note = new Note("C4n4");
	Note note2 = new Note("E4n2");
	Note note3 = new Note("G4n3");
	
	//CONSTANTS
	Color GRAY = new Color(150, 150, 150);
	Color WHITE = new Color(255, 255, 255);
	Color BLUE = new Color(50, 150, 255);
	Color BLACK = new Color(0, 0, 0);
	Color GREEN = new Color(0,200,0);
	int WIDTH = 800;
	int HEIGHT = 650;
	WorldImage ROAD = new RectangleImage(new Posn(WIDTH/2, 475), 
			WIDTH, 250, BLACK)
	.overlayImages(new RectangleImage(
			new Posn(WIDTH/2, 415), WIDTH, 10, WHITE))
			.overlayImages(new RectangleImage(new Posn(WIDTH/2, 475), 
					WIDTH, 10, WHITE))
					.overlayImages(new RectangleImage(new Posn(WIDTH/2, 535), 
							WIDTH, 10, WHITE)).
							overlayImages(new RectangleImage(new Posn(
									WIDTH/2, 595), WIDTH, 10, WHITE)); 

	WorldImage BACKGROUND = new RectangleImage(new Posn(WIDTH/2,HEIGHT/2),
			WIDTH, HEIGHT, GRAY).
			overlayImages(new RectangleImage(new Posn(WIDTH/2, 175),
					WIDTH, 250, BLUE)).
					overlayImages(ROAD).
					overlayImages(new RectangleImage(
							new Posn(WIDTH/2, 25), WIDTH, 50, GRAY)).
							overlayImages(new RectangleImage(
									new Posn(WIDTH/2,325), 
									WIDTH, 50, GRAY)).
									overlayImages(new RectangleImage(
											new Posn(WIDTH/2, 625), 
											WIDTH, 50, GRAY));




	public void onTick() {

		if (this.afrog.loc.y <= 265 && this.afrog.loc.y >= 85) {
			if (this.afrog.crash(this.cars, this.turtles) || 
					!this.afrog.onPlanks(this.planks)) {
				this.lives = this.lives - 1;
				this.afrog.reset();
			}
			else {
				this.afrog.move(this.planks);
				this.cars.move(); 
				this.planks.move();
				this.turtles.move();
			}
		}
		else {
			if (this.afrog.crash(this.cars, this.turtles)) {
				this.lives = this.lives - 1;
				this.afrog.reset();
			}
			else {
				this.afrog.move(this.planks);
				this.cars.move(); 
				this.planks.move();
				this.turtles.move();
				}
		}
	}

	public void onKeyEvent(String ke) {
		this.afrog.onKeyEvent(ke); 
	}

	public WorldImage makeImage() {
		return BACKGROUND.
				overlayImages(this.cars.ofeImage()).
				overlayImages(this.planks.ofeImage()).
				overlayImages(this.turtles.ofeImage()).
				overlayImages(this.afrog.frogImage()).
				overlayImages(new TextImage(new Posn(720, 25),  
                               "LIVES: " + this.lives, 25, 1, Color.black));
	}



	public WorldEnd worldEnds(){
		if (this.lives == 0) {
			return new WorldEnd(true, this.makeImage().
					overlayImages(new TextImage(new Posn(WIDTH / 2, HEIGHT / 2),  
                               "GAME OVER", 35, 1, WHITE)));
		}
		if (this.afrog.loc.y == 25) {
			return new WorldEnd(true, this.makeImage().
					overlayImages(new TextImage(new Posn(WIDTH / 2, HEIGHT / 2),  
                               "YOU WIN!", 35, 1, WHITE)));
		}
		else {
			return (new WorldEnd(false, this.makeImage()));
		}
	}


}
