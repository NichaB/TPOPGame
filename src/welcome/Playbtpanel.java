package welcome;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Playbtpanel extends JPanel{
	JButton playbt = new JButton("->PLAY<-");

	Playbtpanel(){
		setBackground(new Color(155,207,255));
		playbt.setPreferredSize(new Dimension(200, 100));
		playbt.setBackground(Color.black);
		playbt.setForeground(Color.white);
		playbt.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		Border border = BorderFactory.createLineBorder(Color.white);
		playbt.setBorder(border);
		add(playbt);

	}

}
	

