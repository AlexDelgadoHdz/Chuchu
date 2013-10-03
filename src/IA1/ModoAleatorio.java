package IA1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModoAleatorio extends Menu {

	public JPanel contentPane1;
	
	
	/**
	 * Launch the application.
	 */
	public void mostrar(){
		contentPane1.setVisible(true); 
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModoAleatorio frame = new ModoAleatorio();
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
	public ModoAleatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 227);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		
		JLabel lblSuMapaSe = new JLabel("Su mapa se generar\u00E1 de manera aleatoria.");
		
		JLabel lblHagaClickEn = new JLabel("Haga click en continuar:");
		
		JButton btnOk = new JButton("Continuar");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_contentPane1 = new GroupLayout(contentPane1);
		gl_contentPane1.setHorizontalGroup(
			gl_contentPane1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane1.createSequentialGroup()
					.addGroup(gl_contentPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHagaClickEn)
						.addGroup(gl_contentPane1.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblSuMapaSe)))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		gl_contentPane1.setVerticalGroup(
			gl_contentPane1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane1.createSequentialGroup()
					.addGap(23)
					.addComponent(lblSuMapaSe, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(lblHagaClickEn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnOk)
					.addGap(21))
		);
		contentPane1.setLayout(gl_contentPane1);
	}

}
