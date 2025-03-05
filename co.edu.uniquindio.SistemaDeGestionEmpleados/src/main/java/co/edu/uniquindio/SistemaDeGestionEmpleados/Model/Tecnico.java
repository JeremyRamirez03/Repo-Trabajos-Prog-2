package co.edu.uniquindio.SistemaDeGestionEmpleados.Model;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Service.Contribucion;

import javax.swing.*;

public class Tecnico extends Empleado implements Contribucion {
    private static final String rolEmpleado="Tecnico";

    public Tecnico(){

    }

    public Tecnico(String nombre, String idEmpleado, String departamento) {
        super(nombre, idEmpleado, departamento);
    }

    public String getNombre() {return super.getNombre();}
    public String getIdEmpleado() {return super.getIdEmpleado();}
    public String getDepartamento() {return super.getDepartamento();}

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
