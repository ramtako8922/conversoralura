package servicios;

import javax.swing.*;

public class Conversor implements Conversion {
    double valor;
    double resultado;


    @Override
    public void convertirPesosDolar() {
       valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en dolares"));
       resultado=(valor*1)/4077.170;
       JOptionPane.showMessageDialog(null,"El valor en dolares es " +resultado);


    }

    @Override
    public void convertirDolarPesos() {

        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en dolares para convertir en pesos"));
        resultado=valor*4077.170;
        JOptionPane.showMessageDialog(null,"El valor en pesos es "+resultado);

    }

    @Override
    public void convertirPesosEuro() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en dolares"));
        resultado=(valor*1)/4311.700;
        JOptionPane.showMessageDialog(null,"El valor en euros es " +resultado);


    }

    @Override
    public void convertirEuroPesos() {

        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en euros para convertir en pesos"));
        resultado=(valor*4077.170)/1;
        JOptionPane.showMessageDialog(null,"El valor en pesos es "+resultado);


    }

    @Override
    public void convertirPesosLibra() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en libras"));
        resultado=(valor*1)/4973.900;
        JOptionPane.showMessageDialog(null,"El valor en euros es " +resultado);

    }

    @Override
    public void convertirLibraPesos() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en libras para convertir en pesos"));
        resultado=(valor*4973.900)/1;
        JOptionPane.showMessageDialog(null,"El valor en pesos es "+resultado);

    }

    @Override
    public void convertirPesosYean() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en Yenes"));
        resultado=(valor*1)/27.278;
        JOptionPane.showMessageDialog(null,"El valor en yenes es " +resultado);

    }

    @Override
    public void convertirYeanPesos() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en yenes para convertir en pesos"));
        resultado=(valor*27.278)/1;
        JOptionPane.showMessageDialog(null,"El valor en pesos es "+resultado);

    }

    @Override
    public void convertirPesosWon() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en wom"));
        resultado=(valor*1)/3.0142387 ;
        JOptionPane.showMessageDialog(null,"El valor en yenes es " +resultado);

    }

    @Override
    public void convertirWonPesos() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en yenes para convertir en pesos"));
        resultado=(valor*3.0142387 )/1;
        JOptionPane.showMessageDialog(null,"El valor en pesos es "+resultado);

    }

    @Override
    public void convertirCentigradosKelvin() {

        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados centigrados para convertir en Kelvin"));
        resultado=(valor+273.15 )/1;
        JOptionPane.showMessageDialog(null,"El valor en grados Kelvin es "+resultado);

    }

    @Override
    public void convertirKelvinCentigrados() {
        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados Kelvin para convertir en centigrados"));
        resultado=(valor-273.15 )/1;
        JOptionPane.showMessageDialog(null,"El valor en grados centigrados es "+resultado);

    }

    @Override
    public void convertirCentigradosFarenheiht() {

        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados centrigrados para convertir en Fahrenheit"));
        resultado=(valor*1.8)+32;
        JOptionPane.showMessageDialog(null,"El valor en grados Fahrenheit es "+resultado);


    }
}
