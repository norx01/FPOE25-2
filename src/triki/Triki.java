package triki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triki {
    private JPanel mainPanel;
    private JButton boton00;
    private JButton boton10;
    private JButton boton20;
    private JButton boton01;
    private JButton boton11;
    private JButton boton21;
    private JButton boton02;
    private JButton boton12;
    private JButton boton22;

    String[][] tablero = new String[3][3];

    int turno = 1;
    String jugada = "";

    int x = 0;
    int y = 0;


    public void inicializar()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                tablero[i][j] = "null";
            }
        }
    }

    public void ganador()
    {
        if (tablero[0][0].equals("X") && tablero[0][1].equals("X") && tablero[0][2].equals("X"))
        {
            JOptionPane.showMessageDialog(null,"Gana el jugador 1");
        }
        else if (tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X"))
        {
            JOptionPane.showMessageDialog(null,"Gana el jugador 1");
        }
        else if (tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X"))
        {
            JOptionPane.showMessageDialog(null,"Gana el jugador 1");
        }
        else if (tablero[0][0].equals("O") && tablero[0][1].equals("O") && tablero[0][2].equals("O"))
        {
            JOptionPane.showMessageDialog(null,"Gana el jugador 2");
        }
        else if (tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O"))
        {
            JOptionPane.showMessageDialog(null,"Gana el jugador 2");
        }
    }

    public void validarTablero(JButton button)
    {
        if (turno == 1)
        {
            turno = 2;
            jugada = "X";
        }
        else if (turno == 2)
        {
            turno = 1;
            jugada = "O";
        }

        if (tablero[x][y].equals("null"))
        {
            tablero[x][y] = jugada;
            button.setText(jugada);
            button.setEnabled(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Esta casilla ya ha sido ocupada");
            if (turno == 1)
            {
                turno = 1;
            }
            else if (turno == 2)
            {
                turno = 2;
            }
        }

        ganador();
    }

    public Triki()
    {
        inicializar();

        boton00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=0;
                y=0;
                validarTablero(boton00);
            }
        });
        boton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=0;
                y=1;
                validarTablero(boton01);
            }
        });
        boton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=0;
                y=2;
                validarTablero(boton02);
            }
        });
        boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=1;
                y=0;
                validarTablero(boton10);

            }
        });
        boton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=1;
                y=1;
                validarTablero(boton11);
            }
        });
        boton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=1;
                y=2;
                validarTablero(boton12);

            }
        });
        boton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=2;
                y=0;
                validarTablero(boton20);

            }
        });
        boton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=2;
                y=1;
                validarTablero(boton21);

            }
        });
        boton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x=2;
                y=2;
                validarTablero(boton22);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Triki");
        frame.setContentPane(new Triki().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
