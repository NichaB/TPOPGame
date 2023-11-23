package gamestart;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

import intro.TimeMenuFrame;
import scoredisplay.GameEndPage;

public class GameStart extends JFrame implements ActionListener{
	private FirstQ q1 = new FirstQ();
	private SecondQ q2 = new SecondQ();
	private ThirdQ q3 = new ThirdQ();
	private FourthQ q4 = new FourthQ();
	private FifthQ q5 = new FifthQ();
	private SixthQ q6 = new SixthQ();
	private SeventhQ q7 = new SeventhQ();
	private EighthQ q8 = new EighthQ();
	private NinethQ q9 = new NinethQ();
	private TenthQ q10 = new TenthQ();
	private EleventhQ q11 = new EleventhQ();
	private TwelfthQ q12 = new TwelfthQ();
	private int i=0;
	private ArrayList<JPanel> allquestions = new ArrayList<JPanel>(Arrays.asList(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12));
	private Timer timer1 = new Timer(400,this);
	private Timer timer2 = new Timer(8000,this);
	public static double point;

	
	public GameStart(){
		
		super("T-POP GAME");
		point = 0.0;
		Collections.shuffle(allquestions);
		add(allquestions.get(0));
		timerselection();
		setSize(1000,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	private void timerselection() {
		if(TimeMenuFrame.time=="fast") {
			timer1.start();
		}
		else if(TimeMenuFrame.time=="slow") {
			timer2.start();
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		i+=1;

		if(TimeMenuFrame.time=="fast") {

			if(i>0 && i<12)
			{
				remove(allquestions.get(i-1));
				add(allquestions.get(i));
			}
			else if(i==12)
			{
				timer1.stop();
				dispose();
				new GameEndPage();
			}
			
		}
		else if(TimeMenuFrame.time=="slow") {
			if(i>0&& i<12)
			{
				remove(allquestions.get(i-1));
				add(allquestions.get(i));
		
			}
			else if(i==12)
			{
				timer2.stop();
				dispose();
				new GameEndPage();
			}
		
		}
		validate();
}
}
