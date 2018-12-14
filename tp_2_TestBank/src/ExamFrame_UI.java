import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ExamFrame_UI extends JFrame
{
	private double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	private double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

	public ExamFrame_UI(String title, int width, int height)
	{
		super(title);
		setSize(width, height);
		int x = (int) (screenWidth - width) / 2;
		int y = (int) (screenHeight - height) / 2;
		// set windows location
		setLocation(x, y);
		// we want to set when we close the window, system closed together
		// register windows event
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

	}
}
