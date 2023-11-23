package intro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoadingPanel extends JPanel implements ActionListener{
	private int x=0;
	private int shift = 50;
	private	int H=100;
	private String text = "LOADING";
	Timer timer = new Timer(80,this);
	static int round = 0;
	
	LoadingPanel(){
		round = 0;
		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(new Color(188,240,255));
		g.setFont(new Font("Showcard Gothic", Font.BOLD, 60));
		g.setColor(Color.black);
		g.drawString(text,350, 200);
		g.setColor(Color.white);
		g.fillOval(310, 160, 25, 25);	
		g.fillOval(630, 160, 25, 25);
		g.setColor(Color.green);
		g.drawRect(200,300,600,100);
		g.fillRect(200, 300, x, H);
		
		g.setColor(Color.red);
		int heartx[] = {350,450,500,550,650,650,500,350};
		int hearty[] = {500,500,550,500,500,600,700,600};
		g.fillPolygon(heartx,hearty,8);
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(round==12) {
			timer.stop();
		}
		x = x + shift;
		round+=1;
		repaint();
	}

}
