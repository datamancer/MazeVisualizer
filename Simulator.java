import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Simulator 
{

	public static ArrayList<Character> maze = new ArrayList();
	public static ArrayList<JLabel> mazeImg = new ArrayList();

	public static int size;
	
	public static void main(String[] args) throws IOException 
	{

		File mazeFile = new File(args[0]);
		size = Integer.parseInt(args[1]);

		Simulator sim = new Simulator();
		
		sim.createMaze(mazeFile);

		sim.tileMatch();

		sim.printMaze();
		
		// start stream to get mouse location information from Arduino
		
		// place mouse
		
		// run baby run!
		
		// TODO Auto-generated method stub
	}
	

	/*
	 * Name: tileMatch()
	 * Purpose: matches the maze number to corresponding tile
	 * Parameters: none
	 * Returns: void
	 * Throws: IOException
	 */
	public void tileMatch() throws IOException
	{
		Iterator iter = maze.iterator();
		
		while( iter.hasNext()) 
		{
			int num = Character.getNumericValue((char) iter.next());
			JLabel img = new JLabel();
			ImageIcon icon = null;
			
			switch(num) 
			{
				case 0:
					icon = new ImageIcon("0.png");
					img.setIcon(icon);
					break;
				case 1:
					icon = new ImageIcon("1.png");
					img.setIcon(icon);
					break;
				case 2:
					icon = new ImageIcon("2.png");
					img.setIcon(icon);
					break;
				case 3:
					icon = new ImageIcon("3.png");
					img.setIcon(icon);
					break;
				case 4:
					icon = new ImageIcon("4.png");
					img.setIcon(icon);
					break;
				case 5:
					icon = new ImageIcon("5.png");
					img.setIcon(icon);
					break;
				case 6:
					icon = new ImageIcon("6.png");
					img.setIcon(icon);
					break;
				case 7:
					icon = new ImageIcon("7.png");
					img.setIcon(icon);
					break;
				case 8:
					icon = new ImageIcon("8.png");
					img.setIcon(icon);
					break;
				case 9:
					icon = new ImageIcon("9.png");
					img.setIcon(icon);
					break;
				case 10:
					icon = new ImageIcon("A.png");
					img.setIcon(icon);
					break;
				case 11:
					icon = new ImageIcon("B.png");
					img.setIcon(icon);
					break;
				case 12: 
					icon = new ImageIcon("C.png");
					img.setIcon(icon);
					break;
				case 13:
					icon = new ImageIcon("D.png");
					img.setIcon(icon);
					break;
				case 14:
					icon = new ImageIcon("E.png");
					img.setIcon(icon);
					break;
				case 15:
					icon = new ImageIcon("F.png");
					img.setIcon(icon);
					break;
				default:
					System.out.println("Shenanigans have occurred");
			}
			
			mazeImg.add(img);
		}
	}
	
	/*
	 * Name: createMaze
	 * Purpose: stores maze values from given file
	 * Parameters: File mazeFile
	 * Returns: void
	 */
	public void createMaze(File mazeFile) throws IOException
	{
		char current;
		
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
			maze.add(current);
		}
		
		fis.close();
	}
	
	/*
	 * Name: printMaze()
	 * Purpose: prints out the maze
	 * Parameters: none
	 * Returns: void
	 */
	public void printMaze()
	{
		JFrame frame = new JFrame("FrameDemo");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setLayout( new GridLayout(size,size) );
		
		for( int i = 12; i < mazeImg.size(); i++ )
		{
			frame.add(mazeImg.get(i));
		}
		
		for( int i = 12 - 4; i < mazeImg.size() - 4; i++ )
		{
			frame.add(mazeImg.get(i));
		}
		
		for( int i = 12 - 4; i < mazeImg.size() - 4; i++ )
		{
			frame.add(mazeImg.get(i));
		}
		
		for( int i = 12 - 8; i < mazeImg.size() - 8; i++ )
		{
			frame.add(mazeImg.get(i));
		}
		
		for( int i = 12 - 12; i < mazeImg.size() - 12; i++ )
		{
			frame.add(mazeImg.get(i));
		}
		
		frame.pack();
	
		frame.setVisible(true);
	}
}
