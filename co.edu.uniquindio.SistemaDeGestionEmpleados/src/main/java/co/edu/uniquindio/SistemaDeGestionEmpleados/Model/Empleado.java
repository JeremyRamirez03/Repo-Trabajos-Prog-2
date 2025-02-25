package co.edu.uniquindio.SistemaDeGestionEmpleados.Model;

public class Empleado {
    private String nombre;
    private String IdEmpleado;
    private Departamento departamento;

    public Empleado(){

    }
    public Empleado(String nombre, String idEmpleado, Departamento departamento) {
        this.nombre = nombre;
        this.IdEmpleado = idEmpleado;
        this.departamento = departamento;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getIdEmpleado() {return IdEmpleado;}
    public void setIdEmpleado(String idEmpleado) {IdEmpleado = idEmpleado;}
    public Departamento getDepartamento() {return departamento;}
    public void setDepartamento(Departamento departamento) {this.departamento = departamento;}

}
