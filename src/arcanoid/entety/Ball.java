package arcanoid.entety;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Ellipse;

public class Ball extends Entety {
	
	private Ellipse ball;
	
	private float r;
	
	private float x;
	private float y;
	private float dx;
	private float dy;
	
	private float width;
	private float height;
	
	public Ball (float w, float h) {
		this.ball = new Ellipse(400, 400, 5, 5);
		this.color = Color.green;
		this.dx = 0.01f;
		this.dy = 0.01f;
		this.width = w;
		this.height = h;
	}
	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		g.fill(this.ball);
	}
	
	
	public void update(int delta) {
		this.x += this.getDX(delta);
		this.y += this.getDY(delta);
		this.ball.setLocation(this.x, this.y);
	}
	
	public boolean intersects(Entety entety) {
		
	    float distX = Math.abs(this.x - entety.x);
	    float distY = Math.abs(this.y - entety.y);

	    if (distX > (entety.width/2 + this.r)) {
	    	return false;
	    }
	    if (distY > (entety.height/2 + this.r)) {
	    	return false;
	    }

	    if (distX <= (this.width/2)) {
	    	return true;
	    } 
	    if (distY <= (this.height/2)) {
	    	return true;
	    }

	    double distC = Math.pow(distX - entety.width/2, 2) + Math.pow(distY - entety.height/2, 2);

	    return (distC <= Math.pow(this.r, 2));
	}
	
	public float getDX(int delta) {
		float d = this.dx * delta;
		float fx = this.x + d;
		if (fx < 0) {
			d *= -1;
			this.dx *= -1;
		}
		if (fx > this.width) {
			d = this.width - fx;
			this.dx *= -1;
			
		}
		return d;
	}
	
	public float getDY(int delta) {
		float d = this.dy * delta;
		float fy = this.y + d;
		if (fy < 0) {
			d *= -1;
			this.dy *= -1;
		}
		if (fy > this.height) {
			d = this.height - fy;
			this.dy *= -1;
		}
		return d;
	}
}
