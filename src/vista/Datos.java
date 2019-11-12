package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import controlador.Controlador;

import javax.swing.JButton;

public class Datos extends JFrame implements ActionListener {
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtIdentificacion;
	private JButton btnSiguiente;
	public Controlador control;
	public PaginaPreguntas preguntas;

	public Datos() {
		setTitle("Logica Difusa");
		getContentPane().setLayout(null);
		setSize(357, 264);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		control = new Controlador();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(0, 0, 341, 225);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblDatos = new JLabel("Datos");
		lblDatos.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblDatos.setBounds(146, 11, 66, 26);
		panel.add(lblDatos);

		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNombre.setBounds(10, 49, 72, 19);
		panel.add(lblNombre);

		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblEdad.setBounds(10, 93, 72, 19);
		panel.add(lblEdad);

		JLabel lblIdentificacion = new JLabel("Identificacion: ");
		lblIdentificacion.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblIdentificacion.setBounds(10, 133, 128, 19);
		panel.add(lblIdentificacion);

		txtNombre = new JTextField();
		txtNombre.setBounds(215, 48, 113, 19);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(215, 92, 113, 19);
		panel.add(txtEdad);

		txtIdentificacion = new JTextField();
		txtIdentificacion.setColumns(10);
		txtIdentificacion.setBounds(215, 132, 113, 19);
		panel.add(txtIdentificacion);

		btnSiguiente = new JButton("Ingresar");
		btnSiguiente.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		btnSiguiente.setBounds(115, 185, 104, 23);
		btnSiguiente.setActionCommand("SIGUIENTE");
		btnSiguiente.addActionListener(this);
		panel.add(btnSiguiente);
		setVisible(true);
	}

	public static void main(String[] args) {
		Datos datos = new Datos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("SIGUIENTE")) {
			if (txtNombre.getText().isEmpty() || txtEdad.getText().isEmpty() | txtIdentificacion.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese todos los datos porfavor");
			} else {
				System.out.println("empieza agregar");
				control.agregarPersona(txtNombre.getText(), Integer.parseInt(txtEdad.getText()),
						txtIdentificacion.getText());
				JOptionPane.showMessageDialog(null, "Se ha creado el usuario");

				System.out.println("Se agrego");
				setVisible(false);
				preguntas = new PaginaPreguntas();

			}
		}
	}
}
