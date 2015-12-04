package arcanoid.entety;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class Ristkylik {
	
	public static final float LAIUS = 40;
	public static final float KORGUS = 15;
	
	private Rectangle bounds;

	public Ristkylik (float x, float y) {
		this.bounds = new Rectangle(x, y, Ristkylik.LAIUS, Ristkylik.KORGUS);
	}
	
	public void render(Graphics graafika) {
		graafika.setColor(Color.white);
		graafika.fill(this.bounds);
	}
}
