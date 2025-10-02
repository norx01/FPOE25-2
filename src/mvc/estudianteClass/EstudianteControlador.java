package mvc.estudianteClass;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class EstudianteControlador
{
    private EstudianteForm vista;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private DefaultTableModel modeloTabla;

    public EstudianteControlador(EstudianteForm vista)
    {
        //conectamos la vista con el controlador
        this.vista = vista;

        //configuramos la tabla
        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Edad", "Codigo", "Programa"}, 0);
        vista.table1.setModel(modeloTabla);

        this.vista.registrarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nombre = vista.txtNombre.getText();
                int edad = Integer.parseInt(vista.txtEdad.getText());
                int codigo = Integer.parseInt(vista.txtCodigo.getText());
                String programa = vista.comboBoxPrograma.getSelectedItem().toString();

                Estudiante estudiante = new Estudiante(nombre, edad, codigo, programa);
                estudiantes.add(estudiante);
                actualizarTabla();
            }
        });
    }

    public void actualizarTabla()
    {
        modeloTabla.setRowCount(0);
        for (Estudiante e : estudiantes)
        {
            modeloTabla.addRow(new Object[]{e.getNombre(), e.getEdad(), e.getCodigo(), e.getPrograma()});
        }
    }
}
