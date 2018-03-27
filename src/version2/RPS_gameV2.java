package version2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.*;


public class RPS_gameV2 {
	static int x=230;


	static int y=170;
	
	static Color mainColr = Color.decode("#5F9EA0");
	static JFrame frame = new JFrame();
	static Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,20);
	static JLabel logo = new JLabel();
	static JTextField text = new JTextField("Enter Your Name: ");
	static JPanel panel = new JPanel(null);
	static JPanel page1 = new JPanel(null);
	static JPanel page2 = new JPanel(null);
	static JLabel cres = new JLabel();
	static JLabel res = new JLabel();


	static mBut click= new mBut();


	URL mainp = RPS_gameV2.class.getResource(
            "/images/main.png");
	static URL paper_lft = RPS_gameV2.class.getResource(
            "/images/paper_left.png");
	static URL paper_rght = RPS_gameV2.class.getResource(
            "/images/paper_right.png");
	static URL pbL = RPS_gameV2.class.getResource(
            "/images/pb.png");
	static URL pbfL = RPS_gameV2.class.getResource(
            "/images/pbf.png");
	static URL rbL = RPS_gameV2.class.getResource(
            "/images/rb.png");
	static URL rbfL = RPS_gameV2.class.getResource(
            "/images/rbf.png");
	static URL rock_lft = RPS_gameV2.class.getResource(
            "/images/rock_left.png");
	static URL rock_rght = RPS_gameV2.class.getResource(
            "/images/rock_right.png");
	static URL sbL = RPS_gameV2.class.getResource(
            "/images/sb.png");
	static URL sbfL = RPS_gameV2.class.getResource(
            "/images/sbf.png");
	static URL scissors_lft = RPS_gameV2.class.getResource(
            "/images/scissors_left.png");
	static URL scissors_rght = RPS_gameV2.class.getResource(
            "/images/scissors_right.png");
	static URL uIconL = RPS_gameV2.class.getResource(
            "/images/uicon.png");
	static URL aIconL = RPS_gameV2.class.getResource(
            "/images/aicon.png");
	
	
	
	static ImageIcon rl = new ImageIcon(new ImageIcon(rock_lft)
			.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
	
	static ImageIcon rr = new ImageIcon(new ImageIcon(rock_rght)
			.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
	
	static ImageIcon sl = new ImageIcon(new ImageIcon(scissors_lft)
			.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
	
	static ImageIcon sr = new ImageIcon(new ImageIcon(scissors_rght)
			.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
	
	static ImageIcon pl = new ImageIcon(new ImageIcon(paper_lft)
			.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
	
	static ImageIcon pr = new ImageIcon(new ImageIcon(paper_rght)
			.getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
	
	static ImageIcon rb = new ImageIcon(new ImageIcon(rbL)
			.getImage().getScaledInstance(70, 180, Image.SCALE_SMOOTH));
	
	static ImageIcon pbf = new ImageIcon(new ImageIcon(pbfL)
			.getImage().getScaledInstance(80, 190, Image.SCALE_SMOOTH));
	
	static ImageIcon sb = new ImageIcon(new ImageIcon(sbL)
			.getImage().getScaledInstance(70, 180, Image.SCALE_SMOOTH));
	
	static ImageIcon rbf = new ImageIcon(new ImageIcon(rbfL)
			.getImage().getScaledInstance(85, 195, Image.SCALE_SMOOTH));
	
	static ImageIcon pb = new ImageIcon(new ImageIcon(pbL)
			.getImage().getScaledInstance(80, 190, Image.SCALE_SMOOTH));
	
	static ImageIcon sbf = new ImageIcon(new ImageIcon(sbfL)
			.getImage().getScaledInstance(90, 210, Image.SCALE_SMOOTH));
	
	static ImageIcon userI = new ImageIcon(new ImageIcon(uIconL)
			.getImage().getScaledInstance(60, 70, Image.SCALE_SMOOTH));
	
	static ImageIcon cmpI = new ImageIcon(new ImageIcon(aIconL)
			.getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH));
	
	static JButton rock = new JButton();
	static JButton paper = new JButton();
	static JButton scissors = new JButton();
	static JButton mainB = new JButton ("Submit");

	
	
	static int uw=0, ul=0;



	static JLabel iconU = new JLabel();
	static JLabel iconA = new JLabel();
	
	final static JLabel user = new JLabel();
	final static JLabel cmp = new JLabel();
	
	
	public static void main(String[] args) {
		
		new RPS_gameV2(); 
}

		
public RPS_gameV2()
{

	click= new mBut();
	
	
	
	frame.setSize(590, 700);

	
	mainB = new JButton ("Submit");
	 frame.setResizable(false);
	 frame.setLocationRelativeTo(null);


	ImageIcon main = new ImageIcon(new ImageIcon(mainp)
			.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT));

	
	logo.setIcon(main);
	// changing the position of the Logo picture at the top of the main page.
	logo.setBounds(80, 30, 400, 150);
	
	// Changing the position of the Text Box 

	text.setBounds(50, 340,450,50);
	text.setFont(font);
	text.setBorder(null);
	
	// Changing the position of the Text Box 
	mainB.setBounds(180, 400,180,70);
	mainB.setFont(font);
	
	frame.getRootPane().setDefaultButton(mainB);
	
	mainB.addMouseListener(new MouseAdapter() {

	Color buttonColr = Color.decode("#C71585");

	     public void mouseEntered(MouseEvent me) {
	    	 mainB.setFocusPainted(true);
	    	 mainB.setBorderPainted(true);
	         mainB.setContentAreaFilled(false);
	         mainB.setForeground(buttonColr);
	         mainB.setBorder(new RoundedBorder(55)); //10 is the radius

	     }
	     public void mouseExited(MouseEvent me) {
	    	 mainB.setFocusPainted(true);
	    	 mainB.setBorderPainted(true);
	    	 mainB.setContentAreaFilled(true);
	    	 mainB.setForeground(Color.black);
	    	 mainB.setBorder(new RoundedBorder(0)); //10 is the radius
	      }
	});
	
	panel.setBackground(mainColr);

	JRadioButton btn = new JRadioButton("text");
    panel.add(btn);
	
	text.addFocusListener(new FocusListener() {

        public void focusGained(FocusEvent e) {
        	text.setText("");            }

        public void focusLost(FocusEvent e) {
        	//text.setText();            
        }
    });
	
	panel.add(logo);
	panel.add(text);
	panel.add(mainB);
	frame.add(panel);
	frame.validate();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	mainB.setActionCommand("SUBMIT");
	mainB.addActionListener(click);
	
	
}

public static class mBut implements ActionListener
{
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if (text.getText().equals("Enter Your Name: ") || text.getText().equals(""))
		{}
		else 
		{
			Color bkground = Color.decode("#c8f1ef");

			rock rPress = new rock();
			paper pPress = new paper();
			scissors sPress = new scissors();
			
			
			page1 = new JPanel(null);
			
			panel.setVisible(false);
			page1.setBackground(mainColr);
			page1.setVisible(true);
			frame.add(page1);
			
			rock = new JButton(rbf);
			rock.setBounds(85, 265,85, 200);
			rock.setBackground(bkground);
			page1.add(rock);
			
			rock.addMouseListener(new MouseAdapter() {

				
			     
			     public void mouseEntered(MouseEvent me) {
			    	rock.setIcon(rb);

			     }
			     public void mouseExited(MouseEvent me) {
			    	rock.setIcon(rbf);
			      }
			});
			
			
			paper = new JButton(pbf);
			paper.setBounds(240, 265,85, 200);
			paper.setBackground(bkground);
			page1.add(paper);
			paper.addMouseListener(new MouseAdapter() {

			     
			     public void mouseEntered(MouseEvent me) {
			    	 paper.setIcon(pb);

			     }
			     public void mouseExited(MouseEvent me) {
			    	 paper.setIcon(pbf);
			      }
			});
			
			
			scissors = new JButton(sbf);
			scissors.setBounds(400, 265,85, 200);
			scissors.setBackground(bkground);
			page1.add(scissors);
			
			scissors.addMouseListener(new MouseAdapter() {

			     
			     public void mouseEntered(MouseEvent me) {
			    	 scissors.setIcon(sb);

			     }
			     public void mouseExited(MouseEvent me) {
			    	 scissors.setIcon(sbf);
			      }
			});
			
			Color score = Color.decode("#a0615f");

			
			page1.setLayout(null);
			page2 = new JPanel(null);
			page2.setSize(600, 100);
			page2.setBackground(score);
			page1.add(page2);
			
			// Post User/Cmp Icons on the second panel
			iconU = new JLabel(userI);
			iconA = new JLabel(cmpI);
			page2.add(iconU);
			iconU.setBounds(20, 10,60, 70);
			page2.add(iconA);
			iconA.setBounds(500, 15,60, 70);

			
			//I need to figure out some way to post the result plus the name of the user just beside the user icon
			
			Color txtScore = Color.decode("#c8f1ef");

			
			user.setText("<html>"+text.getText()+"<br> "+ (uw) +" </html>");
		    user.setForeground(txtScore);
			user.setBounds(90, 10,120, 70);
			page2.add(user);
			user.setFont(font);
			
			cmp.setText("<html>"+"<br> "+ (ul) +" </html>");
			cmp.setForeground(txtScore);
			cmp.setBounds(480, 10,120, 70);
			page2.add(cmp);
			cmp.setFont(font);
			
			rock.addActionListener(rPress);
			paper.addActionListener(pPress);
			scissors.addActionListener(sPress);
			
			
			
		}
			
	}
	
}



}

	


