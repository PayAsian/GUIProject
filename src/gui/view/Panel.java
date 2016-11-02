package gui.view;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.controller.Controller;

public class Panel extends JPanel
{
private Controller baseController;
private JButton colorButton;
private JButton randomButton;
private SpringLayout baselayout;

public Panel(Controller baseController)
{
	super();
	this.baseController = baseController;
	this.baselayout = new SpringLayout();
	this.colorButton = new JButton("colors");
	this.randomButton = new JButton("random colors?");
	setupPanel();
	setupLayout();
	setupListeners();
	
}

private void setupPanel()
{
	this.setLayout(baselayout);
	this.setBackground(Color.BLUE);
	this.add(colorButton);
	this.add(randomButton);
	
}

private void setupLayout()
{
	baselayout.putConstraint(SpringLayout.NORTH, colorButton, 0, SpringLayout.NORTH, randomButton);
	baselayout.putConstraint(SpringLayout.NORTH, randomButton, 10, SpringLayout.NORTH, this);
	baselayout.putConstraint(SpringLayout.EAST, randomButton, -10, SpringLayout.EAST, this);
	baselayout.putConstraint(SpringLayout.WEST, colorButton, 10, SpringLayout.WEST, this);
}

private void setupListeners()
{
	colorButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			setBackground(Color.CYAN);
		}
	});

randomButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent click)
	{
		changeBackgroundColor();
	}
});

}


private void changeBackgroundColor()
{
	int red = (int) (Math.random()*256);
	int green = (int) (Math.random()*256);
	int blue = (int) (Math.random()*256);
	this.setBackground(new Color(red, green, blue));
}

}

