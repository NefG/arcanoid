package arcanoid.entety;

import org.newdawn.slick.Graphics;

public class Board extends Entety {
	
	private Bricks bricks;
	private Ball ball;
	private Paddle paddle;
	
	public Board (float x, float y, float w, float h) {
		super(x, y, w, h);
		this.bricks = new Bricks(w, h);
		this.ball = new Ball(w, h);
		this.paddle = new Paddle();
	}
	
	@Override
	public void render(Graphics g) {
		g.translate(this.x, this.y);
		g.fillRect(0, 0, this.width, this.height);
		//g.drawRect(0, 0, this.width, this.height);
		this.bricks.render(g);
		this.paddle.render(g);
		this.ball.render(g);
	}
	
	public void update(int delta) {
		this.ball.update(delta);
	}
}
