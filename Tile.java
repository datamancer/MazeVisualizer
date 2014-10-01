import java.awt.Image;

public class Tile {

	private int width;
	private int height;
	private Image img;
	private int code;
	private int fillAlgorithmValue;
	
	public Tile()
	{
		this.width = 0;
		this.height = 0;
		this.img = null;
		this.code = 16;
		this.fillAlgorithmValue = Integer.MAX_VALUE;
		
	}
	
	public Tile(int width, int height, Image img, int code, int fillAlgorithmValue)
	{
		this.width = width;
		this.height = height;
		this.img = img;
		this.code = code;
		this.fillAlgorithmValue = fillAlgorithmValue;
	}
	
	public Tile( Tile tile ) 
	{
		this.width = tile.getWidth();
		this.height = tile.getHeight();
		this.img = tile.getImage();
		this.code = tile.getCode();
		this.fillAlgorithmValue = tile.getFillAlgorithmValue();
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
	
	public void setCode(int code) 
	{
		this.code = code;
	}
	
	public int getCode()
	{
		return this.code;
	}
	
	public void setFillAlgorithmValue( int fav)
	{
		this.fillAlgorithmValue = fav;
	}
	
	public int getFillAlgorithmValue()
	{
		return this.fillAlgorithmValue;
	}
}