package gui.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import gui.controller.Controller;

public class View extends JFrame
{
	private Controller baseController;
	private Panel apppanel;
	
	public View(Controller baseController)
	{
		super();
		this.baseController = baseController;
		this.apppanel = new Panel(baseController);
		
		this.setupFrame();
	}

private void setupFrame()
{
	this.setContentPane(apppanel);
	this.setTitle("OMG - WINDOWS!!!!");;
	this.setSize(new Dimension(600,400));
	this.setVisible(true);
}


}
