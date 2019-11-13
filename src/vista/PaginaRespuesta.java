package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaginaRespuesta extends JFrame {

	public PaginaRespuesta() {
		setUndecorated(true);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 503, 392);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblElResultadoDe = new JLabel("El resultado de su test es:");
		lblElResultadoDe.setFont(new Font("Verdana", Font.BOLD, 13));
		lblElResultadoDe.setBounds(52, 88, 195, 27);
		panel.add(lblElResultadoDe);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(205, 283, 99, 27);
		panel.add(btnSalir);
		setVisible(true);
	}

}
