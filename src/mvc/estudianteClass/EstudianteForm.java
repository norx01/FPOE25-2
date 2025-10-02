package mvc.estudianteClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudianteForm
{
    JPanel mainPanel;
     JTextField txtNombre;
     JTextField txtEdad;
     JTextField txtCodigo;
    JButton registrarEstudianteButton;
    JComboBox comboBoxPrograma;
    JTable table1;

    public EstudianteForm()
    {

    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
