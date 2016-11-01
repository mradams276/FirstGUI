package graphic.view;

import graphic.controller.FirstGUIController;

import javax.swing.JPanel;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	
	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
	}
}
