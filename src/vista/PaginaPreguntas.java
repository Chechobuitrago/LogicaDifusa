package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class PaginaPreguntas extends JFrame implements ActionListener {
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JButton btnGuardar;

	public PaginaPreguntas() {
		setTitle("Logica Difusa");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocation(450, 100);

		setSize(721, 571);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 705, 532);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblPreguntas = new JLabel("Preguntas");
		lblPreguntas.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		lblPreguntas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreguntas.setBounds(260, 11, 139, 31);
		panel.add(lblPreguntas);

		JLabel lblPregunta = new JLabel("Devolver si por error uno se llevo\r\n algo que no es suyo");
		lblPregunta.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta.setBounds(10, 81, 389, 38);
		panel.add(lblPregunta);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox.setBounds(556, 90, 139, 20);
		panel.add(comboBox);

		JLabel lblPregunta_1 = new JLabel("Avisarle al otro si se esta equivocando y nos cobra de menos");
		lblPregunta_1.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_1.setBounds(10, 123, 427, 31);
		panel.add(lblPregunta_1);

		JLabel lblPregunta_2 = new JLabel("Devolver las cosas que uno ve que se le caen a tora persona en la calle");
		lblPregunta_2.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_2.setBounds(10, 154, 508, 31);
		panel.add(lblPregunta_2);

		JLabel lblPregunta_3 = new JLabel(
				"Ejercer la funcion publica con honestidad, y rechazar todo intento de corrupcion");
		lblPregunta_3.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblPregunta_3.setBounds(10, 196, 508, 31);
		panel.add(lblPregunta_3);

		JLabel lblPregunta_4 = new JLabel("Usar ropa en la calle");
		lblPregunta_4.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_4.setBounds(10, 238, 180, 31);
		panel.add(lblPregunta_4);

		JLabel lblPregunta_5 = new JLabel("No hacer trampa cuando se esta practicando un deporte");
		lblPregunta_5.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_5.setBounds(10, 280, 389, 31);
		panel.add(lblPregunta_5);

		JLabel lblPregunta_6 = new JLabel("No aprovechars e de la inocencia de un ni\u00F1o, en cualquier orden");
		lblPregunta_6.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_6.setBounds(10, 322, 453, 31);
		panel.add(lblPregunta_6);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_1.setBounds(556, 117, 139, 20);
		panel.add(comboBox_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_2.setBounds(556, 159, 139, 20);
		panel.add(comboBox_2);

		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_3.setBounds(556, 201, 139, 20);
		panel.add(comboBox_3);

		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_4.setBounds(556, 243, 139, 20);
		panel.add(comboBox_4);

		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_5.setBounds(556, 285, 139, 20);
		panel.add(comboBox_5);

		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_6.setBounds(556, 327, 139, 20);
		panel.add(comboBox_6);

		JLabel lblPregunta_7 = new JLabel("No aprovecharse de dificultad fisica de un anciano");
		lblPregunta_7.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_7.setBounds(10, 364, 368, 31);
		panel.add(lblPregunta_7);

		JLabel lblPregunta_8 = new JLabel("No provocar sufrimiento a un animal");
		lblPregunta_8.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_8.setBounds(10, 406, 259, 31);
		panel.add(lblPregunta_8);

		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_7.setBounds(556, 369, 139, 20);
		panel.add(comboBox_7);

		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_8.setBounds(556, 411, 139, 20);
		panel.add(comboBox_8);

		JLabel lblPregunta_9 = new JLabel("Acompa\u00F1ar una persona enferma");
		lblPregunta_9.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblPregunta_9.setBounds(10, 448, 217, 31);
		panel.add(lblPregunta_9);

		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] { "Totalmente de acuerdo", "De acuerdo",
				"Ni en desacuerdo ni acuerdo", "Desacuerdo", "Totalmente Desacuerdo" }));
		comboBox_9.setBounds(556, 453, 139, 20);
		panel.add(comboBox_9);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnGuardar.setBounds(260, 483, 119, 38);
		btnGuardar.setActionCommand("GUARDAR");
		btnGuardar.addActionListener(this);
		panel.add(btnGuardar);
		setVisible(true);
	}
//sadasjjas
	public static void main(String[] args) {
		PaginaPreguntas ePaginaPreguntas = new PaginaPreguntas();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("GUARDAR")) {

		}

	}
}
