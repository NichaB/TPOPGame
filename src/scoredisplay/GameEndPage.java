package scoredisplay;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import gamestart.GameStart;
import intro.NameFrame;
import intro.TimeMenuFrame;
import welcome.MainMenuFrame;

public class GameEndPage extends JFrame implements ItemListener, ActionListener{
	
	private JPanel p = new JPanel(new GridLayout(4,1));
	private String[] returnpage = {"WHAT'S NEXT? (CHOOSE THE OPTION BELOW)","RESTART","MAIN MENU","TIME MENU"};
	private JComboBox cb = new JComboBox(returnpage);
	private JLabel title = new JLabel("YOUR SCORE:");
	private int score = (int)GameStart.point;//explicit
	private JLabel scorelb = new JLabel(Integer.toString(score));
	private JLabel yay = new JLabel("!!!!!!!!!!!!!!!!!!!!!");
	private JButton maxscorebt = new JButton("CLICK HERE TO SEE UR MAX SCORE:");
	private String maxscoretext = "MAX SCORE: ";
	private int max_val;
	static ArrayList<Integer> scorelist = new ArrayList<Integer>();
	
	public GameEndPage(){
		
		super("T-POP GAME");
		scorelist.add(score);
		
		maxscorebt.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		maxscorebt.setForeground(Color.WHITE);
		maxscorebt.setBackground(Color.green);

		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(Color.white);
		title.setForeground(new Color(51,153,255));
		title.setFont(new Font("Showcard Gothic", Font.PLAIN, 120));
		
		scorelb.setHorizontalAlignment(JLabel.CENTER);
		scorelb.setForeground(Color.black);
		scorelb.setFont(new Font("Showcard Gothic", Font.PLAIN, 120));
		
		yay.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		yay.setForeground(Color.red);
		yay.setHorizontalAlignment(JLabel.CENTER);
		
		cb.setPreferredSize(new Dimension(800,50));
		cb.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		
		p.add(title);
		p.add(scorelb);
		p.add(yay);
		p.add(maxscorebt);
		add(cb, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		cb.addItemListener(this);
		maxscorebt.addActionListener(this);
		
		setSize(1000,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public void itemStateChanged(ItemEvent e) {

		if(cb.getSelectedItem()=="RESTART" && e.getStateChange()==1 ) {
			this.dispose();
			new GameStart();
		}

		else if(cb.getSelectedItem()=="MAIN MENU" && e.getStateChange()==1 ) {
			NameFrame.text="";
			this.dispose();
			new MainMenuFrame();
		}
		else if(cb.getSelectedItem()=="TIME MENU" && e.getStateChange()==1 ) {
			this.dispose();
			new TimeMenuFrame();
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==maxscorebt) {
			max_val = scorelist.get(0);
	        for (int i = (int) Math.sqrt(1); i < scorelist.size(); i++) 
	        {
	                max_val = Math.max(max_val, scorelist.get(i)); //static math method
	                
	        }
	       
	        long maxValue = max_val;//implicit
	        maxscoretext = "MAX SCORE: " + Long.toString(maxValue);
	        maxscorebt.setText(maxscoretext);
	        
		}
	
		
	}

}
