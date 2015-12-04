package arcanoid.entety;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public abstract class Entety {
	
	protected float x;
	protected float y;
	protected float width;
	protected float height;
	
	protected Rectangle bounds;
	protected Color color;
	
	public Entety () {
		this(0, 0);
	}
	
	public Entety (float x, float y) {
		this(x, y, 0, 0);
	}
	
	public Entety (float x, float y, float w, float h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.color = Color.white;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}
	
	public Rectangle getBounds() {
		return this.bounds;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setBounds(Rectangle r) {
		this.bounds = r;
	}
	
	public void setBounds(float x, float y, float w, float h) {
		this.bounds = new Rectangle(x, y, w, h);
	}
	
	public void setColor(Color c) {
		this.color = c;
	}
	
	public void render(Graphics g) {
		g.setColor(this.color);
		g.fill(this.bounds);
	}
}
