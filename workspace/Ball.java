//  Class author:  Jay Vedamony
//  Date created:  12/03/2024
//  General description: methods for creating and moving ball in brick breaker

import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;

 	private int yPos;

	private int size;

	private int xVelocity;

	private int yVelocity;
	
	//constructor(s):
	Ball(int x , int y, int r) {
		xPos = x;
		yPos = y;
		size = r;
		xVelocity = 1;
		yVelocity = -1;
		}
		
	//methods:

	// pre-condition: ball collides brick, paddle, or edge of screen
	// post-condition: negates x velocity 
	public void reverseX(){
		xVelocity = -xVelocity;
	}
	// pre-condition: ball collides brick, paddle, or edge of screen
	// post-condition: negates y velocity
	public void reverseY(){
		yVelocity = -yVelocity;
	}

	// pre-condition: game started and is running
	// post-condition: ball moves, corresponding with the set velocities
	public void move(){
		
		xPos += xVelocity;
		yPos += yVelocity;
		
	}

	// pre-condition: ball object is not null
	// post-condition: draws ball, corresponding with set size and position
	public void draw (Graphics g){
		g.setColor(Color.GREEN);
		g.fillOval(xPos, yPos, size, size);
	}

	// getters and setters
	public void setX(int x){
		xPos = x;
	}

	public int getXpos(){
		return xPos;
	}

	public void setY(int y){
		yPos = y;
	}

    public int getYpos(){
		return yPos;
	}

	public int getSize(){
		return size;
	}

	public void setXVelocity(int v){
		xVelocity = v;
	}

    public void setYVelocity(int v){
		yVelocity = v;
	}
}
