package listener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Delizador {
    private JPanel mainPanel;
    private JSlider slider1;
    private JProgressBar progressBar1;
    private JLabel texto;

    public Delizador() {
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                progressBar1.setValue(slider1.getValue());
                texto.setText(progressBar1.getValue()+"%");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Delizador");
        frame.setContentPane(new Delizador().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(500, 500);
    }
}
