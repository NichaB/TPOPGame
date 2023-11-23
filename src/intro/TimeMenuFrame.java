
package intro;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import gamestart.GameStart;

public class TimeMenuFrame extends JFrame implements ItemListener, ActionListener{
	private JButton start = new JButton("START!");
	private JRadioButton time1 = new JRadioButton("FAST (4 SEC/QUESTION)");
	private JRadioButton time2 = new JRadioButton("SLOW (8 SEC/QUESTION)");
	private ButtonGroup group = new ButtonGroup();
	private String name = NameFrame.text;
	public static String time;
	
	

	public TimeMenuFrame()
	{
		super("T-POP GAME");
		setLayout(new GridLayout(4,1));

		time1.setFont(new Font("Showcard Gothic", Font.PLAIN, 40));
		time1.setBackground(new Color(186,255,201));
		time1.setHorizontalAlignment(JLabel.CENTER);
		time2.setFont(new Font("Showcard Gothic", Font.PLAIN, 40));
		time2.setBackground(new Color(255,179,186));
		time2.setHorizontalAlignment(JLabel.CENTER);
	
    	group.add(time1);
    	group.add(time2);
    
	
		JLabel label = new JLabel("WELCOME " + name + "! Please Choose Your Mode:");
		label.setFont(new Font("Showcard Gothic", Font.BOLD, 35));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.orange);
	
		start.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
		start.setBackground(Color.green);
		start.setForeground(Color.white);
		add(label);
		add(time1);
		add(time2);
		add(start);
		time1.addItemListener(this);
		time2.addItemListener(this);
		start.addActionListener(this);
		setSize(1000,800);	
		setVisible(true);
	
	}

	public void itemStateChanged(ItemEvent e) {

		if(e.getSource()== time1 && e.getStateChange()==1) {
			time = "fast";
		}
		else if(e.getSource()== time2 && e.getStateChange()==1) {
			time = "slow";

		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(time=="fast" || time=="slow") 
		{
			this.dispose();
			new GameStart();
		}
	}
}
