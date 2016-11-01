package graphic.view;

import javax.swing.JFrame;
import graphic.controller.FirstGUIController;
import java.awt.Dimension;

public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
	}


private void setupFrame()
	{
		this.setVisible(true);
		this.setSize(new Dimension(500, 500));
	}	


}


