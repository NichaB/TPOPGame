package intro;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import welcome.MainMenuFrame;

public class LoadingFrame extends JFrame implements ActionListener {

	private LoadingPanel p = new LoadingPanel();
	
	public LoadingFrame(){
		super("T-POP GAME");
		setBackground(new Color(174,231,255));
		p.timer.addActionListener(this);
		add(p);
		setSize(1000,800);
		setVisible(true);
}
	
	public void actionPerformed(ActionEvent e) {
		if(LoadingPanel.round == 12) {
			this.dispose();
			new NameFrame();
		}
	}
	
//	public static void main(String[] args) {
//		new LoadingFrame();
//	}
}
