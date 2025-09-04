package listener;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tecla {
    private JPanel mainPanel;
    private JTextField campo;

    public Tecla()
    {
        campo.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                super.keyReleased(e);
                String caracter = String.valueOf(e.getKeyChar());
                JOptionPane.showMessageDialog(null,"Has presionado la tecla: "+caracter);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Tecla");
        frame.setContentPane(new Tecla().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
    }
}
