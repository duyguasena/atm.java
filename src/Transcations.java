import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Transcations extends JFrame {

	private JButton[] buttons;
	private String[] names = { "withdraw", "transaction", "transfer", "balance", "deposit", "exit" };
	private JLabel lblIcon;

	private JPanel pnlBottom,pnlCenter;
	
	private Icon[] iconobj = { new ImageIcon(getClass().getResource("face.png")),
			new ImageIcon(getClass().getResource("icon.png")), 
			new ImageIcon(getClass().getResource("atm.png")),
			new ImageIcon(getClass().getResource("free.png")), 
			new ImageIcon(getClass().getResource("icon.png")),
			new ImageIcon(getClass().getResource("atm.png")),
			new ImageIcon(getClass().getResource("free.png"))};

	public Transcations() {
		setLayout(null);
		buttons = new JButton[names.length];

		pnlBottom = new JPanel();
		pnlBottom.setLayout(new GridLayout(2, 3, 5, 5));

		// iconobj=new ImageIcon(getClass().getResource("face.png"));

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(names[i]);
			buttons[i].setIcon(iconobj[i]);
			pnlBottom.add(buttons[i]);

		}

		
		pnlBottom.setBounds(55, 350, 550, 170);
		
		lblIcon=new JLabel("Icon");
		lblIcon.setIcon(iconobj[iconobj.length-1]);
		
		pnlCenter=new JPanel();
		pnlCenter.add(lblIcon);
		pnlCenter.setBounds(150, 30, 400, 300);
		
		add(pnlCenter);
		add(pnlBottom);
		

		new FrameProperties().setFrameProperties(this, 650, 600, "Transaction");
	}

	public static void main(String[] args) {

		new Transcations();
	}
}
