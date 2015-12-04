package arcanoid;

import launch.Display;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import arcanoid.entety.Board;


public class Game extends BasicGame {
	
	private Variables variables;
	private Board board;
	private Image background;
	
	public Game(String title) {
		super(title);
		this.variables = new Variables();
		
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		this.background.draw();
		this.variables.render(g);
		this.board.render(g);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		this.background = new Image("res/background.png");
		this.board = new Board(10, 35, Display.WIDTH - 20, Display.HEIGHT - 45);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		this.board.update(delta);
	}
}