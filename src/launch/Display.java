package launch;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import arcanoid.Game;

public class Display {
	
	public static final String TITLE = "Arcanoid";
	public static final int WIDTH = 480;
	public static final int HEIGHT = 640;
	
	public static void main(String[] args) {
		
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Game(Display.TITLE));
			appgc.setDisplayMode(Display.WIDTH, Display.HEIGHT, false);
			appgc.setTargetFrameRate(60);
			appgc.setShowFPS(false);
			appgc.start();
		} catch (SlickException ex) {
			Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}