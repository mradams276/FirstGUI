package graphic.view;

import javax.swing.JButton;
import graphic.controller.FirstGUIController;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;

	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
		colorButton = new JButton("Color!");
		randomButton = new JButton("Random!!");
		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(colorButton);
		this.add(randomButton);
	}

	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -10, SpringLayout.EAST, this);
		setBorder(new BevelBorder(BevelBorder.LOWERED, Color.ORANGE, Color.ORANGE, Color.ORANGE, Color.ORANGE));
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.out.print("Hey... That's pretty good!");
				setBackground(Color.GREEN);
			}
		});

		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackground();
			}
		});
	}
}
