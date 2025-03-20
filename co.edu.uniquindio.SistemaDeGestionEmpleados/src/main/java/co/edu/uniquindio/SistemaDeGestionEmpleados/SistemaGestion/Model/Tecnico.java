package co.edu.uniquindio.SistemaDeGestionEmpleados.SistemaGestion.Model;

import co.edu.uniquindio.SistemaDeGestionEmpleados.SistemaGestion.Service.Contribucion;

import javax.swing.*;

public class Tecnico extends Empleado implements Contribucion {
    private static final String rolEmpleado="Tecnico";

    public Tecnico(){

    }

    public Tecnico(String nombre, String idEmpleado, String departamento) {
        super(nombre, idEmpleado, departamento);
    }



    @Override
    public String toString() {
        return  super.toString() + ", rol= " + rolEmpleado;
    }

    @Override
    public String contribuir() {
        String contribucion= JOptionPane.showInputDialog("Ingrese su aporte Tecnico " + getNombre());;
        return contribucion;
    }
}
