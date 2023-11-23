package welcome;
import javax.swing.*;

import intro.LoadingFrame;

import java.awt.*;
import java.awt.event.*;



public class MainMenuFrame extends JFrame implements ActionListener{
	
	private RunningMS runmes = new RunningMS();
	private Centercomponent messageAndimage = new Centercomponent();
	private Playbtpanel playpanel = new Playbtpanel();
	
	public MainMenuFrame(){
		super("T-POP GAME");
		setLayout(new BorderLayout());
		runmes.setPreferredSize(new Dimension(1000,40));
		runmes.setBackground(Color.black);
		add(runmes, BorderLayout.NORTH);
		add(messageAndimage, BorderLayout.CENTER);
		add(playpanel, BorderLayout.SOUTH);
		playpanel.playbt.addActionListener(this);
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) 
	{

		if(e.getSource()== playpanel.playbt) 
		{
			this.dispose();
			new LoadingFrame();
		}	
	}
	
	public static void main(String[] args) {
		new MainMenuFrame();
	}

	

}
