package servicios;

import javax.swing.*;

public class Conversor implements Conversion {
    double valor;
    double resultado;


    @Override
    public void convertirPesosDolar() {
       valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en dolares"));
       resultado=(valor*1)/4077.170;
       JOptionPane.showMessageDialog(null,"El valor en dolares es");


    }

    @Override
    public void convertirDolarPesos() {

        valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en dolares para convertir en pesos"));
        resultado=(valor*4077.170)/1;
        JOptionPane.showMessageDialog(null,"El valor en pesos es");

    }

    @Override
    public void convertirPesosEuro() {

    }

    @Override
    public void convertirEuroPesos() {

    }

    @Override
    public void convertirPesosLibra() {

    }

    @Override
    public void convertirLibraPesos() {

    }

    @Override
    public void convertirPesosYean() {

    }

    @Override
    public void convertirYeanPesos() {

    }

    @Override
    public void convertirPesosWon() {

    }

    @Override
    public void convertirWonPeson() {

    }

    @Override
    public void convertirCentigradosKelvin() {

    }

    @Override
    public void convertirKelvinCentigrados() {

    }

    @Override
    public void convertirCentigradosFarenheiht() {

    }
}
