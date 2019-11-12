package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Persona;

public class Controlador {

	ArrayList<Persona> personas;

	public Controlador() {
		personas = new ArrayList<Persona>();
	}

	public boolean agregarPersona(String nombre, int edad, String identificacion) {
		Persona nuevo = new Persona(nombre, edad, identificacion);
		if (buscarPersona(identificacion) == null) {
			personas.add(nuevo);

			return true;
		} else {
			JOptionPane.showMessageDialog(null, "La persona ya se encuentra registrada");
			return false;
		}
	}

	public Persona buscarPersona(String identificador) {
		Persona encontrado = null;

		if (!personas.isEmpty()) {
			System.out.println(personas);
			for (int i = 0; i < personas.size(); i++) {
				if (personas.get(i).getIdentificacion().equals(identificador)) {
					encontrado = personas.get(i);
				}
			}
		}

		return encontrado;
	}
}
