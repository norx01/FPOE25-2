package mvc.inventario;

import javax.swing.*;

public class InventarioForm {
    private JPanel mainPanel;
    JTextField txtNombre;
    JTextField txtPrecio;
    JTextField txtCantidad;
    JButton btnAgregar;
    JButton btnVolver;

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
