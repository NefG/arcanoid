package arcanoid;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;


public class Variables {
	
	private String scoreString;
	private String livesString;
	
	private int score;
	private int lives;
	
	public Variables () {
		this.reset();
	}
	
	public void addScore(int s) {
		this.score += s;
		this.setScoreString();
	}
	
	public void subScore(int s) {
		this.score -= s;
		this.setScoreString();
	}
	
	public void addLives(int l) {
		this.lives += l;
		this.setLivesString();
	}
	
	public void subLives(int l) {
		this.lives -= l;
		this.setLivesString();
	}
	
	public void reset() {
		this.score = 0;
		this.lives = 3;
		this.setScoreString();
		this.setLivesString();
	}
	
	private void setScoreString() {
		this.scoreString = String.format("Score: %05d", this.score);
	}
	
	private void setLivesString() {
		this.livesString = String.format("Lives:   %03d", this.lives);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawString(this.scoreString, 10, 2);
		g.drawString(this.livesString, 10, 17);
	}
}
