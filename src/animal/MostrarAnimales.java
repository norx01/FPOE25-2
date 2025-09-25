package animal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class MostrarAnimales {
    private JPanel mainPanel;
    private JTable table1;
    private JScrollPane scrollPane; // asegúrate que el GUI Designer lo tenga
    private List<Animal> animalList;

    // Constructor que recibe la lista
    public MostrarAnimales(List<Animal> animalList) {
        this.animalList = animalList;
        mostrarTabla();
    }

    public void mostrarTabla() {
        // Encabezados de la tabla
        String[] columnas = {"Nombre", "Raza", "Edad", "Ambiente"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Pasar ArrayList al modelo
        for (Animal a : animalList) {
            Object[] fila = {
                    a.getNombre(),
                    a.getRaza(),
                    a.getEdad(),
                    a.getTipoAmbiente()
            };
            modelo.addRow(fila);
        }

        // Asignar el modelo a la JTable ya existente en el panel
        table1.setModel(modelo);
    }

    public void menu() {
        JFrame frame = new JFrame("Mostrar Animales");
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }
}
