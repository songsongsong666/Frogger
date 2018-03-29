import tester.Tester;
import java.util.*;


public class ExamplesFrogger {
	
	ExamplesFrogger() {}
	
	SonofOfe car1 = new Car(new CartPt(25, 385), 0);
	SonofOfe car2 = new Car(new CartPt(225, 385), 1);
	SonofOfe car3 = new Car(new CartPt(425, 385), 2);
	SonofOfe car4 = new Car(new CartPt(625, 385), 3);
	ArrayList<SonofOfe> cars1 = new ArrayList<SonofOfe>(Arrays.asList(car1, car2, car3, car4));
	
	SonofOfe car5 = new Car(new CartPt(775, 445), 0);
	SonofOfe car6 = new Car(new CartPt(575, 445), 1);
	SonofOfe car7 = new Car(new CartPt(375, 445), 2);
	SonofOfe car8 = new Car(new CartPt(175, 445), 3);
	ArrayList<SonofOfe> cars2 = new ArrayList<SonofOfe>(Arrays.asList(car5, car6, car7, car8));
	
	SonofOfe car9 = new Car(new CartPt(125, 505), 2);
	SonofOfe car10 = new Car(new CartPt(325, 505), 3);
	SonofOfe car11 = new Car(new CartPt(525, 505), 1);
	SonofOfe car12 = new Car(new CartPt(725, 505), 0);
	ArrayList<SonofOfe> cars3 = new ArrayList<SonofOfe>(Arrays.asList(car9, car10, car11, car12));
	
	SonofOfe car13 = new Car(new CartPt(675, 565), 3);
	SonofOfe car14 = new Car(new CartPt(475, 565), 0);
	SonofOfe car15 = new Car(new CartPt(275, 565), 2);
	SonofOfe car16 = new Car(new CartPt(75, 565), 1);
	ArrayList<SonofOfe> cars4 = new ArrayList<SonofOfe>(Arrays.asList(car13, car14, car15, car16));
	
	//TODO: CHANGE CARTPT!!!!!!!!!!!!!!!!!
	SonofOfe p1 = new Plank(new CartPt(25, 85));
	SonofOfe p2 = new Plank(new CartPt(75, 85));
	SonofOfe p3 = new Plank(new CartPt(250, 85));
	SonofOfe p4 = new Plank(new CartPt(350, 85));
	SonofOfe p5 = new Plank(new CartPt(400, 85));
	SonofOfe p6 = new Plank(new CartPt(677, 85));
	SonofOfe p7 = new Plank(new CartPt(726, 85));
	SonofOfe p8 = new Plank(new CartPt(775, 85));
	ArrayList<SonofOfe> planks1 = new ArrayList<SonofOfe>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));
	
	SonofOfe t1 = new Turtle(new CartPt(625, 85));
	SonofOfe t2 = new Turtle(new CartPt(300, 85));
	SonofOfe t3 = new Turtle(new CartPt(125, 85));
	ArrayList<SonofOfe> turtles1 = new ArrayList<SonofOfe>(Arrays.asList(t1, t2, t3));
	
	SonofOfe p9 = new Plank(new CartPt(675, 145));
	SonofOfe p10 = new Plank(new CartPt(625, 145));
	SonofOfe p11 = new Plank(new CartPt(575, 145));
	SonofOfe p12 = new Plank(new CartPt(425, 145));
	SonofOfe p13 = new Plank(new CartPt(375, 145));
	SonofOfe p14 = new Plank(new CartPt(325, 145));
	SonofOfe p15 = new Plank(new CartPt(175, 145));
	SonofOfe p16 = new Plank(new CartPt(125, 145));
	ArrayList<SonofOfe> planks2 = new ArrayList<SonofOfe>(Arrays.asList(p9, p10, p11, p12, p13, p14, p15, p16));
	
	SonofOfe t4 = new Turtle(new CartPt(725, 145));
	SonofOfe t5 = new Turtle(new CartPt(75, 145));
	SonofOfe t6 = new Turtle(new CartPt(25, 145));
	ArrayList<SonofOfe> turtles2 = new ArrayList<SonofOfe>(Arrays.asList(t4, t5, t6));
	
	SonofOfe p17 = new Plank(new CartPt(75, 205));
	SonofOfe p18 = new Plank(new CartPt(125, 205));
	SonofOfe p19 = new Plank(new CartPt(225, 205));
	SonofOfe p20 = new Plank(new CartPt(375, 205));
	SonofOfe p21 = new Plank(new CartPt(475, 205));
	SonofOfe p22 = new Plank(new CartPt(625, 205));
	SonofOfe p23 = new Plank(new CartPt(675, 205));
	SonofOfe p24 = new Plank(new CartPt(725, 205));
	ArrayList<SonofOfe> planks3 = new ArrayList<SonofOfe>(Arrays.asList(p17, p18, p19, p20, p21, p22, p23, p24));
	
	SonofOfe t7 = new Turtle(new CartPt(425, 205));
	SonofOfe t8 = new Turtle(new CartPt(175, 205));
	ArrayList<SonofOfe> turtles3 = new ArrayList<SonofOfe>(Arrays.asList(t7, t8));
	
	SonofOfe p25 = new Plank(new CartPt(675, 265));
	SonofOfe p26 = new Plank(new CartPt(575, 265));
	SonofOfe p27 = new Plank(new CartPt(525, 265));
	SonofOfe p28 = new Plank(new CartPt(275, 265));
	SonofOfe p29 = new Plank(new CartPt(225, 265));
	SonofOfe p30 = new Plank(new CartPt(175, 265));
	SonofOfe p31 = new Plank(new CartPt(75, 265));
	SonofOfe p32 = new Plank(new CartPt(25, 265));
	ArrayList<SonofOfe> planks4 = new ArrayList<SonofOfe>(Arrays.asList(p25, p26, p27, p28, p29, p30, p31, p32));
	
	SonofOfe t9 = new Turtle(new CartPt(625, 265));
	SonofOfe t10 = new Turtle(new CartPt(475, 265));
	SonofOfe t11 = new Turtle(new CartPt(125, 265));
	ArrayList<SonofOfe> turtles4 = new ArrayList<SonofOfe>(Arrays.asList(t9, t10, t11));
	
	
	Frogger myWorld = 
		      new Frogger(
		          new Frog(new CartPt(400, 625)),
		          new Cars(cars1, cars2, cars3, cars4),
		          new Planks(planks1, planks2, planks3, planks4),
		          new Turtles(turtles1, turtles2, turtles3, turtles4), 3);
}
