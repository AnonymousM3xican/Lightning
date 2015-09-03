
int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
int eX = 10;
void setup()
{
size(300,300);
background(0,0,0);
strokeWeight(1);
}
void draw()
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
void mousePressed()
{
	startX = (int)(Math.random()*300);
	startY = 0;
	endX = (int)(Math.random()*300);
	endY = 0;
}

void cloud()
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