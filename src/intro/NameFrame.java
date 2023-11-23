package intro;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//import FirstFrame.FirstPage;

public class NameFrame extends JFrame implements KeyListener, ActionListener{
	private JLabel title = new JLabel("TYPE YOUR NAME: ");
	private JTextField nametf = new JTextField("");
	private JButton donebt= new JButton("DONE!");
	private ImageIcon lyricsicon = new ImageIcon("src/lyricsicon1.jpg");
	private JLabel lyricsimg = new JLabel(lyricsicon);
	public static String text = "";

	NameFrame(){
		super("T-POP GAME");
		setLayout(new FlowLayout(FlowLayout.CENTER,200,50));
		
		title.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		title.setHorizontalAlignment(JLabel.CENTER);
		
		nametf.setPreferredSize(new Dimension(600,50));
		nametf.setFont(new Font("Calibri", Font.PLAIN, 30));
		nametf.setHorizontalAlignment(JTextField.CENTER);
		
		donebt.setPreferredSize(new Dimension(400, 150));
		donebt.setBackground(Color.green);
		donebt.setForeground(Color.white);
		donebt.setFont(new Font("Showcard Gothic", Font.PLAIN, 40));
		
		add(lyricsimg);
		add(title);
		add(nametf);
		add(donebt);
		donebt.addActionListener(this);
		nametf.addKeyListener(this);
		setFocusable(true);
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(text != "" && e.getSource()==donebt) {
			this.dispose();
			new TimeMenuFrame();
		}
		
	}

	
	public void keyTyped(KeyEvent e) {
		
		text = text + Character.toString(e.getKeyChar());

	}
	
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
}

	