import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AtmLogin extends JFrame implements ActionListener{

	JLabel lblId, lblPass, lblIcon;
	JTextField txt;
	JPasswordField pass;
	JButton btnlogin;

	JPanel pnlCenter, pnlTop, pnlBottom;
	Icon iconobj;

	public AtmLogin() {

		setLayout(null);

		lblId = new JLabel("ID");
		lblPass = new JLabel("Password");
		lblIcon = new JLabel();

		txt = new JTextField();
		pass = new JPasswordField();
		btnlogin = new JButton("Login");
		
		btnlogin.addActionListener(this);

		pnlCenter = new JPanel();
		pnlCenter.setLayout(new GridLayout(2, 2, 5, 5));
		pnlCenter.setBounds(90, 70, 200, 70);
		
		
//		Component[] r= {lblId,txt,lblPass,pass};         fazla component olursa döngüyle panele ekleyebiliriz
//		for(int i=0;i<r.length;i++)
//		{
//			pnlCenter.add(r[i]);
//		}

		
		pnlCenter.add(lblId);
		pnlCenter.add(txt);
		pnlCenter.add(lblPass);
		pnlCenter.add(pass);

		iconobj = new ImageIcon(getClass().getResource("atm.png"));
		lblIcon.setIcon(iconobj);

		pnlTop = new JPanel();
		pnlTop.add(lblIcon);
		pnlTop.setBounds(40, 10, 300, 30);

		pnlBottom = new JPanel();
		pnlBottom.add(btnlogin);
		pnlBottom.setLayout(new GridLayout(1, 1));                             //buton boyutu ayarlandı
		pnlBottom.setBounds(50, 150, 300, 30);

		add(pnlTop);
		add(pnlCenter);
		add(pnlBottom);
		
//		FrameProperties object=new FrameProperties();					        //methodu çağırdık
//		object.setFrameProperties(this,390,270,"Login");
		
//		new FrameProperties().setFrameProperties(this, 390, 270, "Login");      //tek satırda da yazabiliriz

		setTitle("Login");
		setVisible(true);
		setSize(390, 270);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new AtmLogin();
	}

	public void actionPerformed(ActionEvent e) {
		
		if(txt.getText().equals("14")&&pass.getText().equals("beykent"))
		{	
			JOptionPane.showMessageDialog(null, "Succesful Login");
		    setVisible(false);
		    new Transcations();
		}
		else
			JOptionPane.showMessageDialog(null, "Failed Login","ERROR",JOptionPane.ERROR_MESSAGE);
		
	}
}
