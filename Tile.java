import java.awt.Image;

public class Tile {

	private int width;
	private int height;
	private Image img;
	
	public Tile()
	{
		this.width = 0;
		this.height = 0;
		this.img = null;
	}
	
	public Tile(int width, int height, Image img)
	{
		this.width = width;
		this.height = height;
		this.img = img;
	}
	
	public Tile( Tile tile ) 
	{
		this.width = tile.getWidth();
		this.height = tile.getHeight();
		this.img = tile.getImage();
	}

	public void setWidth( int width )
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setHeight( int height)
	{
		this.height = height;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public void setImage( Image img )
	{
		this.img = img;
	}
	
	public Image getImage()
	{
		return this.img;
	}
}