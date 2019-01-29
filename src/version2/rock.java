package version2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;

public class rock implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{

		
		RPS_gameV2.rock.setVisible(false);
		RPS_gameV2.paper.setVisible(false);
		RPS_gameV2.scissors.setVisible(false);
		
		
		RPS_gameV2.res.setIcon(rnd.random);
		RPS_gameV2.page1.add(RPS_gameV2.res);
		RPS_gameV2.res.setBounds(350, 300, 230, 170);
		RPS_gameV2.cres = new JLabel();
		RPS_gameV2.cres.setIcon(RPS_gameV2.rl);
		RPS_gameV2.page1.add(RPS_gameV2.cres);
		RPS_gameV2.cres.setBounds(5, 300,230, 170);
		
		RPS_gameV2.page1.setBackground(RPS_gameV2.mainColr);
		rnd.rRandom();
		rnd.rand = new Random().nextInt();
		
	}
	
}
