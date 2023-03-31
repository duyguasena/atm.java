import javax.swing.JFrame;

public class FrameProperties extends JFrame {

	public void setFrameProperties(JFrame r, int a, int b, String title) {
		r.setTitle(title);
		r.setVisible(true);
		// r.setSize(390, 270);
		r.setSize(a, b); // dinamik hale getirdik
		r.setLocationRelativeTo(null);
	}

//Sürekli aynı şeyleri tekrar etmemek için method oluşturduk ve dinamik hale getirdik
//Diğer class da methodu çağırdık	

}
