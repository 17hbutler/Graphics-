import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
public class GraphicsAndThingz 
{
	static String newName; 
	static JFrame newFrame = new JFrame();
	
	static JFrame POFrame;
	static JPanel POPanel;
	
	static JButton square; 
	static JButton circle; 
	static JButton star;
	static ButtonGroup shapeButton;
	
	static JButton green; 
	static JButton blue; 
	static JButton yellow; 
	static JButton cyan; 
	static ButtonGroup colorButton; 
	
	static int shapeColor; 
	static String shapeSelection; 
	
	static String theSwitch; 
	
	public static void main(String[] args) 
	{
		askPlayerName(); 
	}
	
	public static void askPlayerName() 
	{
		newName = JOptionPane.showInputDialog("What is your name?"); 
		JOptionPane.showMessageDialog(newFrame, "Hi, " + newName);
		JOptionPane.showMessageDialog(newFrame, "Lets draw some shapes " + newName);
		preformOperation(); 
	}
	
	public static void preformOperation() 
	{
		POFrame = new JFrame("Chose your shape");
		POFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		POFrame.setLocationRelativeTo(null);  
		POFrame.pack();
		POFrame.setVisible(true);
		makeChoices(); 
		
	}
	
	public static void makeChoices() 
	{
		POPanel = (JPanel) POFrame.getContentPane();
		POPanel.setLayout(new BorderLayout(6,6));
		POPanel.setBorder(BorderFactory.createEmptyBorder(6,6,6,6));
		choseYourShapeW();
		chooseYourColorE(); 
	}
	
	public static void choseYourShapeW() 
	{
		JPanel newPanel = new JPanel();
		newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));
		
		newPanel.setBorder(BorderFactory.createTitledBorder("What shape do you want to draw."));
		shapeButton = new ButtonGroup();
		
		Object[] optionsOne = {square, circle, star}; 
	
		square = new JButton("Square");
		square.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				shapeSelection = "Square"; 
			}
			
		});
		shapeButton.add(square);
		newPanel.add(square);
				

		circle = new JButton("Circle");
		circle.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				shapeSelection = "Circle"; 
			}
			
		});
		shapeButton.add(circle); 
		newPanel.add(circle); 
		

//		star = new JButton("Star");
//		star.addActionListener(new ActionListener() 
//		{
//
//			@Override
//			public void actionPerformed(ActionEvent e) 
//			{
//				shapeSelection = "Star"; 
//			}
//			
//		});
//		shapeButton.add(star); 
//		newPanel.add(star); 
		
		POPanel.add(newPanel, BorderLayout.WEST);
		
		
		
	}
	
	public static void chooseYourColorE() 
	{
		JPanel newPanel = new JPanel();
		newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));
		
		newPanel.setBorder(BorderFactory.createTitledBorder("What color do you want your shape to be"));
		colorButton = new ButtonGroup();
		
		Object[] optionsTwo = {green, blue, yellow, cyan}; 
		
		 green = new JButton("Green"); 
		 green.addActionListener(new ActionListener() 
		 {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				shapeColor = 0; 
			}
			
		});
		colorButton.add(green);
		newPanel.add(green);
		
		blue = new JButton("Blue");
		blue.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				shapeColor = 1; 
			}
			
		});
		colorButton.add(blue); 
		newPanel.add(blue); 
		
		yellow = new JButton("Yellow");
		yellow.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				shapeColor = 2; 
				
			}
			
		});
		colorButton.add(yellow);
		newPanel.add(yellow); 
		
		cyan = new JButton("Cyan");
		cyan.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				shapeColor = 3;  
			}
			
		});
		colorButton.add(cyan); 
		newPanel.add(cyan); 
		
		POPanel.add(newPanel, BorderLayout.EAST); 
		
	}
	
	public void paint(Graphics graphics) 
	{
		switch(shapeSelection)
		{
			case "Square": 
			{
				graphics.fillRect(50, 40, 300, 300);
				break;
			}
			case "Circle": 
			{
				graphics.fillOval(50, 30, 300, 300);
				break;
			}
			
		}
		
		switch(shapeColor) 
		{
			case 0: 
			{
				graphics.setColor(Color.green); 
			}
			case 1: 
			{
				graphics.setColor(Color.blue);
			}
			case 2: 
			{
				graphics.setColor(Color.yellow); 
			}
			case 3: 
			{
				graphics.setColor(Color.cyan); 
			}
		}
	}
}
