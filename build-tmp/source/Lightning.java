import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
int eX = 10;
public void setup()
{
size(300,300);
background(0,0,0);
strokeWeight(1);
}
public void draw()
{
	//noLoop();
	cloud();
	stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	
	while (endY<310) 
	{
		endX=startX+(int)(Math.random()*15)-7;
		endY=startY+(int)(Math.random()*10);
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}


}
public void mousePressed()
{
	startX = (int)(Math.random()*300);
	startY = 0;
	endX = (int)(Math.random()*300);
	endY = 0;
	;
}

public void cloud()
{
noStroke();
fill(50,50,50);
ellipse(eX,0,90,90);

if (eX<350)
	{
	eX+=60;
	}
if (eX>350)
	{
	eX=10;	
	}


}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
