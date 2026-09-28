package Vista;

import Logica.Calculadora;
import javax.swing.JOptionPane;

public class CalculadoraDeNotas {

    public static void main(String[] args) {
        // Punto 1: Ingreso del número de estudiantes
        int cantidad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el número de estudiantes:")
        );

        Calculadora[] estudiantes = new Calculadora[cantidad];

        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Datos del estudiante #" + (i + 1));
            String nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
            String id = JOptionPane.showInputDialog("Ingrese su ID:");

            double notad = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite la nota de Desarrollo:")
            );

            double notam = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite la nota de Matemáticas:")
            );

            Calculadora e = new Calculadora(id, nombre, notad, notam);
            e.calcularDefinitiva();
            estudiantes[i] = e;
        }
    }
}
