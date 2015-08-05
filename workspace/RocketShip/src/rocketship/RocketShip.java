package rocketship;

import processing.core.PApplet;


public class RocketShip extends PApplet {

	public void setup() {
		size(1000,1000);
		ellipseMode(CENTER);
	}

	public void draw() {
		background(192,192,192);
		fill(0,149,185);
		rect(100,50,100,40);
		fill(0,149,185);
		triangle(100,50,115,30,130,50);
		fill(0,149,185);
		triangle(100,90,115,110,130,90);
		fill(229,38,38);
		triangle(90,60,50,70,90,80);
		fill(0,149,185);
		triangle(200,50,240,70,200,90);
		fill(255, 255, 255);
        ellipse(190, 70, 40, 20);
	}
}
