package co.edu.uniquindio.SistemaDeGestionEmpleados.Factory;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Model.*;

public class ModelFactory {
    private static ModelFactory instancia;
    private SistemaGestion sistemaGestion;

    private ModelFactory(){sistemaGestion= inicializarDatos();}

    public static ModelFactory getInstancia() {
        if(instancia == null) {
            instancia = new ModelFactory();
        }
        return instancia;
    }
    private SistemaGestion inicializarDatos(){
        sistemaGestion= new SistemaGestion();
        Gerente empleado1= new Gerente();
        empleado1.setNombre("juan");
        empleado1.setIdEmpleado("150");
        empleado1.setDepartamento("Operacion");
        Tecnico empleado2= new Tecnico();
        empleado2.setNombre("fernando");
        empleado2.setIdEmpleado("948");
        empleado2.setDepartamento("Operacion");
        sistemaGestion.getListaGerentes().add(empleado1);
        sistemaGestion.getListaEmpleados().add(empleado1);
        sistemaGestion.getListaTecnicos().add(empleado2);
        sistemaGestion.getListaEmpleados().add(empleado2);
        Departamento departamento= new Departamento();
        Departamento departamento2= new Departamento();
        departamento.setNombre("Operacion");
        departamento.setCodigo("222");
        departamento2.setNombre("Recursos");
        departamento2.setCodigo("111");
        departamento.getListaDeEmpleados().add((Empleado) empleado1);
        departamento.getListaDeEmpleados().add((Empleado) empleado2);
        departamento2.getListaDeEmpleados().add((Empleado) empleado1);
        sistemaGestion.getListaDepartamentos().add(departamento);
        sistemaGestion.getListaDepartamentos().add(departamento2);
        Proyecto proyecto= new Proyecto();
        proyecto.setNombre("Maqueta");
        proyecto.setCodigo("333");
        proyecto.getListaDeGerente().add(empleado1);
        proyecto.getListaDeTecnico().add(empleado2);
        proyecto.getListaDeDepartamentos().add(departamento);
        proyecto.getListaDeDepartamentos().add(departamento2);
        sistemaGestion.getListaProyectos().add(proyecto);
        return sistemaGestion;
    }

    public SistemaGestion getSistemaGestion(){return sistemaGestion;}

    public String crearEmpleado(String nombre, String id, String departamento, int rol){
        return sistemaGestion.crearEmpleado(nombre,id,departamento,rol);
    }
    public String imprimirEmpleado(String id) {
        return sistemaGestion.imprimirEmpleado(id);
    }
    public String eliminarEmpleado(String id) {
        return sistemaGestion.eliminarEmpleado(id);
    }
    public String actualizarEmpleado(String id) {
        return sistemaGestion.actualizarEmpleado(id);
    }
    public String crearDepartamento(String nombre, String codigo){
        return sistemaGestion.crearDepartamento(nombre,codigo);
    }

    public String imprimirDepartamento(String codigo) {
        return sistemaGestion.imprimirDepartamento(codigo);
    }

    public String eliminarDepartamento(String codigo) {
        return sistemaGestion.eliminarDepartamento(codigo);
    }

    public String actualizarDepartamento(String codigo) {
        return sistemaGestion.actualizarDepartamento(codigo);
    }

    public String crearProyecto(String nombre, String codigo) {
        return sistemaGestion.crearProyecto(nombre,codigo);
    }

    public String imprimirProyecto(String codigo) {
        return sistemaGestion.imprimirProyecto(codigo);
    }

    public String eliminarProyecto(String codigo) {
        return sistemaGestion.eliminarProyecto(codigo);
    }

    public String actualizarProyecto(String codigo) {
        return sistemaGestion.actualizarProyecto(codigo);
    }

    public String asignarEmpleado(String id,String codigo){
        return sistemaGestion.asisgnacionEmpleados(id,codigo);
    }
    public String contribucionAProyectos(String id) {
        return sistemaGestion.contribucionAProyectos(id);
    }

    public String EmpleadosPorProyecto(String codigo) {
        return sistemaGestion.EmpleadosPorProyecto(codigo);
    }

    public String listaDepartamentosEnProyecto(String codigo) {
        return sistemaGestion.listaDepartamentosEnProyecto(codigo);
    }

    public String EmpleadosPorDepartamentos(String codigo) {
        return sistemaGestion.EmpleadosPorDepartamentos(codigo);
    }
}
