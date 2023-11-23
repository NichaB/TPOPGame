package welcome;
import javax.swing.*;
import java.awt.*;

public class Centercomponent extends JPanel{
	private ImageIcon tpopimg = new ImageIcon("src/tpop1.jpg");
	private JLabel tpoplabel = new JLabel(tpopimg);
	private BlinkingText Blinkingtextpanel = new BlinkingText();
	Centercomponent(){
		setLayout(new BorderLayout());
		setBackground(new Color(232,149,170));	
		Blinkingtextpanel.setPreferredSize(new Dimension(1000,100));
		add(Blinkingtextpanel, BorderLayout.NORTH);
		add(tpoplabel, BorderLayout.CENTER);
	}
}




