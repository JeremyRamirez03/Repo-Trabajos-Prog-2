package co.edu.uniquindio.SistemaDeGestionEmpleados.Model;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Service.Contribucion;

import javax.swing.*;

public class Gerente extends Empleado implements Contribucion {
    private static final String rolEmpleado="Gerente";

    public Gerente(){

    }

    public Gerente(String nombre, String idEmpleado, String departamento) {
        super(nombre, idEmpleado, departamento);
    }

    

    @Override
    public String toString() {
        return  super.toString() + ", rol= " + rolEmpleado;
    }

    @Override
    public String contribuir() {
        String contribucion= JOptionPane.showInputDialog("Ingrese su aporte Gerente " + getNombre());;
        return contribucion;
    }
}

