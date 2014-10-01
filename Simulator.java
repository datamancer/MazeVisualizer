import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Simulator 
{
	public static ArrayList<Long> maze = new ArrayList();
	public static int size;
	
	public static void main(String[] args) throws IOException 
	{

		File mazeFile = new File(args[0]);
		size = Integer.parseInt(args[1]);
		
		Simulator sim = new Simulator();
		
		// create maze
		sim.createMaze(mazeFile);
		
		// match maze items to tiles
		sim.tileMatch();
		
		// print maze
		
		// start stream to get mouse location information from Arduino
		
		// place mouse
		
		// run baby run!
		
		// TODO Auto-generated method stub
	}
	
	public void tileMatch()
	{
		
	}
	
	public void createMaze(File mazeFile) throws IOException
	{
		char current;
		
		// check file existence
		if (!mazeFile.exists())
		{
			System.out.println("File " + mazeFile + " does not exist.");
			return;
		}
		
	    if (!(mazeFile.isFile() && mazeFile.canRead())) 
	    {
	        System.out.println(mazeFile.getName() + " cannot be read from.");
	        return;
	    }
	    
		FileInputStream fis = new FileInputStream(mazeFile);
		
		while(fis.available() > 0)
		{
			current = (char) fis.read(); 
			maze.add((long)Character.getNumericValue(current)); // hex char val to long
		}
		
		fis.close();
	}

}
