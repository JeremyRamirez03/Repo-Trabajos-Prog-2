package co.edu.uniquindio.SistemaDeGestionEmpleados.Notificacion.Model;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Notificacion.Service.Notificacion;

import javax.swing.*;

public class SmsNotificacion implements Notificacion {
    @Override
    public void notificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, "Mensaje tipo sms: " + mensaje);
    }

}
