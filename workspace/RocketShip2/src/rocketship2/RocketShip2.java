package rocketship2;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;


public class RocketShip2 extends PApplet 
{
	public float rotationAmount = 0;
	public boolean moveLeft = false;
	public boolean moveRight = false;
	public boolean reset = false;


	ArrayList<PVector> trail = new ArrayList<PVector>();

	PVector v1, v2, v3;

	ArrayList<Float> rotation = new ArrayList<Float>();
	ArrayList<Integer> transpartion = new ArrayList<Integer>();
	public float speed = 10;

	public boolean moveForward = false;

	public boolean moving = false;

	float r = 255;

	//Set up and draw the rocket ship.
	public int rocketX = 400;
	public int rocketY = 350;
	public void setup() 
	{
		size(800, 700);
		rectMode(CENTER);
		ellipseMode(CENTER);
	}

	public void draw() 
	{        
		background(255, 255, 255);

		//Move and control the rocket ship.
		move();
		rotateShip();
		pushMatrix();
		translate(rocketX, rocketY);
		rotate(rotationAmount);
		drawRocketShip();
		popMatrix();
		drawTrail();
	}


	public void drawRocketShip()
	{
		//Body color.
		stroke(0, 149, 185);
		fill(0, 149, 185);
		//Body
		rect(0, 0, 75, 50);
		//front
		triangle(38, -24, 63, 0, 38, 24);
		//window color
		fill(255, 255, 255);
		//window
		ellipse(20, 0, 40, 30);
		//wings
		stroke(0, 149, 185);
		strokeWeight(3);
		fill(255, 255, 255);
		triangle(-14, -25, -54, -50, -39, -25);
		triangle(-14, 25, -54, 50, -39, 25);


		if(moving)
		{
			//Fire trail
			r = random(1,255);
			fill(r, 0, 0);
			noStroke();
			triangle(-43, -20, -43, 20, -63, 0);
			v1 = new PVector(rocketX, rocketY);
			trail.add(v1);
			rotation.add(rotationAmount);
			transpartion.add(255);

		}
			


	}
	
	public void drawTrail(){
		
		for(int i = 0;i < trail.size();i++) {
			int vx = (int) trail.get(i).x;
			int vy = (int) trail.get(i).y;
			pushMatrix();
			translate(vx, vy);
			rotate(rotation.get(i));
			fill(r, 0, 0, transpartion.get(i));
			noStroke();
			triangle(-43, -20, -43, 20, -63, 0);
			popMatrix();
			transpartion.set(i, transpartion.get(i) - 10);
			if(transpartion.get(i) <= 0) {
				trail.remove(i);
				rotation.remove(i);
				transpartion.remove(i);
				i--;
			}
	
		}
	}

	public void keyPressed() 
	{
		if(key == 'a') 
		{
			moveLeft = true;

		}
		if(key == 'd') 
		{
			moveRight = true;
		}
		if(key == 'w') 
		{
			moveForward = true;
			moving = true;
		} 
		if(key == 'r') 
		{
			reset = true;
		}
	}

	public void keyReleased()
	{
		if(key == 'a') 
		{
			moveLeft = false;
		}
		if(key == 'd') 
		{
			moveRight = false;
		}
		if(key == 'w') 
		{
			moveForward = false;
			moving = false;
		} 
		if(key == 'r') 
		{
			reset = false;
		}
	}


	public void move()
	{
		if(moveForward)
		{
			rocketX += speed * cos(rotationAmount);
			rocketY += speed * sin(rotationAmount);
		}
	}

	public void rotateShip(){
		if(moveRight){
			rotationAmount += .08;
			if(rotationAmount > 2 * PI)
			{
				rotationAmount = 0;
			}
		}
		if(moveLeft){
			rotationAmount -= .08;
			if(rotationAmount < 0)
			{
				rotationAmount = 2 * PI;
			}
		}
	}

}
