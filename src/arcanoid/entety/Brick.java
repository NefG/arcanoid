package arcanoid.entety;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;


public class Brick extends Entety {
	
	public static final float WIDTH = 35;
	public static final float HEIGHT = 10;
	
	private Image texture;
	
	public Brick(float x, float y) {
		super(x, y, Brick.WIDTH, Brick.HEIGHT);
		this.color = Color.orange;
		try {
			this.texture = new Image("res/brick.png");
		} catch (SlickException e) {}
	}
	
	@Override
	public void render(Graphics g) {
		g.setColor(this.color);
		g.fill(this.bounds);
		g.setColor(Color.black);
		g.draw(this.bounds);
		//this.texture.draw(this.bounds.getX(), this.bounds.getY(), this.bounds.getWidth(), this.bounds.getHeight());
		/*
        TextureImpl.bindNone();
        this.texture.getTexture().bind();
        SGL GL = Renderer.get();

        GL.glEnable(SGL.GL_TEXTURE_2D);
        GL.glBegin(SGL.GL_QUADS);

        GL.glTexCoord2f(0f, 0f);
        GL.glVertex2f(this.bounds.getPoints()[0], this.bounds.getPoints()[1]);

        GL.glTexCoord2f(0f, 3f);
        GL.glVertex2f(this.bounds.getPoints()[2], this.bounds.getPoints()[3]);

        GL.glTexCoord2f(3f, 3f);
        GL.glVertex2f(this.bounds.getPoints()[4], this.bounds.getPoints()[5]);

        GL.glTexCoord2f(3f, 0f);
        GL.glVertex2f(this.bounds.getPoints()[6], this.bounds.getPoints()[7]);

        GL.glEnd();
        GL.glDisable(SGL.GL_TEXTURE_2D);
        */
	}

}
