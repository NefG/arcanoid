package arcanoid;

import launch.Display;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame {
	
	private Image background;
	private Image lightbase;
	private Image light;
	
	private Graphics lightmap;
	
	public Game(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		this.background.draw();
		GL11.glEnable(GL11.GL_BLEND);
	    GL11.glBlendFunc(GL11.GL_DST_COLOR, GL11.GL_ONE_MINUS_SRC_ALPHA);
	    g.drawImage(this.lightbase, 0, 0);
	    GL11.glDisable(GL11.GL_BLEND);
		g.setDrawMode(Graphics.MODE_NORMAL);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		this.background = new Image("res/background.png");
		this.light = new Image("res/NaD6F.png");
		
		this.lightbase = new Image(Display.WIDTH, Display.HEIGHT);
		this.lightmap = this.lightbase.getGraphics();
		this.lightmap.setColor(new Color(0, 0, 0, 255));
		this.lightmap.fillRect(0, 0, Display.WIDTH, Display.HEIGHT);
		//this.lightmap.setBackground(new Color(0, 0, 0));
		this.lightmap.flush();
		this.lightmap.setDrawMode(Graphics.MODE_SCREEN);
		this.lightmap.drawImage(this.light, 140, 250);
		this.lightmap.setDrawMode(Graphics.MODE_NORMAL);
		this.lightmap.flush();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}
}