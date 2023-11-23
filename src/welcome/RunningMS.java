package welcome;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RunningMS extends JPanel implements ActionListener
{
	
	private String title = "Welcome to T-POP T-JAI>_<";
	private int x = 1;
	private Timer timer = new Timer(20, this);
	
	RunningMS()
	{
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setFont(new Font("Showcard Gothic", Font.ITALIC, 20));
		g.setColor(Color.orange);
		if(x<=1000) {
			g.drawString(title, x, 20);
		}
		else {
			x=0;
		}
		repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		x = x+5;
	}

}
