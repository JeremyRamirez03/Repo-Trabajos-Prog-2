package co.edu.uniquindio.SistemaDeGestionEmpleados.SistemaGestion.Model;

public class Empleado  {
    private String nombre;
    private String IdEmpleado;
    private String departamento;

    public Empleado(){

    }
    public Empleado(String nombre, String idEmpleado, String departamento) {
        this.nombre = nombre;
        this.IdEmpleado = idEmpleado;
        this.departamento = departamento;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getIdEmpleado() {return IdEmpleado;}
    public void setIdEmpleado(String idEmpleado) {IdEmpleado = idEmpleado;}
    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}

    @Override
    public String toString() {
        return "Empleado" +
                "nombre='" + nombre + '\'' +
                ", IdEmpleado='" + IdEmpleado + '\'' +
                ", departamento=" + departamento ;
    }



}
