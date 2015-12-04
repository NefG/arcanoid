package arcanoid.entety;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;

public class Bricks extends Entety {
	
	public static final float VCAP = 5;
	public static final float HCAP = 5;
	
	private ArrayList<Brick> bricks;
	
	public Bricks (float w, float h) {
		this.bricks = new ArrayList<Brick>();
		
		for (float x = Bricks.VCAP; x + Brick.WIDTH < w; x += Bricks.VCAP + Brick.WIDTH) {
			for (float y = Bricks.HCAP; y < (Brick.HEIGHT + Bricks.HCAP) * 8; y += Bricks.HCAP + Brick.HEIGHT) {
				this.bricks.add(new Brick(x, y));
			}
		}
	}
	
	@Override
	public void render(Graphics g) {
		g.translate(this.x, this.y);
		for (Brick b:this.bricks) {
			b.render(g);
		}
	}
	
	
	
}
