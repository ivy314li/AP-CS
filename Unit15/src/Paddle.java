
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	// add the other Paddle constructors

	public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}

	public Paddle(int x, int y, int s) {
		super(x, y);
		speed = s;
	}

	public Paddle(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
	}

	public Paddle(int x, int y, int w, int h, Color c, int s) {
		super(x, y, w, h, c);
		speed = s;
	}

	public void moveUpAndDraw(Graphics window) {
		draw(window, Color.white);
		setPos(getX(), getY() - getSpeed());
		draw(window, getColor());
	}

	public void moveDownAndDraw(Graphics window) {
		draw(window, Color.white);
		setPos(getX(), getY() + getSpeed());
		draw(window, getColor());
	}

	public boolean equals(Object obj) {
		Paddle bl = (Paddle) obj;
		if (bl.getX() == this.getX() && bl.getY() == this.getY() && bl.getWidth() == this.getWidth()
				&& this.getHeight() == bl.getHeight() && this.getSpeed() == bl.getSpeed())
			return true;
		return false;
	}

	// add get methods
	public int getSpeed() {
		return speed;
	}

	// add a toString() method
	public String toString() {
		return this.getX() + " " + this.getY() + " " + this.getWidth() + " " + this.getHeight() + " " + this.getColor()
				+ " " + this.getSpeed();
	}
}