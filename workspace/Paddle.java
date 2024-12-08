//  Class author:  Jay Vedamony
//  Date created:  12/03/2024
//  General description: methods for creating and moving paddle in brick breaker

import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;

	private int yPos;

	private int width;

	private int height;

	private int velocity;

	//constructor(s):
	Paddle(int x , int y, int w, int h){
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		velocity = 0;
}
	//methods:
	
	//pre-condition: right or left key is pressed
	//post-condition: increases or decreases velocity
	public void addVelocity(int v){
		if(velocity >= 10){
			velocity = -10;
		} else if(velocity <= -10){
			velocity = -10;
		} else {
			velocity += v;
		}
	}

	// pre-condition: game started and is running
	// post-condition: paddle moves
	public void move(){
		if(velocity > 2){
			velocity = 2;
		} else if(velocity < -2){
			velocity = -2;
		} else{
		xPos += velocity;
		}
	}
	
	// pre-condition: paddle object is not null
	// post-condition: draws paddle, corresponding with set size and position
	public void draw (Graphics g){
		g.setColor(Color.MAGENTA);
		g.fillRect(xPos, yPos, width, height);
	}


	// getters and setters
	public void setX(int x){
		xPos = x;
	}

	public int getX(){
		return xPos;
	}

	public int getY(){
		return yPos;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public void setVelocity(int v){
		velocity = v;
	}

	public int getVelocity(){
		return velocity;
	}
	
}
