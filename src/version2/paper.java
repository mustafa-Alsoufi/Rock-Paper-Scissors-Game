package version2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class paper implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{

		RPS_gameV2.rock.setVisible(false);
		RPS_gameV2.paper.setVisible(false);
		RPS_gameV2.scissors.setVisible(false);

		RPS_gameV2.res.setIcon(rnd.random);
		RPS_gameV2.page1.add(RPS_gameV2.res);
		RPS_gameV2.res.setBounds(350, 300, 230, 170);

		JLabel cres = new JLabel();
		cres.setIcon(RPS_gameV2.pl);
		RPS_gameV2.page1.add(cres);
		
		RPS_gameV2.page1.setBackground(RPS_gameV2.mainColr);
		cres.setBounds(5, 290,230, 170);
		
		rnd.pRandom();
		
		
	
	}
}
