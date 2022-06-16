package control;

import Modelo.Feligres;
import Plataforma.Plataforma;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Vista;

/**
 *
 * @author Gerson Israel Diaz de la Garza - 1152068
 */
public class Control implements ActionListener {

    Vista vista = null;
    Plataforma plataforma = new Plataforma();

    public Control(Vista vista) {
        super();
        this.vista = vista;
        actionListener(this);
    }

    public void actionListener(ActionListener controlador) {
        System.out.println("Escuchanding...");
        vista.actualizarBtn.addActionListener(controlador);
        vista.buscarBtn.addActionListener(controlador);
        vista.consultarBtn.addActionListener(controlador);
        vista.guardarBtn.addActionListener(controlador);
        vista.pagarBtn.addActionListener(controlador);
        vista.totalizarBtn.addActionListener(controlador);
        vista.limpiarBtn.addActionListener(controlador);
        vista.limpiarRegDieBtn.addActionListener(controlador);
        vista.imprimirBtn.addActionListener(controlador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().contentEquals("Guardar")) {

            int cedula = Integer.parseInt(vista.cedulaFeligresTxt.getText());
            String nombre = vista.nombreTxt.getText();
            String direccion = vista.direccionTxt.getText();
            String telefono = vista.tlfTxt.getText();
            int estrato = Integer.parseInt(vista.estaTxt.getText());
            float valorDiezmo = Feligres.calcularValorDiezmo(estrato);
            String estado = "Deudor";

            Feligres feligres = new Feligres(cedula, nombre, direccion, telefono, estrato, valorDiezmo, estado);
            plataforma.agregarFeligres(feligres);
        }
        else if (e.getActionCommand().contentEquals("Eliminar")) {

            int cedula = Integer.parseInt(vista.cedulaTxt.getText());
            vista.resultadoTxtA.append(plataforma.buscarFeligres(cedula));
        }
        else if (e.getActionCommand().contentEquals("Actualizar")) {
            int cedula = Integer.parseInt(vista.cedulaFeligresTxt.getText());
            if (plataforma.existeFeligres(cedula) == true) {
                String nombre = vista.nombreTxt.getText();
                String direccion = vista.direccionTxt.getText();
                String telefono = vista.tlfTxt.getText();
                int estrato = Integer.parseInt(vista.estaTxt.getText());
                float valorDiezmo = Feligres.calcularValorDiezmo(estrato);
                String estado = "Deudor";

                Feligres feligres = new Feligres(cedula, nombre, direccion, telefono, estrato, valorDiezmo, estado);
                plataforma.actualizarFeligres(feligres);
            }
            else {
                JOptionPane.showMessageDialog(null, "NO EXISTE ESTE FELIGRES");
            }
        }
        else if (e.getActionCommand().contentEquals("Buscar")) {
            vista.resultadoTxtA.setText("");
            int cedula = Integer.parseInt(vista.cedulaFeligresTxt.getText());
            vista.resultadoTxtA.append(plataforma.buscarFeligres(cedula));
        }
        else if (e.getActionCommand().contentEquals("Consultar")) {
            vista.valorDiezmoTxt.setText("");
            vista.resultadoTxtA.setText("");
            int cedula = Integer.parseInt(vista.cedulaFeligresTxt.getText());
            vista.valorDiezmoTxt.setText(plataforma.consultarDiezmoFeligres(cedula));
        }
        else if (e.getActionCommand().contentEquals("Pagar")) {
            vista.valorDiezmoTxt.setText("");
            vista.resultadoTxtA.setText("");
            int cedula = Integer.parseInt(vista.cedulaTxt.getText());
            if (plataforma.existeFeligres(cedula) == true) {
                vista.resultadoTxtA.setText(plataforma.pagarDiezmo(cedula));
            }
            else {
                JOptionPane.showMessageDialog(null, "NO EXISTE ESTE FELIGRES");
            }
        }
        else if (e.getActionCommand().contentEquals("Totalizar")) {
            vista.resultadoTxtA.setText("");
            vista.resultadoTxtA.append(plataforma.totalizarDiezmos());
        }
        else if (e.getActionCommand().contentEquals("Limpiar")) {
            vista.cedulaFeligresTxt.setText("");
            vista.nombreTxt.setText("");
            vista.direccionTxt.setText("");
            vista.tlfTxt.setText("");
            vista.estaTxt.setText("");
            vista.estadoTxt.setText("");
            vista.resultadoTxtA.setText("");
        }
        else if (e.getActionCommand().contentEquals("Limpiar2")) {
            vista.cedulaTxt.setText("");
            vista.valorDiezmoTxt.setText("");
            vista.resultadoTxtA.setText("");
        }

        else if (e.getActionCommand().contentEquals("Imprimir todos")) {
            vista.resultadoTxtA.setText("");
            vista.resultadoTxtA.append(plataforma.imprimirFeligreces());
        }

    }

}
