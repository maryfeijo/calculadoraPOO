import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textNum1;
	private JTextField textNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setForeground(new Color(75, 0, 130));
		lblCalculadora.setFont(new Font("Tahoma", Font.BOLD, 15));

		
		textNum1 = new JTextField();
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setColumns(10);
		
		JTextArea txtrNum = new JTextArea();
		txtrNum.setForeground(new Color(153, 50, 204));
		txtrNum.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		txtrNum.setBackground(Color.PINK);
		txtrNum.setText("Num 1:");
		
		JTextArea txtrNum_1 = new JTextArea();
		txtrNum_1.setForeground(new Color(153, 50, 204));
		txtrNum_1.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		txtrNum_1.setBackground(Color.PINK);
		txtrNum_1.setText("Num 2:");
		
		JTextArea txtrR = new JTextArea();
		txtrR.setForeground(new Color(128, 0, 128));
		txtrR.setFont(new Font("Segoe UI", Font.BOLD, 13));
		txtrR.setBackground(Color.PINK);
		txtrR.setText("Resultado:");
		
		JTextArea lblResult = new JTextArea();
		lblResult.setBackground(Color.PINK);
		lblResult.setForeground(new Color(128, 0, 128));
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResult.setText("0");
		
		//OBS: Preciso clicar no botão para ter essas opções abaixo aparecendo:
		JButton btnSomar = new JButton("Somar");
		btnSomar.setForeground(new Color(47, 79, 79));
		btnSomar.setBackground(new Color(244, 164, 96));
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calcular soma
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText()) ;
				int soma = num1 + num2;
				lblResult.setText(String.valueOf(soma));
			}
		});
		
		JButton btnSubtrair = new JButton("Subtrair");
		btnSubtrair.setForeground(new Color(47, 79, 79));
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText()) ;
				int subtrair = num1 - num2;
				lblResult.setText(String.valueOf(subtrair));
			}
		});
		btnSubtrair.setBackground(new Color(244, 164, 96));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(calculadora.class.getResource("/Imagens/img.png")));
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(68, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtrR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSomar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSubtrair))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrNum_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(39)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addGap(289))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblCalculadora)
					.addContainerGap(353, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCalculadora, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrNum_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubtrair)
						.addComponent(btnSomar))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(59))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addComponent(lblNewLabel)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
