package gamestart;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import java.util.Collections;
public class Question extends JPanel implements ActionListener{
	private JButton choice0 = new JButton("UNNOTICED-PROXIE");
	private JButton choice1 = new JButton("TEST ME-4EVE");
	private JButton choice2 = new JButton("FIRE BOY-PP KRIT");
	private JButton choice3 = new JButton("MR.EVERYTHING-BILLKIN");
	private JButton choice4 = new JButton("MUTELU-PIXXIE");
	private JButton choice5 = new JButton("SILENT MODE - PROXIE");
	private JButton choice6 = new JButton("BOOTY BOMB-4EVE");
	private JButton choice7 = new JButton("UNNOTICED-PROXIE");
	private JButton choice8 = new JButton("MELT-NONT TANONT");
	private JButton choice9 = new JButton("FADE-JEFF SATUR");
	private JButton choice10 = new JButton("BOO-PIXXIE");
	private JButton choice11 = new JButton("MR.LONELY-ATLAS");
	private JButton choice12 = new JButton("TOO CUTE-PIXXIE");
	private JButton choice13 = new JButton("FIRST LOVE-PRETZELLE");
	private JButton choice14 = new JButton("EVERYDAY-PATRICK");
	private JButton choice15 = new JButton("BOYFRIEND-ATLAS");
	private JButton choice16 = new JButton("CRAZY LOVE-PROXIE");
	private JButton choice17 = new JButton("UNSEND-PROO THUNWA");
	private JButton choice18 = new JButton("LESS IS MORE-4EVE");
	private JButton choice19 = new JButton("TEARS-4EVE");
	private JButton choice20 = new JButton("LOLAY-ATLAS");
	private JButton choice21 = new JButton("CURSE-BAMMM");
	private JButton choice22 = new JButton("ONE DAY W/ YOU-DOM");
	private JButton choice23 = new JButton("NOT BAD-PIXXIE");
	private JButton choice24 = new JButton("WHAT'S THE MATTER-LAZ1");
	private JButton choice25 = new JButton("GET LIKE ME-MIYA");
	private JButton choice26 = new JButton("LUNG LAY-PP KRIT");
	private JButton choice27 = new JButton("VIDEO CALL-VENITA");
	private JButton choice28 = new JButton("TUK KRUB-LIPTA");
	private JButton choice29 = new JButton("TRICK OR TREAT-4EVE");
	
	private JButton[] allchoices = {choice0,choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,choice9,choice10,choice11,choice12,choice13,choice14,choice15,choice16,choice17,choice18,choice19,choice20,choice21,choice22,choice23,choice24,choice25,choice26,choice27,choice28,choice29};
	private JButton qAns;
	private JButton[] choices = new JButton[4];
	private Random rng = new Random();
	private	int choiceIndex = 1;
	private String lyrics = "";
	private JLabel lyricsLB;
	private JPanel choicepanel = new JPanel(new GridLayout(2,2));
	private JButton ans;
	private List<Integer> numList = new ArrayList<>();
	
	protected Question(String lyrics, int correctindex)//protected
	{
		super(new GridLayout(2,1));
		choices[0] = allchoices[correctindex];
		qAns = choices[0];
		
		while(choiceIndex <4) {
			int rndchoice = rng.nextInt(30);
			if (rndchoice != correctindex && !numList.contains(rndchoice)){
				choices[choiceIndex]=allchoices[rndchoice];
				choiceIndex++;
				numList.add(rndchoice);
			}
		
		}
		Collections.shuffle(Arrays.asList(choices));
		
		this.lyrics = lyrics;//this
		lyricsLB = new JLabel(lyrics);
		lyricsLB.setForeground(new Color(37, 150, 190));
		lyricsLB.setHorizontalAlignment(JLabel.CENTER);
		lyricsLB.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		
		setBackground(new Color(203, 231, 255));
		add(lyricsLB);
		
		for(int c=0; c<4; c++) {
			choicepanel.add(choices[c]);
			choices[c].addActionListener(this);
		}
		
		add(choicepanel);

	}
	public void actionPerformed(ActionEvent e) {

		ans = (JButton) e.getSource();
		if(ans== qAns) {
			ans.setBackground(Color.green);
			GameStart.point+=1;
		}
		else {
			ans.setBackground(Color.red);
			GameStart.point+=0;
		}
		
		for(int c=0; c<4; c++) {
			choices[c].setEnabled(false);;
		}
	}

}
	
	

