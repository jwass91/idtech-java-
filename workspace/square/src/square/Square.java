package square;

import processing.core.PApplet;
import java.util.Random;

public class Square extends PApplet {
	
	int topx = 20;
	int topy = 10;
	float centerx = 150;
	float centery = 100;
	float height = 50;
	float width = 50;
	int tx = 500;
	int ty = 200;
	int tw = 100;
	int th = 80;
	float r = 10;
	float g = 148;
	float b = 80;
	float tr = 120;
	float tg = 150;
	float tb = 120;
	
	public void setup() {
		size(1000,1000); 
		frameRate(60);
//		
	rectMode(CENTER);
		
				
	}

	public void draw() {
//		for (int value = 1, time = 1; time <= 20; value = value*2, time = time + 1){
//		rect(topx,topy+height*time,width+value,height);
//		}
		
		background(192,192,192);
		
		for (int value = 4; value >= 1; value/=2){
			if(value > 1){
				r = random(0,255);
				g = random(0,255);
				b = random(0,255);
			}else{
				r = 192;
				g = 192;
				b = 192;
			}
			
			fill(r,g,b);
			ellipse(centerx,centery,width*value,height*value);
		
		
			}
		
//		println(frameCount);
		
//		if(frameCount%20 == 0){
//		tr = random(0,255);
//		tg = random(0,255);
//		tb = random(0,255);
//		}
		
		centerx = lerp(centerx,tx,0.2f);
		centery = lerp(centery,ty,0.2f);
		width = lerp(width,tw,0.2f);
		height = lerp(height,th,0.2f);
		
//		r = lerp(r,tr,0.2f);
//		g = lerp(g,tg,0.2f);
//		b = lerp(b,tb,0.2f);
//		
//		if(r==tr){
//			tr = random(0,255);
//		}
//		
//		if(g==tg){
//			tg = random(0,255);
//		}
//		
//		if(b==tb){
//			tb = random(0,255);
//		}
		
		
//		fill(255);
//		rect(0, 0, 50, 50);  // White rectangle
//
//		pushMatrix();
//		translate(30, 20);
//		fill(0);  
//		rect(0, 0, 50, 50);  // Black rectangle
//		popMatrix();
//
//		fill(100);  
//		rect(15, 10, 50, 50);  // Gray rectangle
		
		
	}
}
