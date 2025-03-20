package co.edu.uniquindio.SistemaDeGestionEmpleados.Notificacion;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Notificacion.Model.EmailNotificacion;
import co.edu.uniquindio.SistemaDeGestionEmpleados.Notificacion.Model.SmsNotificacion;
import co.edu.uniquindio.SistemaDeGestionEmpleados.Notificacion.Service.Notificacion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String type= JOptionPane.showInputDialog("Ingrese el tipo de notificacion: ");
        String mensaje= JOptionPane.showInputDialog("Ingrese el mensaje");
        Notificacion notificacion;

        if ("email".equalsIgnoreCase(type)){
            notificacion=new EmailNotificacion();
            notificacion.notificacion(mensaje);
        } else if ("sms".equalsIgnoreCase(type)) {
            notificacion=new SmsNotificacion();
            notificacion.notificacion(mensaje);
        }

    }
}
