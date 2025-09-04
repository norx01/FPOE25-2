package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ventana
{
    private JPanel mainPanel;

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new JFrame("Ventana");
            frame.setContentPane(new Ventana().mainPanel);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setSize(500, 500);

            frame.addWindowListener(new WindowListener()
            {
                @Override
                public void windowOpened(WindowEvent e)
                {
                    System.out.println("Ventana abierta");
                }

                @Override
                public void windowClosing(WindowEvent e)
                {
                    System.out.println("Cerrando ventana");
                }

                @Override
                public void windowClosed(WindowEvent e)
                {
                    System.out.println("Ventana Cerrada");
                }

                @Override
                public void windowIconified(WindowEvent e)
                {
                    System.out.println("Ventana Minimizada");
                }

                @Override
                public void windowDeiconified(WindowEvent e)
                {
                    System.out.println("Ventana Maximizada");
                }

                @Override
                public void windowActivated(WindowEvent e)
                {
                    System.out.println("Ventana Activa");
                }

                @Override
                public void windowDeactivated(WindowEvent e)
                {
                    System.out.println("Ventana Inactiva");
                }
            });
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        });
    }

}
