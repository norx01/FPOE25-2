package mvc.estudianteClass;

import javax.swing.*;

public class App
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Registro Estudiantes - MVC");
        EstudianteForm vista = new EstudianteForm();
        frame.setContentPane(vista.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        new EstudianteControlador(vista);
    }
}
