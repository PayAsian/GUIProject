package gui.view;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import gui.controller.Controller;

public class Panel extends JPanel
{
private Controller baseController;
private JButton colorButton;
private JButton randomButton;

public Panel(Controller baseController)
{
	super();
	this.baseController = baseController;
	
	this.colorButton = new JButton("colors");
	this.randomButton = new JButton("random colors?");
	setupPanel();
	setupLayout();
	setupListeners();
	
}

private void setupPanel()
{
	this.setBackground(Color.BLUE);
	this.add(colorButton);
	this.add(randomButton);
	
}

private void setupLayout()
{
	
}

private void setupListeners()
{
	
}

}

