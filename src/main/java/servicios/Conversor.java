package servicios;

import ui.InterfazUsuario;

import javax.swing.*;
import java.net.URISyntaxException;

public class Conversor implements Conversion {
    double valor;
    double resultado;
    boolean valorValido = false;
    boolean cierre=false;
    int opcion;




    @Override
    public void convertirPesosDolar() {
        while (!valorValido) {

                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en dolares"));
                    valorValido = true;
                    resultado = (valor * 1) / 4077.170;

                    JOptionPane.showMessageDialog(null, "El valor en dolares es " + resultado);
                    opcion= JOptionPane.showConfirmDialog(null, "¿ Desea continuar en el programa ?  " ,"Advertencia",JOptionPane.YES_NO_CANCEL_OPTION);
                    if (opcion==JOptionPane.NO_OPTION||opcion==JOptionPane.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null, "Programa finalizado ","Gracias",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);

                    }else {

                        InterfazUsuario usuario=new InterfazUsuario();
                        usuario.ejecutarPrograma();



                    }


                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }




        }



    @Override
    public void convertirDolarPesos() {
        while (!valorValido) {
            try {

                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en dolares para convertir en pesos"));
                resultado = valor * 4077.170;
                JOptionPane.showMessageDialog(null, "El valor en pesos es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    @Override
    public void convertirPesosEuro() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en dolares"));
                resultado = (valor * 1) / 4311.700;
                JOptionPane.showMessageDialog(null, "El valor en euros es " + resultado);


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    @Override
    public void convertirEuroPesos() {

        while (!valorValido) {
            try {

                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en euros para convertir en pesos"));
                resultado = (valor * 4077.170) / 1;
                JOptionPane.showMessageDialog(null, "El valor en pesos es " + resultado);


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    @Override
    public void convertirPesosLibra() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en libras"));
                resultado = (valor * 1) / 4973.900;
                JOptionPane.showMessageDialog(null, "El valor en euros es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirLibraPesos() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en libras para convertir en pesos"));
                resultado = (valor * 4973.900) / 1;
                JOptionPane.showMessageDialog(null, "El valor en pesos es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirPesosYean() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en Yenes"));
                resultado = (valor * 1) / 27.278;
                JOptionPane.showMessageDialog(null, "El valor en yenes es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirYeanPesos() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en yenes para convertir en pesos"));
                resultado = (valor * 27.278) / 1;
                JOptionPane.showMessageDialog(null, "El valor en pesos es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirPesosWon() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en Pesos Colombianos para convertir en wom"));
                resultado = (valor * 1) / 3.0142387;
                JOptionPane.showMessageDialog(null, "El valor en yenes es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirWonPesos() {
        while (!valorValido) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en yenes para convertir en pesos"));
                resultado = (valor * 3.0142387) / 1;
                JOptionPane.showMessageDialog(null, "El valor en pesos es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirCentigradosKelvin() {
        while (!valorValido) {
            try {

                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados centigrados para convertir en Kelvin"));
                resultado = (valor + 273.15) / 1;
                JOptionPane.showMessageDialog(null, "El valor en grados Kelvin es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirKelvinCentigrados() {
        while (!valorValido) {
            try {

                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados Kelvin para convertir en centigrados"));
                resultado = (valor - 273.15) / 1;
                JOptionPane.showMessageDialog(null, "El valor en grados centigrados es " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void convertirCentigradosFarenheiht() {
        while (!valorValido) {
            try {

                valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados centrigrados para convertir en Fahrenheit"));
                resultado = (valor * 1.8) + 32;
                JOptionPane.showMessageDialog(null, "El valor en grados Fahrenheit es " + resultado);


            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}