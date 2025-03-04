package co.edu.uniquindio.SistemaDeGestionEmpleados.Model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> listaDeEmpleados  = new ArrayList<>();

    public Departamento(){

    }
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listaDeEmpleados=" + listaDeEmpleados +
                '}';
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public List<Empleado> getListaDeEmpleados() {return listaDeEmpleados;}
    public void setListaDeEmpleados(List<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }

}
