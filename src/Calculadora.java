import javax.swing.*;

//Clase
public class Calculadora {
    //Atributos:
    int num1, num2;

    //Constructor de la clase
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Metodos

    public int sumar()
    {
        return num1 + num2;
    }

    public int restar()
    {
        return num1 - num2;
    }

    public int multiplicar()
    {
        return num1 * num2;
    }

    public double dividir()
    {
        return (double) num1 / num2;
    }

    public void esMayor()
    {
        if (num1 == num2)
        {
            JOptionPane.showMessageDialog(null,"Son iguales");
        }
        else if(num1 > num2)
        {
            JOptionPane.showMessageDialog(null,"num1 es mayor");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"num2 es mayor");
        }
    }

    public void valor()
    {
        valor1 =3;
        switch (num1)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"El numero es 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"El numero es 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"El numero es 3");
                break;
            default:
                JOptionPane.showMessageDialog(null,"El numero no es definido");
                break;
        }
    }

    int valor1 = 5;

    public void prueba()
    {
        int valor1 = 5;
        if (4 == 3)
        {
            int valor2 = 4;
        }

        int valor2 = 4;
    }

    //Metodo main

    public static void main(String[] args)
    {
        //Se solicitan datos la usuario
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));

        //Para crear un objeto se coloca:
        //Nombre de la clase, nombre del objeto = new Nombre de la clase(parametros)
        Calculadora calculadora = new Calculadora(num1,num2);

        //El objeto es el que invoca a los metodos
        System.out.println("La suma es: "+calculadora.sumar());
        JOptionPane.showMessageDialog(null,"La suma es: "+calculadora.sumar()+
                "\nLa resta es: "+calculadora.restar()+"\nLa multiplicacion es: "+calculadora.multiplicar()
        +"\nLa division es: "+calculadora.dividir());

        //llamamos al metodo esMayor
        calculadora.esMayor();

        //llamos al metodo valor
        calculadora.valor();

    }




}
