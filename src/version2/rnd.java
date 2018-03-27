package version2;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.*;

public class rnd extends RPS_gameV2  {

	static Color txtRes = Color.decode("#FFB739");
	static ImageIcon[] list = {rr, pr, sr};
    static final JLabel fresult = new JLabel();

	static int rand = new Random().nextInt(list.length);
	static Icon random = (list[rand]);
	
	static Font newf = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,45);
	
	public static Icon rRandom()
	{
		
		if (random.equals(rr))
		{
			fresult.setText("It's a tie");


		}
		else if (random.equals(pr))
		{
			
			fresult.setText("You Lost");
			cmp.setText(String.valueOf(++(RPS_gameV2.ul)));

			
		}
		else if (random.equals(sr))
		{

			
			fresult.setText("You Won");
			user.setText(String.valueOf("<html>"+text.getText()+"<br> "+ ++(RPS_gameV2.uw) +" </html>"));			

		}
		page1.add(fresult);
		fresult.setBounds(200, 50, 550, 333);
		fresult.setFont(newf);
		fresult.setForeground(txtRes);
		
		return random;
		
	}
		
	public static Icon pRandom()
	{

		if (random.equals(rr))
		{
			fresult.setText("You Won");
			user.setText(String.valueOf("<html>"+text.getText()+"<br> "+ ++(RPS_gameV2.uw) +" </html>"));	
			
		}
		else if (random.equals(pr))
		{
			fresult.setText("It's a tie");
		
		}
		else if (random.equals(sr))
		{
			
			fresult.setText("You Lost");
			cmp.setText(String.valueOf(++(RPS_gameV2.ul)));

		}
		
		page1.add(fresult);
		fresult.setBounds(200, 50, 550, 333);
		fresult.setFont(newf);
		fresult.setForeground(txtRes);
		return random;
		
	}
	
	public static Icon sRandom()
	{
		
		
		if (random.equals(rr))
		{
			RPS_gameV2.ul++;
			fresult.setText("You Lost"+RPS_gameV2.ul);


		}
		else if (random.equals(pr))
		{
			RPS_gameV2.uw++;
			fresult.setText("You Won");
			user.setText(String.valueOf("<html>"+text.getText()+"<br> "+ (RPS_gameV2.uw) +" </html>"));
			

		}
		else if (random.equals(sr))
		{
			fresult.setText("It's A Tie");


		}
		
		page1.add(fresult);
		fresult.setBounds(200, 50, 550, 333);
		fresult.setFont(newf);
		fresult.setForeground(txtRes);
		return random;
		
	}

	
	
}
