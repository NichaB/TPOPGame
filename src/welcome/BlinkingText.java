package welcome;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BlinkingText extends JPanel implements ActionListener {
	private JLabel title = new JLabel("T-POP CHALLENGE!!!");
	private Timer timer = new Timer(500, this);
	
	BlinkingText(){
		setLayout(new FlowLayout(FlowLayout.CENTER,0,30));
		setBackground(new Color(155,207,255));
		title.setForeground(Color.black);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("Showcard Gothic", Font.BOLD, 60));
		timer.start();
	}
	public void actionPerformed(ActionEvent e) {
		if(title.getForeground()==Color.black) {
			title.setForeground(Color.white);
			
		}
		else {
			title.setForeground(Color.black);
		}
		add(title);
		validate();
	}

}
