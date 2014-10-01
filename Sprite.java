import java.awt.Image;

public class Sprite extends Tile
{
	private double orientation;
	private int xLoc; // row number, not pixel coordinate
	private int yLoc; // col number, not pixel coordinate

	public Sprite( int width, int height, Image img, int code, int fav,
			double orientation, int xLoc, int yLoc)
	{
		super(width, height, img, code, fav);
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	public Sprite( Tile tile, double orientation, int xLoc, int yLoc )
	{
		super(tile);
		this.orientation = orientation;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
}
