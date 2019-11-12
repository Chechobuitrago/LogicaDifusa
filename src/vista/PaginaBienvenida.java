package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaBienvenida extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnIniciar;
	Datos datos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaBienvenida frame = new PaginaBienvenida();
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
	public PaginaBienvenida() {
		setTitle("Logica Difusa");
		setBounds(100, 100, 464, 291);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 448, 252);
		panel.setBackground(new Color(238, 232, 170));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PaginaBienvenida.class.getResource("/images/welcome-png-welcome-png-1860.png")));
		label.setBounds(42, 11, 366, 54);
		panel.add(label);

		btnIniciar = new JButton("INICIAR");
		btnIniciar.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		btnIniciar.setBounds(129, 177, 168, 37);
		btnIniciar.setActionCommand("INICIAR");
		btnIniciar.addActionListener(this);
		panel.add(btnIniciar);

		JLabel lblTestDeMoralidad = new JLabel("Test de moralidad");
		lblTestDeMoralidad.setFont(new Font("MS UI Gothic", Font.BOLD, 21));
		lblTestDeMoralidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestDeMoralidad.setBounds(108, 110, 206, 45);
		panel.add(lblTestDeMoralidad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("INICIAR")) {
			datos = new Datos();
			setVisible(false);
		}
	}

}
