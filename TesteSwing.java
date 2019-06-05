
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class TesteSwing {
	
 public static void main(String[] args) {
	 JFrame frame =  new JFrame();
	 JButton bt = new JButton ("Diga Olá");
	 bt.addActionListener(new ActionListener() { //add um actionListener para ouvir as ações 
		public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog(null, "Olá!!!!");
		}
	}); 
	 
	//TIPOS DE LAYOUT:
	// frame.add(bt, BorderLayout.CENTER);
	//frame.add(bt, BorderLayout.NORTH);
	// frame.add(bt, BorderLayout.EAST);
	// frame.add(bt, BorderLayout.WEST);
	 frame.add(bt, BorderLayout.SOUTH);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setSize(200, 200);
	 frame.setVisible(true);
	
 }
}
